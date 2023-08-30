package Interface;

import Models.Ticket;

import java.util.List;

public interface ITicketRepo {
    public boolean create(Ticket ticket);
    public List<Ticket> readAll();
    public boolean update(Ticket ticket);
    public boolean delete(Ticket ticket);
}
