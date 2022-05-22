package ticketPriceCalculation;

public class Ticket {
	private int ticketid;
	private int price;
	private int noOfTicket;
	private static int availableTickets; 
	
	public Ticket(){
		
	}
	
	public int getTicketid() {
		return ticketid;
	}



	public int getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public static int getAvailableTickets() {
		return availableTickets;
	}



	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets<0)
		Ticket.availableTickets = -1;
		else
		 Ticket.availableTickets = availableTickets;
	}



	public int calculateTicketCost(int nooftickets) {
		return nooftickets*this.price;
	}
}
