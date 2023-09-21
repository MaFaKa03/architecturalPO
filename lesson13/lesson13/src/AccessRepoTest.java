import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @org.junit.jupiter.api.Test
    void getUser() {
        User userTest = new User("Kostya");
        AccessRepo accessRepoTest = new AccessRepo(userTest, new Token("Token0"));
        assertEquals(userTest, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void setUser() {
        AccessRepo accessRepoTest = new AccessRepo(new User("Kostya"),
                                                    new Token("Token0"));
        User userTest = new User("Kostya Lhait");
        accessRepoTest.setUser(userTest);
        assertEquals(userTest, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void getToken() {
    }

    @org.junit.jupiter.api.Test
    void setToken() {
    }

    @org.junit.jupiter.api.Test
    void findUser() {
    }
}