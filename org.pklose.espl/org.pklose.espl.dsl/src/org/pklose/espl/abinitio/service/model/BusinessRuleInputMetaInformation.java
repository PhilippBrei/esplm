package org.pklose.espl.abinitio.service.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BusinessRuleInputMetaInformation {
	
	@SerializedName("bzname")
	private String name;
	
	@SerializedName("varbls")
	private List<BusinessRuleVariableMetaInformation> variables;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusinessRuleVariableMetaInformation> getVariables() {
		return variables;
	}

	public void setVariables(List<BusinessRuleVariableMetaInformation> variables) {
		this.variables = variables;
	}
	
	

}
