import java.util.*;   
import java.text.ParseException;   
import java.text.SimpleDateFormat;   
public class Main  
{   
    public static boolean check(Date date1,Date date2){
        if (date1.after(date2))   
        {     
        return true;
        }  
        else if (date1.before(date2))   
        {    
        return false; 
        }
        else if (date1.equals(date2))   
            {   
            return true;
            }  
        return false; 
           
    }
public static void main(String args[]) throws Exception  
{   

SimpleDateFormat sdfo = new SimpleDateFormat("dd/MM/yyyy HH:mm");   
   
String current="29/10/2019 20:10";
Scanner kb=new Scanner(System.in);
Date currentdate=sdfo.parse(current);
String intime="";
String outtime="";
try{
System.out.println("In-time");
 intime=kb.nextLine().trim();
Date date1 = sdfo.parse(intime);   
if(check(date1,currentdate)==true){
    System.out.println(sdfo.format(date1)+" is an Invalid In-Time ");
}
else{
 
    try{
    System.out.println("Out-time");
     outtime=kb.nextLine().trim();
    Date date2 = sdfo.parse(outtime); 
    if(check(date1,date2)==true){
    System.out.println(sdfo.format(date2)+" is an Invalid Out-Time ");
    }
    else{
        long diff= date2.getTime() - date1.getTime();
        long diffHours = diff / (60 * 60 * 1000);
        System.out.println(((diffHours*10)+10)+" Rupees");
    }
    }
    catch(Exception exv){
        System.out.println(outtime+" is an Invalid Out-Time ");
    }
    
}
}
catch(Exception exz){
    System.out.println(intime+" is an Invalid In-Time ");
}




}  
}  