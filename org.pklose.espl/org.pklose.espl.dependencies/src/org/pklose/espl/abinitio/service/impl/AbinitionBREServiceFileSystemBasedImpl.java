package org.pklose.espl.abinitio.service.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.pklose.espl.abinitio.service.AbinitionBREService;
import org.pklose.espl.abinitio.service.BusinessRule;
import org.pklose.espl.abinitio.service.BusinessRuleEntity;
import org.pklose.espl.abinitio.service.BusinessRuleField;
import org.pklose.espl.abinitio.service.model.BusinessRuleInputMetaInformation;
import org.pklose.espl.abinitio.service.model.BusinessRuleMetaInformation;
import org.pklose.espl.abinitio.service.model.BusinessRuleVariableMetaInformation;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class AbinitionBREServiceFileSystemBasedImpl implements AbinitionBREService {
	
	private final Gson gson = new Gson();

	@Override
	public BusinessRule getBusinessRuleMetaInformation(String BusinessRuleName) {
		try {
			BusinessRuleMetaInformation breMetaInformation = parseRule(getRessourceAsURL(BusinessRuleName).getFile());
			return transform (breMetaInformation);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}		
	}
	
	private BusinessRule transform (BusinessRuleMetaInformation breMetaInformation) {
		BusinessRule businessRule = new BusinessRule(breMetaInformation.getName(), new ArrayList<>());
		
		for (BusinessRuleInputMetaInformation inputMetaInformation : breMetaInformation.getInputs()) {
			 
			for (int i = 0; i < inputMetaInformation.getVariables().size(); i++) {
				BusinessRuleVariableMetaInformation businessRuleVariableMetaInformation = inputMetaInformation.getVariables().get(i);
				
				if (businessRuleVariableMetaInformation.getSubFields() > 0) {
					BusinessRuleEntity businessRuleEntity = new BusinessRuleEntity(businessRuleVariableMetaInformation.getName());
					
					if ((i + 1) < inputMetaInformation.getVariables().size() && 
							inputMetaInformation.getVariables().get(i + 1).getSubFields() == 0) {
						i++;
						
						for (int k = 0;i < inputMetaInformation.getVariables().size() && k < businessRuleVariableMetaInformation.getSubFields();k++) {
							BusinessRuleVariableMetaInformation breSubRecord = inputMetaInformation.getVariables().get(i);
							businessRuleEntity.getFields().add(new BusinessRuleField(breSubRecord.getName()));
							i++;
						}
					}
					
					businessRule.getInputElements().add(businessRuleEntity);
					
				}
			}
			
		}
		
		
		return businessRule;
		
	}
	
	
	
	public BusinessRuleMetaInformation parseRule (String file) throws FileNotFoundException {
		JsonReader jsonReader = new JsonReader(new FileReader(file));		
		JsonParser jsonParser = new JsonParser();
		JsonObject parsedElement = (JsonObject) jsonParser.parse(jsonReader);
		JsonObject jsonBRERule = parsedElement.getAsJsonObject("ruleset");
		BusinessRuleMetaInformation rule = gson.fromJson(jsonBRERule, BusinessRuleMetaInformation.class);		
		return rule;		
	}
	
	public URL getRessourceAsURL (String name) {
		return getClass().getClassLoader().getResource("assets/" + name + ".json");		
	}
	
	

}
