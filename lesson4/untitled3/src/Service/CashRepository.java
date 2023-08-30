package Service;

import Interface.ICashRepo;

public class CashRepository implements ICashRepo {
    @Override
    public boolean transaction(int userId, long cardNumber, double sum) {
        return false;
    }
}
