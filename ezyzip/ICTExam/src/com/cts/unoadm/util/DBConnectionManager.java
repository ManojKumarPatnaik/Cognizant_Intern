package com.cts.unoadm.util;

//import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.exception.StudentAdmissionException;
//import com.cts.unoadm.util.DBConnectionManager;
//import com.cts.unoadm.vo.StudentAdmission;
//import com.cts.unoadm.;

import java.io.*;
import java.sql.*;
import java.util.*;
public class DBConnectionManager {
	public static final String PROPERTY_FILE="database.properties";
  public static final String DRIVER="drivername";
  public static final String URL="url";
  public static final String USER_NAME="username";
  public static final String PASSWORD="password";
  private static Connection connection=null;
  private static Properties props=null;
 // private static DBConnectionManager instance=null;
  private DBConnectionManager() throws StudentAdmissionException
  {
	  loadProperties();
	  try
	  {
		  Class.forName(props.getProperty(DRIVER));
		  DBConnectionManager.connection=DriverManager.getConnection(props.getProperty(URL),props.getProperty(USER_NAME),props.getProperty(PASSWORD));
	  }
	  catch(ClassNotFoundException e)
	  {
		  throw new StudentAdmissionException("Could not find driver class",e.getCause());
	  }
	  catch(SQLException ex)
	  {
		  throw new StudentAdmissionException("Database Connection Creation Failed",ex.getCause());
	  }
  }
  public Connection getConnection()
  {
	  return connection;
  }
  public static DBConnectionManager getInstance() throws StudentAdmissionException
  {
	  return new DBConnectionManager();
	  
  }
  private void loadProperties()throws StudentAdmissionException
  {
	  FileInputStream inputStream=null;
	  try
	  {
		inputStream=new FileInputStream(PROPERTY_FILE);
		props=new Properties();
		props.load(inputStream);
	  }catch(FileNotFoundException e) 
	  {
	  throw new StudentAdmissionException("Database not found",e.getCause());
	  }catch(IOException e)
	  {
		  throw new StudentAdmissionException("Exception during property file I/O",e.getCause());
	  }
	  finally
	  {
		  if(inputStream!=null)
		  {
			  try
			  {
				  inputStream.close();
			  }catch(IOException es)
			  {
				  throw new StudentAdmissionException("Exception during property file I/O",es.getCause());
			  }
		  }
	  }
  }
  
}
