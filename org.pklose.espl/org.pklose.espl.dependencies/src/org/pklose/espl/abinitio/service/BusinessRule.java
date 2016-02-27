package org.pklose.espl.abinitio.service;

import com.google.gson.annotations.SerializedName;

public class BusinessRule {
	
	@SerializedName ("pretty_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
