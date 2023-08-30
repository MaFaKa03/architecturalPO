package Core;

import Interface.ICustomer;
import Models.Ticket;
import Models.User;

import java.util.Date;
import java.util.List;

public abstract class Customer implements ICustomer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cash;

    private TicketProvider ticketProvider;
    private UserProvider userProvider;
    private User client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public CashProvider getCash() {
        return cash;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    public void setTicketProvider(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public UserProvider getUserProvider() {
        return userProvider;
    }

    public void setUserProvider(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    @Override
    public User getClient() {
        return client;
    }

    @Override
    public void setClient(User client) {
        this.client = client;
    }

    public abstract boolean buy(Ticket ticket);
    public abstract List<Ticket> search(Date date, long rootNumber);

    public Customer(int id, List<Ticket> tickets, TicketProvider ticketProvider,
                    UserProvider userProvider, User client) {
        this.id = id;
        this.tickets = tickets;
        this.ticketProvider = new TicketProvider();
        this.userProvider = new UserProvider();
        this.client = client;
        this.cash = new CashProvider();
    }
}
