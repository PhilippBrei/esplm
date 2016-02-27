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

}
