package Core;

import Models.User;
import Service.UserRepository;

import java.util.List;

public class UserProvider {
    private UserRepository clientRepo;

    public UserProvider() {

    }

    public int createClient(int id, String name, int password, long cardNumber){
        return 0;
    }
    public User getClientByName(String name){
        return null;
    }
    public List<User> getAllClients(){
        return null;
    }
}
