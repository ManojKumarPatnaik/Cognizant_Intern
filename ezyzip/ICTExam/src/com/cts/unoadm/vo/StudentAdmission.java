package com.cts.unoadm.vo;

import java.util.Date;
public class StudentAdmission {
	String admissionId;
	String studentCode;
	Date dateOfCounseling;
	String departmentName;
	Date dateOfAdmission;
	String preferCollegeHostel;
	String firstGraduate;
	String managerApproval;
	double admissionFee;
	double tutionFee;
	double hostelFee;
	double totalCollegeFee;
	String finalStatusOfAdmission;
	public StudentAdmission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAdmission(String admissionId, String studentCode, Date dateOfCounseling, String departmentName,
			Date dateOfAdmission, String preferCollegeHostel, String firstGraduate, String managerApproval,
			double admissionFee, double tutionFee, double hostelFee, double totalCollegeFee,
			String finalStatusOfAdmission) 
	{
		super();
		this.admissionId = admissionId;
		this.studentCode = studentCode;
		this.dateOfCounseling = dateOfCounseling;
		this.departmentName = departmentName;
		this.dateOfAdmission = dateOfAdmission;
		this.preferCollegeHostel = preferCollegeHostel;
		this.firstGraduate = firstGraduate;
		this.managerApproval = managerApproval;
		this.admissionFee = admissionFee;
		this.tutionFee = tutionFee;
		this.hostelFee = hostelFee;
		this.totalCollegeFee = totalCollegeFee;
		this.finalStatusOfAdmission = finalStatusOfAdmission;
	}
	// TODO Auto-generated constructor stub
	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public Date getDateOfCounseling() {
		return dateOfCounseling;
	}
	public void setDateOfCounseling(Date dateOfCounseling) {
		this.dateOfCounseling = dateOfCounseling;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public String getPreferCollegeHostel() {
		return preferCollegeHostel;
	}
	public void setPreferCollegeHostel(String preferCollegeHostel) {
		this.preferCollegeHostel = preferCollegeHostel;
	}
	public String getFirstGraduate() {
		return firstGraduate;
	}
	public void setFirstGraduate(String firstGraduate) {
		this.firstGraduate = firstGraduate;
	}
	public String getManagerApproval() {
		return managerApproval;
	}
	public void setManagerApproval(String managerApproval) {
		this.managerApproval = managerApproval;
	}
	public double getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}
	public double getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}
	public double getHostelFee() {
		return hostelFee;
	}
	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	public double getTotalCollegeFee() {
		return totalCollegeFee;
	}
	public void setTotalCollegeFee(double totalCollegeFee) {
		this.totalCollegeFee = totalCollegeFee;
	}
	public String getFinalStatusOfAdmission() {
		return finalStatusOfAdmission;
	}
	public void setFinalStatusOfAdmission(String finalStatusOfAdmission) {
		this.finalStatusOfAdmission = finalStatusOfAdmission;
	}
	@Override
	public String toString() {
		return "StudentAdmission [admissionId=" + admissionId + ", studentCode=" + studentCode + ", dateOfCounseling="
				+ dateOfCounseling + ", departmentName=" + departmentName + ", dateOfAdmission=" + dateOfAdmission
				+ ", preferCollegeHostel=" + preferCollegeHostel + ", firstGraduate=" + firstGraduate
				+ ", managerApproval=" + managerApproval + ", admissionFee=" + admissionFee + ", tutionFee=" + tutionFee
				+ ", hostelFee=" + hostelFee + ", totalCollegeFee=" + totalCollegeFee + ", finalStatusOfAdmission="
				+ finalStatusOfAdmission + "]";
	}
	
	
}
