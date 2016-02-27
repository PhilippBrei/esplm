package org.pklose.espl.abinitio.service.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BusinessRuleInputMetaInformation {
	
	@SerializedName("bzname")
	private String name;
	
	@SerializedName("varbls")
	private List<BusinessRuleVariableMetaInformation> variables;

}
