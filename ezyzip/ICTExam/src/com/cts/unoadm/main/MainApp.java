package com.cts.unoadm.main;

import com.cts.unoadm.dao.StudentAdmissionDAO;

import com.cts.unoadm.exception.StudentAdmissionException;
import com.cts.unoadm.service.StudentAdmissionService;
//import com.cts.unoadm.exception.StudentAdmissionException;

public class MainApp{
  public static void main(String[] args) throws StudentAdmissionException{
  //   new SkeletonValidator();
     StudentAdmissionService studentAdmissionService=new StudentAdmissionService();
     try{
       studentAdmissionService.addStudentAdmissionDetails("inputFeed.txt"); 
     }catch(StudentAdmissionException e){
      e.printStackTrace();
     }
     StudentAdmissionDAO studentAdmissionDAO=new StudentAdmissionDAO();
     studentAdmissionDAO.getAllStudentAdmissionDetails();
     //Skeletonvalidation ends
     studentAdmissionService.searchStudentAdmission("A001");
     
   }
}
