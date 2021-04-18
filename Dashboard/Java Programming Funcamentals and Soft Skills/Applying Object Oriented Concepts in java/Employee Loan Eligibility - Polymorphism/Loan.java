
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof  PermanentEmployee){
		    return employeeObj.getSalary()*0.15;
		}
		else{
		    return employeeObj.getSalary()*0.1;
		}
	}

}
