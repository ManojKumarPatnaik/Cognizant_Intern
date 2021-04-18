import java.util.*;
public class StudentMain{
    public static void main (String[] args) {
        Scanner kb=new Scanner(System.in);
        
        System.out.println("Enter Student's Id:");
        int id=kb.nextInt();
        System.out.println("Enter Student's Name:");
        String name=kb.next();
        System.out.println("Enter Student's address:");
        String address=kb.next();
        String check;
        boolean flag=true;
        String collegename="NIT";
        do{
        System.out.println("Whether the student is from NIT(Yes/No):");
        check=kb.next();
        if(check.toUpperCase().equals("NO") || check.toUpperCase().equals("YES")){
            flag=false;
            break;
        }
        else{
            System.out.println("Wrong Input");
        }
        }while(true);
        if(check.toUpperCase()=="NO"){
        System.out.println("Enter the college name:");
        collegename=kb.next();
        Student st=new Student(id,name,address,collegename);
        System.out.println("Student id:"+st.getStudentId());
        System.out.println("Student name:"+st.getStudentName());
        System.out.println("Address:"+st.getStudentAddress());
        System.out.println("College name:"+st.getCollegeName());
        }
        else{
        Student st=new Student(id,name,address);
        System.out.println("Student id:"+st.getStudentId());
        System.out.println("Student name:"+st.getStudentName());
        System.out.println("Address:"+st.getStudentAddress());
        System.out.println("College name:"+collegename);
        }
        
        
    }
}