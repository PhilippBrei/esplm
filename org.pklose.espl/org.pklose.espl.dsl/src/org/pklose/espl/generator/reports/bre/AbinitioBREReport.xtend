package org.pklose.espl.generator.reports.bre

import org.pklose.espl.abinitio.service.BusinessRule
import java.util.Map
import java.util.HashMap
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Row

class AbinitioBREReport {
	
	val Map<String, BusinessRule> specifiedBREs = new HashMap()
	val Map<String, BusinessRule> implementedBREs = new HashMap()
	
	val Workbook workBook = new XSSFWorkbook();
	
	def createReport () {
		var implementedSheet = initWorkBook("Implemented BREs")
		createHeadLine(implementedSheet)
		fill(implementedSheet, implementedBREs)
		
		var specifiedSheet = initWorkBook("Specified BREs")
		createHeadLine(specifiedSheet)
		fill(specifiedSheet, specifiedBREs)
		
		return workBook;
	}
	
	
	
	def initWorkBook (String name) {
		var sheet = workBook.createSheet(name)
		sheet.printGridlines = true;
		sheet.displayGridlines = true;
		return sheet;
	}
	
	
	
	def createHeadLine (Sheet sheet) {
		var headLine = sheet.createRow(0);	
		var expectedBreName = headLine.createCell(0);
		expectedBreName.cellValue = "Expected BRE Name";
				
		var expectedFieldBre = headLine.createCell(1);
		expectedFieldBre.cellValue = "Expected BRE Field";
		
		var expectedType = headLine.createCell(2);
		expectedType.cellValue = "Expected Field Type"
		
		var actualBreName = headLine.createCell(3);
		actualBreName.cellValue = "Actual BRE Name"
		
		var actualFieldBre = headLine.createCell(4);
		actualFieldBre.cellValue =  "Actual BRE Field"
		
		var actualType = headLine.createCell(5);
		actualType.cellValue = "Actual BRE Type"	
	}
	
	def fill (Sheet sheet, Map<String,BusinessRule> bres) {
		var int rowCounter = 1;
		for (breName : bres.keySet) {
			var currentBre = bres.get(breName);			
			for (entity : currentBre.inputElements) {				
				for (field : entity.fields) {
					var currentRow = sheet.createRow(rowCounter);
					fillBreRule(currentRow, rowCounter, currentBre.name, entity.name, field.name);
					rowCounter++;		
				}
				
			}		
			
		}
	}
	
	def findFieldOfBre (Map<String, BusinessRule> businessRules, String breName,String entityName, String fieldName) {
		var bre = businessRules.get(breName);
		var inputBre = bre.inputElements.findFirst[name.equals(entityName)];
		var firstField = inputBre.fields.findFirst[name.equals(fieldName)]
		return firstField;		
	}
	
	def fillBreRule (Row row, int start,String BRENameValue, String BREFieldValue, String BRETypeValue) {
		var expectedBreName = row.createCell(start);
		expectedBreName.cellValue = BRENameValue;
				
		var expectedFieldBre = row.createCell(start + 1);
		expectedFieldBre.cellValue = BREFieldValue
		
		var expectedType = row.createCell(start + 2);
		expectedType.cellValue = BRETypeValue
	}
	
	
	
	
	
	
	 
}