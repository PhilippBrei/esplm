package org.pklose.espl.abinitio.service.model;

import com.google.gson.annotations.SerializedName;

public class BusinessRuleVariableMetaInformation {
	
	@SerializedName("bzname")
	private String name;
	
	private String vartype;
	
	@SerializedName("hidden")
	private Integer isHidden;
	
	@SerializedName ("num_subfields")
	private Integer subFields;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVartype() {
		return vartype;
	}

	public void setVartype(String vartype) {
		this.vartype = vartype;
	}

	public Integer getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Integer isHidden) {
		this.isHidden = isHidden;
	}

	public Integer getSubFields() {
		return subFields;
	}

	public void setSubFields(Integer subFields) {
		this.subFields = subFields;
	}

	@Override
	public String toString() {
		return "BusinessRuleVariableMetaInformation [name=" + name + ", vartype=" + vartype + ", isHidden=" + isHidden
				+ ", subFields=" + subFields + "]";
	}
	
	
	
	

}
