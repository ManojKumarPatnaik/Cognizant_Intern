import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner kb=new Scanner(System.in);
        PhoneBook pbook=new PhoneBook();
        boolean value=true;
        do{
            System.out.println("Menu \n1.Add Contact \n 2.Display all contacts \n 3.Search contact by phone \n 4.Remove contact \n 5.Exit");
            System.out.print("Enter your choice: ");
            int n=kb.nextInt();
            switch(n){
                case 1:
                    System.out.println("\nAdd a Contact:");
                    System.out.print("Enter the First Name: ");
                    String fname=kb.next();
                    System.out.print("Enter the Last Name: ");
                    String lname=kb.next();
                    System.out.print("Enter the Phone No.: ");
                    long phn=kb.nextLong();
                    System.out.print("Enter the Email: ");
                    String email=kb.next();
                    Contact obj=new Contact(fname,lname,phn,email);
                    pbook.addContact(obj);
                    break;
                case 2:
                    List<Contact> cl=pbook.viewAllContacts();
                    System.out.println("The contacts in the List are:");
                    for(Contact ct:cl){
                        System.out.println("First Name: "+ct.getFirstName()+"\n"+"Last Name: "+ct.getLastName()+"\n"+"Phone No.: "+ct.getPhoneNumber()+"\n"+"Email: "+ct.getEmailId());
                    }
                    break;
                case 3:
                    System.out.println("Enter the Phone number to search contact:");
                    long Sphn=kb.nextLong();
                    Contact ct=pbook.viewContactGivenPhone(Sphn);
                     System.out.println("First Name: "+ct.getFirstName()+"\n"+"Last Name: "+ct.getLastName()+"\n"+"Phone No.: "+ct.getPhoneNumber()+"\n"+"Email: "+ct.getEmailId());
                    break;
                case 4:
                    System.out.println("Enter the Phone number to remove :");
                    long rph=kb.nextLong();
                    System.out.println("Do you want to remove the contact (Y/N): ");
                    String ch=kb.next();
                    if(ch.equals("Y")){
                       boolean val=pbook.removeContact(rph);
                       if(val==true){
                           System.out.println("The contact is successfully deleted.");
                       }
                    }
                
                    break;
                case 5:
                    value=false;
                    break;
            }
        }while(value!=false);
    }
}