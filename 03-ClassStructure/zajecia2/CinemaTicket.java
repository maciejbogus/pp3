public class CinemaTicket
{
   static String cinemaName = "Cinema City";
   String movieTitle;
   int row;
   int seat;
   
   public int price(){
       if(row<=2) return 10;
       else if(row>2) return 25;
       else return -1;
    }
   
   public void ticketInfo(){
        System.out.println("Cinema name: "+ cinemaName + ", movie: "+ movieTitle);
        System.out.println("Row: "+ row + ", seat: "+ seat);
        System.out.println("Ticket price: "+ price());
    }
    
    public void cinemaTicket(String movieTitle_, int row_, int seat_){
        this.movieTitle = movieTitle_;
        this.row = row_;
        this.seat = seat_;
    } 
    
    public static void main(String[] args){
        
    }
}
