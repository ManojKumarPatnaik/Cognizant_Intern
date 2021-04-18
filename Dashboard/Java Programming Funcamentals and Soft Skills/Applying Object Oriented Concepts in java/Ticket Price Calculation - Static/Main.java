import java.util.*;
public class Main{
    public static void main (String[] args) {
         Scanner kb=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int n=kb.nextInt();
        System.out.println("Enter the available tickets:");
        int avl=kb.nextInt();
        Ticket t=new Ticket();
        t.setAvailableTickets(avl);
        for(int i=0;i<n;i++){
        System.out.println("Enter the ticketid:");
        int id=kb.nextInt();
        System.out.println("Enter the price:");
        int price=kb.nextInt();
        System.out.println("Enter the no of tickets:");
        int not=kb.nextInt();
        System.out.println("Available tickets: "+avl);
        
        t.setTicketid(id);
        t.setPrice(price);
         System.out.println("Available tickets: " + t.getAvailableTickets ());
        System.out.println("Total amount: "+t.calculateTicketCost(not));
         System.out.println("Available ticket after booking:"+t.getAvailableTickets ());
       
    
        }
        }
}