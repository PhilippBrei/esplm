package org.pklose.espl.abinitio.service;

import java.util.ArrayList;
import java.util.List;

public class BusinessRule {
	
	private final String name;
	
	private List<BusinessRuleEntity> inputElements = new ArrayList<>();
	
	
	public BusinessRule(String name, List<BusinessRuleEntity> inputElements) {
		super();
		this.name = name;
		this.inputElements = inputElements;
	}

	public List<BusinessRuleEntity> getInputElements() {
		return inputElements;
	}

	public void setInputElements(List<BusinessRuleEntity> inputElements) {
		this.inputElements = inputElements;
	}

	public String getName() {
		return name;
	}
	
	

}
