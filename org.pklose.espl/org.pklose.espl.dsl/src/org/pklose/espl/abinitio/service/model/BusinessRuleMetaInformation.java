package org.pklose.espl.abinitio.service.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BusinessRuleMetaInformation {
	
	@SerializedName ("pretty_name")
	private String name;
	
	@SerializedName ("inputs")
	private List<BusinessRuleInputMetaInformation> inputs;

	public List<BusinessRuleInputMetaInformation> getInputs() {
		return inputs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
