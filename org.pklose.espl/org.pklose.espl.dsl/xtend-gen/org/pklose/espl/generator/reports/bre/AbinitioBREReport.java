package org.pklose.espl.generator.reports.bre;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.pklose.espl.abinitio.service.BusinessRule;
import org.pklose.espl.abinitio.service.BusinessRuleEntity;
import org.pklose.espl.abinitio.service.BusinessRuleField;

@SuppressWarnings("all")
public class AbinitioBREReport {
  private final Map<String, BusinessRule> specifiedBREs = new HashMap<String, BusinessRule>();
  
  private final Map<String, BusinessRule> implementedBREs = new HashMap<String, BusinessRule>();
  
  private final Workbook workBook = new XSSFWorkbook();
  
  public Workbook createReport() {
    Sheet implementedSheet = this.initWorkBook("Implemented BREs");
    this.createHeadLine(implementedSheet);
    this.fill(implementedSheet, this.implementedBREs);
    Sheet specifiedSheet = this.initWorkBook("Specified BREs");
    this.createHeadLine(specifiedSheet);
    this.fill(specifiedSheet, this.specifiedBREs);
    return this.workBook;
  }
  
  public Sheet initWorkBook(final String name) {
    Sheet sheet = this.workBook.createSheet(name);
    sheet.setPrintGridlines(true);
    sheet.setDisplayGridlines(true);
    return sheet;
  }
  
  public void createHeadLine(final Sheet sheet) {
    Row headLine = sheet.createRow(0);
    Cell expectedBreName = headLine.createCell(0);
    expectedBreName.setCellValue("Expected BRE Name");
    Cell expectedFieldBre = headLine.createCell(1);
    expectedFieldBre.setCellValue("Expected BRE Field");
    Cell expectedType = headLine.createCell(2);
    expectedType.setCellValue("Expected Field Type");
    Cell actualBreName = headLine.createCell(3);
    actualBreName.setCellValue("Actual BRE Name");
    Cell actualFieldBre = headLine.createCell(4);
    actualFieldBre.setCellValue("Actual BRE Field");
    Cell actualType = headLine.createCell(5);
    actualType.setCellValue("Actual BRE Type");
  }
  
  public void fill(final Sheet sheet, final Map<String, BusinessRule> bres) {
    int rowCounter = 1;
    Set<String> _keySet = bres.keySet();
    for (final String breName : _keySet) {
      {
        BusinessRule currentBre = bres.get(breName);
        List<BusinessRuleEntity> _inputElements = currentBre.getInputElements();
        for (final BusinessRuleEntity entity : _inputElements) {
          List<BusinessRuleField> _fields = entity.getFields();
          for (final BusinessRuleField field : _fields) {
            {
              Row currentRow = sheet.createRow(rowCounter);
              String _name = currentBre.getName();
              String _name_1 = entity.getName();
              String _name_2 = field.getName();
              this.fillBreRule(currentRow, rowCounter, _name, _name_1, _name_2);
              rowCounter++;
            }
          }
        }
      }
    }
  }
  
  public BusinessRuleField findFieldOfBre(final Map<String, BusinessRule> businessRules, final String breName, final String entityName, final String fieldName) {
    BusinessRule bre = businessRules.get(breName);
    List<BusinessRuleEntity> _inputElements = bre.getInputElements();
    final Function1<BusinessRuleEntity, Boolean> _function = (BusinessRuleEntity it) -> {
      String _name = it.getName();
      return Boolean.valueOf(_name.equals(entityName));
    };
    BusinessRuleEntity inputBre = IterableExtensions.<BusinessRuleEntity>findFirst(_inputElements, _function);
    List<BusinessRuleField> _fields = inputBre.getFields();
    final Function1<BusinessRuleField, Boolean> _function_1 = (BusinessRuleField it) -> {
      String _name = it.getName();
      return Boolean.valueOf(_name.equals(fieldName));
    };
    BusinessRuleField firstField = IterableExtensions.<BusinessRuleField>findFirst(_fields, _function_1);
    return firstField;
  }
  
  public void fillBreRule(final Row row, final int start, final String BRENameValue, final String BREFieldValue, final String BRETypeValue) {
    Cell expectedBreName = row.createCell(start);
    expectedBreName.setCellValue(BRENameValue);
    Cell expectedFieldBre = row.createCell((start + 1));
    expectedFieldBre.setCellValue(BREFieldValue);
    Cell expectedType = row.createCell((start + 2));
    expectedType.setCellValue(BRETypeValue);
  }
}
