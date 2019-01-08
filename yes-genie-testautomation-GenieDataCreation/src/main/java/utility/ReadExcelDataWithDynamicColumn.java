package utility;

import net.sf.json.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ReadExcelDataWithDynamicColumn {

    public static void creteJSONAndTextFileFromExcel(String filePath)
    {
        try{

            FileInputStream fInputStream = new FileInputStream(filePath.trim());
            Workbook excelWorkBook =  new HSSFWorkbook(fInputStream);
            int totalSheetNumber = excelWorkBook.getNumberOfSheets();
            for(int i=0;i<totalSheetNumber;i++)
            {
                Sheet sheet = excelWorkBook.getSheetAt(i);
                String sheetName = sheet.getSheetName();
                if(sheetName != null && sheetName.length() > 0)
                {
                    List<List<String>> sheetDataTable = getSheetDataList(sheet);
                    String jsonString = getJSONStringFromList(sheetDataTable);
                    String jsonFileName = "JsonFile.json";
                    writeStringToFile(jsonString, jsonFileName);
                    String textTableString = getTextTableStringFromList(sheetDataTable);
                    String textTableFileName =  "JsonFile.txt";
                    writeStringToFile(textTableString, textTableFileName);
                }
            }
            excelWorkBook.close();
        }catch(Exception ex){
            System.err.println("Exception in file format, check for spaces or blank field in the file");
            ex.printStackTrace();
        }
    }


    private static List<List<String>> getSheetDataList(Sheet sheet)
    {
        List<List<String>> ret = new ArrayList<List<String>>();
        int firstRowNum = sheet.getFirstRowNum();
        int lastRowNum = sheet.getLastRowNum();
        if(lastRowNum > 0)
        {
            for(int i=firstRowNum; i<lastRowNum + 1; i++)
            {
                Row row = sheet.getRow(i);
                int firstCellNum = row.getFirstCellNum();
                int lastCellNum = row.getLastCellNum();
                List<String> rowDataList = new ArrayList<String>();
                for(int j = firstCellNum; j < lastCellNum; j++)
                {
                    Cell cell = row.getCell(j);
                    System.out.println("cell is " +cell);
                    int cellType = cell.getCellType();
                    System.out.println(cellType + "is celltype");
                    if(cellType == CellType.NUMERIC.getCode())
                    {
                        if (String.valueOf(cell).contains("-")){
                            String cellValue = new DataFormatter().formatCellValue(cell);
                            rowDataList.add(cellValue);
                        }
                        else {
                            double numberValue = cell.getNumericCellValue();
                            System.out.println("double value is " +numberValue);
                            String stringCellValue = BigDecimal.valueOf(numberValue).toPlainString();
                            rowDataList.add((stringCellValue));
                        }
                    }else if(cellType == CellType.STRING.getCode())
                    {
                        String cellValue = cell.getStringCellValue();
                        rowDataList.add(cellValue);
                    }else if(cellType == CellType.BOOLEAN.getCode())
                    {
                        boolean numberValue = cell.getBooleanCellValue();
                        String stringCellValue = String.valueOf(numberValue).toLowerCase();
                        rowDataList.add(stringCellValue);
                    }
                    else if(cellType == CellType.BLANK.getCode())
                    {
                        rowDataList.add("");
                    }
                    else{
                        boolean numberValue = cell.getBooleanCellValue();
                        String stringCellValue = String.valueOf(numberValue).toLowerCase();
                        rowDataList.add(stringCellValue);
                    }
                }
                ret.add(rowDataList);
            }
        }
        return ret;
    }


    private static String getJSONStringFromList(List<List<String>> dataTable)
    {
        String ret = "";
        if(dataTable != null)
        {
            int rowCount = dataTable.size();
            if(rowCount > 1)
            {
                JSONObject tableJsonObject = new JSONObject();
                JSONObject rowJsonObject = new JSONObject();
                List<String> headerRow = dataTable.get(0);
                int columnCount = headerRow.size();
                for(int i=1; i<rowCount; i++)
                {
                    List<String> dataRow = dataTable.get(i);
                    rowJsonObject = new JSONObject();
                    for(int j=0;j<columnCount;j++)
                    {
                        String columnName = headerRow.get(j);
                        String columnValue;
                        if (dataRow.get(j) == null || dataRow.get(j)==" "){
                            columnValue=null;
                        }
                        else{
                            columnValue = dataRow.get(j);
                        }
                        rowJsonObject.put(columnName, columnValue);
                    }
                    tableJsonObject.put("row"+i, rowJsonObject);
                }
                ret = tableJsonObject.toString();
            }
        }
        return ret;
    }


    private static String getTextTableStringFromList(List<List<String>> dataTable)
    {
        StringBuffer strBuf = new StringBuffer();
        if(dataTable != null)
        {
            int rowCount = dataTable.size();
            for(int i=0;i<rowCount;i++)
            {
                List<String> row = dataTable.get(i);
                int columnCount = row.size();
                for(int j=0;j<columnCount;j++)
                {
                    String column = row.get(j);
                    strBuf.append(column);
                    strBuf.append("    ");
                }
                strBuf.append("\r\n");
            }

        }
        return strBuf.toString();
    }


    private static void writeStringToFile(String data, String fileName)
    {
        try
        {
            String currentWorkingFolder = System.getProperty("user.dir");
            String filePathSeperator = System.getProperty("file.separator")+"/src/test/resources/";
            String filePath = currentWorkingFolder + filePathSeperator + fileName;
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter buffWriter = new BufferedWriter(fw);
            buffWriter.write(data);
            buffWriter.flush();
            buffWriter.close();
            System.out.println(filePath + " has been created.");
        }catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}

