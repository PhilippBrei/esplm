package org.pklose.espl.abinitio.service.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

import org.pklose.espl.abinitio.service.AbinitionBREService;
import org.pklose.espl.abinitio.service.BusinessRule;
import org.pklose.espl.abinitio.service.model.BusinessRuleInputMetaInformation;
import org.pklose.espl.abinitio.service.model.BusinessRuleMetaInformation;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class AbinitionBREServiceFileSystemBasedImpl implements AbinitionBREService {
	
	private final Gson gson = new Gson();

	@Override
	public BusinessRuleMetaInformation getBusinessRuleMetaInformation(String BusinessRuleName) {
		
		
		return null;
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
