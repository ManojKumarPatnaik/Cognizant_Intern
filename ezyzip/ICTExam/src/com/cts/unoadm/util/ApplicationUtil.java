package com.cts.unoadm.util;
import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.exception.StudentAdmissionException;
//import com.cts.unoadm.util.DBConnectionManager;
//import com.cts.unoadm.vo.StudentAdmission;
//import com.cts.unoadm.;
import java.util.*;
import java.io.*;
import java.text.*;
public class ApplicationUtil {
  private static BufferedReader bufferedReader;
public static List<String> readFile(String fileName) throws StudentAdmissionException
  {
	  List<String> studentAdmissionList=new ArrayList<String>();
	  try {
		  bufferedReader = new BufferedReader(new FileReader(fileName));
		  String s;
		  while((s=bufferedReader.readLine())!=null)
		  {
			  if(s.contains("Approved"))
			  {
				  String s1[]=s.split(",");
				  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				  Date d1=sdf.parse(s1[2]);
				  Date d2=sdf.parse(s1[4]);
				  long diffint=((d2.getTime()-d1.getTime())/(1000*60*60*24))%365;
				  if(diffint<=10)
				  {
					  studentAdmissionList.add(s);
				  }
			  }
		  }
	  }catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  catch(ParseException e)
	  {
		  e.printStackTrace();
	  }
	  return studentAdmissionList;
  }
  /*public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate)
  {
	  java.sql.Date sDate=new java.sql.Date(uDate.getTime());
	return sDate;  
  }*/
  public static Date convertStringToDate(String inDate)
  {
	  SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	  dateFormat.setLenient(false);
	  try
	  {
		  return dateFormat.parse(inDate);
	  }
	  catch(ParseException pe)
	  {
		  return null;
	  }
  }
  public static boolean checkIfValidAdmission(Date dtOfCounseling,Date dtOfAdmission,String manager)
  {
	  boolean admissionValidity=false;
	  return admissionValidity;
  }
public static java.sql.Date convertUtilToSqlDate(Date dateOfAdmission) {
	// TODO Auto-generated method stub
	java.sql.Date sDate=new java.sql.Date(dateOfAdmission.getTime());
	return sDate;
}

}
