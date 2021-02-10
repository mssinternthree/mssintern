import java.io.*;
import java.sql.*;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ExcelToDB {
	
	static Logger log = Logger.getLogger(ExcelToDB.class.getName());
	
	public static void main(String...args) throws Exception{
		 long start = System.currentTimeMillis();
		 Class.forName("com.mysql.jdbc.Driver");
		 Bank_DB obj=new Bank_DB();
		 Connection con=null;
		 Scanner  sc=new Scanner(System.in);
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject","root","ashu23456");
		 System.out.println("Connection Established!");
         
         FileInputStream fis=new FileInputStream("D:/Softwares/java_projects/SQLEXAMPLE/sample.xlsx");  
 		 XSSFWorkbook wb=new XSSFWorkbook(fis);
 		 Sheet sheet=wb.getSheetAt(0);
 		 Iterator<Row> rowIterator = sheet.iterator();
		 
		 PreparedStatement statement = con.prepareStatement("INSERT INTO students (eid,ename,sal) VALUES (?, ?, ?)");
         
         rowIterator.next();
         
         while (rowIterator.hasNext()) {
             Row nextRow = rowIterator.next();
             Iterator<Cell> cellIterator = nextRow.cellIterator();

             while (cellIterator.hasNext()) {
                 Cell nextCell = cellIterator.next();
                 int columnIndex = nextCell.getColumnIndex();

                 switch (columnIndex) {
                 case 0:
                     int eid = (int) nextCell.getNumericCellValue();
                     statement.setInt(1, eid);
                     break;
                 case 1:
                     String ename = nextCell.getStringCellValue();
                     statement.setString(2, ename);
                     break;
                 case 2:
                     int sal = (int) nextCell.getNumericCellValue();
                     statement.setInt(3, sal);
                     break;
                 }

             }        
             statement.addBatch();           
         }
         statement.executeBatch();

         wb.close();
         long end = System.currentTimeMillis();
         
         System.out.println("Query Completed");
         log.info("The sheet's data copied to DB in : "+ (end-start) +" milisecs.");
         
         con.close();
	}
}
