package org.pklose.espl.generator.reports.bre

import java.util.Collection
import java.util.Map
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.pklose.espl.esplm.BusinessRule
import org.pklose.espl.esplm.Entity
import java.io.File
import java.io.FileOutputStream

class AbinitioBREReport {
	
	val Map<String, BusinessRule> specifiedBREs; 
	val Map<String, BusinessRule> implementedBREs;
	
	val Workbook workBook = new XSSFWorkbook();
	
	new (Collection<BusinessRule> specifiedBres, Collection<BusinessRule> implementedBres) {
		this.specifiedBREs = specifiedBres.toMap[name];
		this.implementedBREs = implementedBres.toMap[name];
	}
	
	def Workbook createReport () {
		var implementedSheet = initWorkBook("Implemented BREs")
		createHeadLine(implementedSheet)
		fill(implementedSheet, implementedBREs)
		
		var specifiedSheet = initWorkBook("Specified BREs")
		createHeadLine(specifiedSheet)
		fill(specifiedSheet, specifiedBREs)
		
		return workBook;
	}
	
	def Workbook createReport (File file) {
		var wb = createReport();
		var out = new FileOutputStream(file);
		wb.write(out);		
		return wb;
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
			for (entity : currentBre.inputs) {
				if (entity instanceof Entity) {
					var myEntity = entity as Entity
					for (field : myEntity.properties.filter(typeof(org.pklose.espl.esplm.Property)).toList) {
						var row = sheet.createRow(rowCounter);
						fillBreRule(row, rowCounter, breName, field.name, "input");
						rowCounter++;
					}
				}
				
			}		
			
		}
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