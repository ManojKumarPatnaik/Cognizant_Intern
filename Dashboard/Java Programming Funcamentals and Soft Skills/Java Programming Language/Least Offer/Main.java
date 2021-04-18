import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner kb=new Scanner(System.in);
     
     int n=kb.nextInt();
     int k=9999999;
     String m[][]=new String[n][2];
     for(int i=0;i<n;i++){
         String str[]=kb.next().split(",");
        int d=(Integer.parseInt(str[1])*Integer.parseInt(str[2]))/100;
         m[i][0]=str[0];
         m[i][1]=Integer.toString(d);
         k=Math.min(k,d);
     }
     for(int i=0;i<n;i++){
         
         if(k==Integer.parseInt(m[i][1])){
             System.out.println(m[i][0]);
             
         }
        
     }
     
        
    }
}