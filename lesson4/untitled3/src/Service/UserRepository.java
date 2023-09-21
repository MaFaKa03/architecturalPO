package Service;

import Interface.IUserRepo;
import Models.User;

import java.util.List;

public class UserRepository implements IUserRepo {

    @Override
    public User create(int id) {
        return null;
    }

    @Override
    public User read(int id) {
        return null;
    }

    @Override
    public String readUserName(User user) {
        return null;
    }

    @Override
    public int readUserId(User user) {
        return 0;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
