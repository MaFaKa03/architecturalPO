package Service;

import Interface.ITicketRepo;
import Models.Ticket;

import java.util.List;

public class TicketRepository implements ITicketRepo {
    @Override
    public boolean create(Ticket ticket) {
        return false;
    }

    @Override
    public List<Ticket> readAll() {
        return null;
    }

    @Override
    public boolean update(Ticket ticket) {
        return false;
    }

    @Override
    public boolean delete(Ticket ticket) {
        return false;
    }
}
