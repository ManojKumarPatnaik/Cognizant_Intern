import java.util.*;
public class ArrayException{
    public String getPriceDetails() {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=kb.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the price details");
        try{
        for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
        }
         System.out.println("Enter the index of the array element you want to access");
            int req=kb.nextInt();
            return "The array element is "+arr[req];
        }
        catch(InputMismatchException exz){
            return "Input was not in the correct format";
        }
        catch(ArrayIndexOutOfBoundsException  exz){
            return "Array index is out of range";
        }
       
        
    }
    public static void main (String[] args) {
        ArrayException obj=new ArrayException();
        
            System.out.println(obj.getPriceDetails());
        
    }
}