package Dataprovider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderExcel {

    @DataProvider(name="getData")
    public Object[][] getData()  {

        String folder = System.getProperty("user.dir");
        String filename = folder+"\\src\\main\\resources\\data.xlsx";
        Object[][] arrayObject = getExcelData(filename, "pancards");
        return arrayObject;
    }

    public Object [][] getExcelData(String filePath, String sheetName){
        Object[][] data = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(1);
            int totalRows = sheet.getLastRowNum();
            int totalColumns = row.getLastCellNum();

            System.out.println("Total rows in sheet are " + totalRows);
            System.out.println("Total columns in sheet are " + totalColumns);

            data = new Object[totalRows - 1][totalColumns ];

            for (int i = 1; i < totalRows; i++) {
                row = sheet.getRow(i);
                System.out.println("current row is  " +i);

                for (int j = 0; j < totalColumns; j++) {
                    XSSFCell cell = row.getCell(j);
                 if( cell.getCellType().toString().equalsIgnoreCase("NUMERIC")){
                        data[i - 1][j] = (int)cell.getNumericCellValue();
                    }
                    else{
                        data[i - 1][j] = cell.getStringCellValue();
                }
            }
        }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return data;
    }


}
