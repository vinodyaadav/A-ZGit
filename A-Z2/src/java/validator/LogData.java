/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Shekhar
 */
public class LogData {
 //String SLASH ="\\";  //For windows
 String SLASH ="/"; //For linux
    
   public String getModulePath() throws IOException{
        java.net.URL path=LogData.class.getResource("/");
        String filePath = path.toString();
      filePath=filePath.substring(filePath.lastIndexOf(":/")-1,filePath.indexOf("WEB-INF"));   //windows
   // filePath=filePath.substring(filePath.lastIndexOf(":")+1,filePath.indexOf("WEB-INF"));   //For linux
        return filePath;
    }

    
public static void main(String args[]){
    try{
    LogData ld=new LogData();
    String filePath=ld.getModulePath();
    System.out.println("File path ="+filePath);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
