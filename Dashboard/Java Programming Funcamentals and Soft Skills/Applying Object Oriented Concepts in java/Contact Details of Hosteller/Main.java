import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id=kb.nextInt();
        System.out.println("Student Name");
        String name=kb.nextLine();
        System.out.println("Department Id");
        int deptid=kb.nextInt();
        System.out.println("Gender");
        String gen=kb.next();
        System.out.println("Phone Number");
        String phno=kb.next();
        System.out.println("Hostel Name");
        String hname=kb.next();
        System.out.println("Room Number");
        int rno=kb.nextInt();
        System.out.println("Modify Room Number(Y/N)");
        String mrn=kb.next();
        if(mrn.equals("Y")){
           System.out.println("New Room Number"); 
           rno=kb.nextInt();
        }
        System.out.println("Modify Phone Number(Y/N)");
        String mphn=kb.next();
        if(mphn.equals("Y")){
           System.out.println("New Phone Number"); 
           phno=kb.next();
        }
        Hosteller hs=new Hosteller();
        hs.setStudentId(id);
        hs.setName(name);
        hs.setDepartmentId(deptid);
        hs.setGender(gen);
        hs.setPhone(phno);
        hs.setHostelName(hname);
        hs.setRoomNumber(rno);
        return hs;
        
        
        
    }
    public static void main (String[] args) {
        Hosteller hs1=getHostellerDetails();
        System.out.println("The Student Details");
        System.out.println(hs1.toString());
        
    }
}