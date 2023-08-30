package Interface;

import Core.UserProvider;
import Models.Ticket;
import Models.User;

import java.util.Date;
import java.util.List;

public interface ICustomer {
    public User getClient();
    public void setClient(User user);
    public UserProvider getClientProvider();
    public void serClientProvider(UserProvider userProvider);
    public boolean buy(Ticket ticket);
    public List<Ticket> search(Date date, long rootNumber);
}
