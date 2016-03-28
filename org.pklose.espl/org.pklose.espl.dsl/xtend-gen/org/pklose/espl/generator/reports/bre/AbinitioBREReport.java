package org.pklose.espl.generator.reports.bre;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.pklose.espl.abinitio.service.BusinessRule;

@SuppressWarnings("all")
public class AbinitioBREReport {
  private final Map<String, BusinessRule> specifiedBREs = new HashMap<String, BusinessRule>();
  
  private final Map<String, BusinessRule> implementedBREs = new HashMap<String, BusinessRule>();
  
  private final Workbook workBook = new XSSFWorkbook();
  
  public Sheet initWorkBook() {
    Sheet sheet = this.workBook.createSheet("Business Rule Report");
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
  
  public void fill(final Sheet sheet) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method fillBreRule(Row, int, String, String, String) is not applicable for the arguments (AbinitioBREReport)"
      + "\nType mismatch: cannot convert implicit first argument from AbinitioBREReport to Row");
  }
  
  public void findFieldOfBre(final Map<String, BusinessRule> businessRules, final String breName, final String entityName, final String fieldName) {
    BusinessRule bre = businessRules.get(breName);
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
