public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
     public int getTicketid(){
        return this.ticketid;
    }
    

   
    public void setPrice (int price){
        this.price=price;
    }
        public int getPrice (){
        return this.price;
    }
    
    
  
    public static void setAvailableTickets (int availableTickets){
        if(availableTickets>0)
        {
          Ticket.availableTickets=availableTickets;
        }
    }
      public static int getAvailableTickets (){
        return availableTickets;
    }
    
    
    public int calculateTicketCost(int not){
        
        if(not<=this.availableTickets){
            setAvailableTickets(this.availableTickets-not);
            return (not*this.price);
            
        }
        else{
            return -1;
        }
    }
    
}
