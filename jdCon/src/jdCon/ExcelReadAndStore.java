package jdCon;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReadAndStore {
	static Logger log = Logger.getLogger(ExcelReadAndStore.class.getName());
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		log.info("_____________________________"); 
		log.info("________Start-Excel_______"); 
		long start = System.currentTimeMillis();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		FileInputStream fis=new FileInputStream("C:/Users/sai krishna/Desktop/Students.xlsx");  
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheetAt(1);
		Iterator<Row> rowIt = sheet.iterator();
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
			System.out.println("connection established");
			 PreparedStatement statement = con.prepareStatement("insert into students values(?,?,?,?)");
			 rowIt.next();
			  while (rowIt.hasNext()) {
	                Row nextRow = rowIt.next();
	                Iterator<Cell> cellIterator = nextRow.cellIterator();
	 
	                while (cellIterator.hasNext()) {
	                    Cell nextCell = cellIterator.next();
	 
	                    int columnIndex = nextCell.getColumnIndex();
	 
	                    switch (columnIndex) {
	                    case 0:
	                    	System.out.println("one");
	                    	int id = (int) nextCell.getNumericCellValue();
	                        statement.setInt(1, id);
	                        break;
	                    case 1:
	                    	System.out.println("two");
	                    	String name = nextCell.getStringCellValue();
	                        statement.setString(2, name);
	                        break;
	                    case 2:
	                    	System.out.println("three");
	                    	int age = (int) nextCell.getNumericCellValue();
	                        statement.setInt(3, age);
	                        break;
	                    case 3:
	                    	System.out.println("four");
	                    	String roll = nextCell.getStringCellValue();
	                        statement.setString(4, roll);
	                        break;
	                    }
	 
	                }
	                 
	                statement.addBatch();
	                 
//	                if (count % batchSize == 0) {
//	                    statement.executeBatch();
//	                }              
	                statement.executeBatch();
	               
	            }
			  long end = System.currentTimeMillis();
			  log.info("_____________________________"); 
				log.info("________End-Excel_______");
              System.out.printf("Import done in %d sec\n", ((end - start)));
              log.info((end - start));
              System.out.printf("Import done in %d sec\n", ((end - start)));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		}
			
	 
		
	}


