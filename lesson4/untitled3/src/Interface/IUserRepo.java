package Interface;

import Models.User;

import java.util.List;

public interface IUserRepo {
    public User create(int id);
    public User read(int id);
    public String readUserName(User user);
    public int readUserId(User user);
    public List<User> readAll();
    public boolean update(User user);
    public boolean delete(User user);


}
