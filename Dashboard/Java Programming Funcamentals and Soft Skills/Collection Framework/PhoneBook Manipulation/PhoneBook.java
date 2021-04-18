import java.util.*;
public class PhoneBook{
    
    private List<Contact> phoneBook=new ArrayList<>();
    
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook=phoneBook;
    }
    public List<Contact> getPhoneBook(){
        return this.phoneBook;
    }
    public void addContact(Contact contactObj){
        this.phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts(){
        return this.phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber){
        Contact cobj=null;
        for(Contact c:this.phoneBook){
            if(c.getPhoneNumber()==phoneNumber){
                cobj=c;
            }
        }
        return cobj;
    }
    public boolean removeContact(long phoneNumber){
        int n=0;
        boolean flag=true;
        for(int i=0;i<this.phoneBook.size();i++){
            if(this.phoneBook.get(i).getPhoneNumber()==phoneNumber){
                n=i;
                flag=false;
                break;
            }
        }
        if(flag==false){
            this.phoneBook.remove(n);
            setPhoneBook(this.phoneBook);
            return true;
        }
        
            System.out.println("the phone number is not available");
            return false;
    
        
    }
}