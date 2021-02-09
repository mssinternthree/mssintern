package jdCon;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;  
public class LogExample{  
	  
	   /* Get the class name to be printed on */  
	   static Logger log = Logger.getLogger(LogExample.class.getName());  
	     
	   public static void main(String[] args)throws IOException,SQLException{  
	      log.debug("Hello tsage");  
	      log.info("Hello tmessage");  
	   }  
	}  
