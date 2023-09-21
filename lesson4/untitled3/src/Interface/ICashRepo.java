package Interface;


public interface ICashRepo {
    public boolean transaction(int userId, long cardNumber, double sum);
}
