package utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

          static Workbook book;  //local variable so can use in
            static Sheet sheet;

            // this method will open excel book

    public static void openExcel(String filepath){

        try {
            FileInputStream fis=new FileInputStream(filepath);
                book=new XSSFWorkbook(fis);// .xls -----> HSSF xlsx---->XSSF FOR WORKING WITH LIBRARY



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
//this method will open excel sheet
public static void getSheet(String sheetName){
        //open sheet
        sheet=book.getSheet(sheetName);
        //
}
//this method will give the row count
public static int getRowCount(){
        return sheet.getPhysicalNumberOfRows();
}
//this method will give the column count
public static int getColsCount(int rowIndex){//no method to call coumn number
        return sheet.getRow(rowIndex).getPhysicalNumberOfCells();//getting diffrent number of colun for every row
}

//this method give the cell data
public static String getCellData(int rowIndex, int colIndex){
        return  sheet.getRow(rowIndex).getCell(colIndex).toString();//cell data into string format

    }

//this method will return list of maps havong all the data from ecvel file
    public static List<Map<String,String>>excelListIntoMap(String filePath,String sheetname ){
        openExcel(filePath);// opening file
        getSheet(sheetname);//getting sheet
//creating a list of maps for all the rows
        List<Map<String,String>> listData=new ArrayList<>();//for data container

        //loops...outer loop take care of rows
        for (int row=1; row<getRowCount(); row++)//zero row is key so starting from 1st
        {
            //creating the map for every row
            Map<String,String>map=new LinkedHashMap<>();
//for every row column is chaning
                for (int col=0; col<getColsCount(row); col++){
                    map.put(getCellData(0,col),getCellData(row,col));//key will be same as heading  n value will change combination
                    //now we are getting row same column changing and generating map
                    //


        }
                //for next map  we save this map in list of map
            listData.add(map);
        }
        return listData;//return all data that is list of all maps form
    }







}
