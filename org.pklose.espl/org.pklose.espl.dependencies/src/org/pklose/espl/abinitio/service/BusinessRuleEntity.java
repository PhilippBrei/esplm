package org.pklose.espl.abinitio.service;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEntity {
	
	private final String name;
	
	private List<BusinessRuleField> fields = new ArrayList<> ();

	public BusinessRuleEntity(String name) {
		super();
		this.name = name;
	}

	public List<BusinessRuleField> getFields() {
		return fields;
	}

	public void setFields(List<BusinessRuleField> fields) {
		this.fields = fields;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "BusinessRuleEntity [name=" + name + "]";
	}
	
	
}
