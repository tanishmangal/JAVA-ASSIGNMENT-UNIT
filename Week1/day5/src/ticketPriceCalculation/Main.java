package ticketPriceCalculation;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Ticket obj=new Ticket();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Booking:");
		int booking=s.nextInt();
		System.out.println("Enter Available Ticket:");
		int availbleTicket=s.nextInt();
		for( int i=0;i<booking;i++) {
			System.out.println("");
			System.out.println("Enter No. of Ticket:");
			obj.setNoOfTicket(s.nextInt());
			int ticket=obj.getNoOfTicket();
			if(availbleTicket<ticket) {
				System.out.println("Ticket Are Not Available");
				break;
			}
			Ticket.setAvailableTickets(availbleTicket-ticket);
			availbleTicket=Ticket.getAvailableTickets();
			
			
			System.out.println("Enter Ticket ID:");
			obj.setTicketid(s.nextInt());
			int id=obj.getTicketid();
			System.out.println("Enter Ticket Price:");
			obj.setPrice(s.nextInt());
			int price=obj.getPrice();
			
			System.out.println("Total Amount:"+obj.calculateTicketCost(ticket));
			System.out.println("Avalable Ticket After Booking:"+availbleTicket);
			
		 }

	}
}


