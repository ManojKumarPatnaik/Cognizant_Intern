import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        
        Scanner kb=new Scanner(System.in);
        String name=kb.nextLine();
        String pname=kb.next();
        boolean name1=validateEmployeeName().validateName(name);
        if(name1==true){
            System.out.println("Employee name is valid");
        }
        else{
              System.out.println("Employee name is invalid");
        }
        boolean id=validateProductName().validateName(pname);
        if(id==true){
            System.out.println("Product name is valid");
        }
        else{
              System.out.println("Product name is invalid");
        }
    }
    
    public static Validate validateEmployeeName() 
    {
        return (name)->{
            if(name.length()>=5 && name.length()<=20){
                for(int i=0;i<name.length();i++){
                    int dd=(int)Character.toUpperCase(name.charAt(i));
                    if((dd>=65 && dd<=90) || name.charAt(i)==' '){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
            return true;
        };
    }
    
    public static Validate validateProductName() 
    {
        return (name)->{
            try{
            int dd=(int)Character.toUpperCase(name.charAt(0));
            if(dd>=65 && dd<=90){
                try{
                    if((name.length()-1)==5){
                        int d=Integer.parseInt(name.substring(1,6));
                        return true;
                    }
                    else{
                        return false;
                    }
                    
                }
                catch(Exception exz){
                    return false;
                }
            
            }
            else{
            
            return false;
            }
            
        }
        catch(Exception e){
            return false;
        }
        };
        
    }
}