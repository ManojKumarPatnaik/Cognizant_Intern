package com.cts.unoadm.service;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.exception.StudentAdmissionException;
import com.cts.unoadm.util.DBConnectionManager;
import com.cts.unoadm.vo.StudentAdmission;
import com.cts.unoadm.dao.StudentAdmissionDAO;
//import com.cts.unoadm.;
public class StudentAdmissionService {
 public static List<StudentAdmission> buildStudentAdmissionList(List<String> studentAdmissionRecords) throws ParseException
 {
	 List<StudentAdmission> studentAdmissionList=new ArrayList<StudentAdmission>();
     for(int i=0;i<studentAdmissionRecords.size();i++)
     {
    	 String sss[]=studentAdmissionRecords.get(i).split(",");
    	 double admission_fee=30000;
    	 double tutionfess=0;
    	 double hostelfess=0;
    	 double first=0;
    	 if(sss[5].equalsIgnoreCase("yes"))
    	 {
    		 hostelfess=75000;
    	 }
    	 if(sss[6].equalsIgnoreCase("yes"))
    	 {
    		 first=20000;
    	 }
    	 if(sss[3].equalsIgnoreCase("eee")||sss[3].equalsIgnoreCase("cse")||sss[3].equalsIgnoreCase("it"))
    	 {
    		 tutionfess=50000;
    	 }
    	 if(sss[3].equalsIgnoreCase("mech"))
    	 {
    		 tutionfess=55000;
    	 }
    	 studentAdmissionList.add(new StudentAdmission(sss[0],sss[1],ApplicationUtil.convertStringToDate(sss[2]),sss[3],ApplicationUtil.convertStringToDate(sss[4]),sss[5],sss[6],sss[7],admission_fee,tutionfess,hostelfess,(admission_fee+tutionfess+hostelfess-first),"AdmissionSuccesful"));
     }
	 return studentAdmissionList;
 }
 public boolean addStudentAdmissionDetails(String inputFeed) throws StudentAdmissionException
 {
	 List<String> ss=ApplicationUtil.readFile(inputFeed);
	 List<StudentAdmission> studentAdmissionList=null;
	 try
	 {
		 studentAdmissionList=buildStudentAdmissionList(ss);
	 }catch(ParseException e)
	 {
		 e.printStackTrace();
	 }
	 System.out.println(studentAdmissionList.get(0));
	 StudentAdmissionDAO studentAdmissionDAO=new StudentAdmissionDAO();
	 studentAdmissionDAO.addStudentAdmissionDetails(studentAdmissionList);
	return false;
 }
 public static double[] calculateTotalCollegeFee(String preferCollegeHostel, String firstGraduate,String departmentName)
 {
	 double[] studentAdmissionCosts=new double[4];
	 return studentAdmissionCosts; 
 }

public boolean searchStudentAdmission(String admissionId) throws StudentAdmissionException {
	// TODO Auto-generated method stub
	boolean st=false;
	 DBConnectionManager dbConnectionManager=DBConnectionManager.getInstance();
	 Connection con=dbConnectionManager.getConnection();
	 try
	 {
		// Statement ss=con.createStatement();
		 System.out.println(admissionId);
		 String s="select * from uno_admission.uno_admission where admission_id=?";
		 PreparedStatement preparedstatement=con.prepareStatement(s);
		 preparedstatement.setString(1, admissionId);
		 System.out.println(s);
		 ResultSet r=preparedstatement.executeQuery();
		 while(r.next())
		 {
			 StudentAdmission ss123=new StudentAdmission(r.getString(1),r.getString(2),r.getDate(3),r.getString(4),r.getDate(5),r.getString(6),r.getString(7),r.getString(8),r.getDouble(9),r.getDouble(10),r.getDouble(11),r.getDouble(12),r.getString(13));
			 System.out.println(ss123);
		 }
	 }catch(SQLException throwables)
	 {
		 throwables.printStackTrace();
	 }
	return st;
}
}
