package Core;

import Models.Ticket;
import Service.TicketRepository;

import java.util.List;

public  class TicketProvider {
    private TicketRepository ticketRepo;

    public TicketProvider() {;
    }

    public List<Ticket> getTickets(){
        return null;
    }
    public boolean updateTicketStatus(Ticket ticket){
        return false;
    }
}
