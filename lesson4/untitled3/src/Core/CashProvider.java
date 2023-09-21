package Core;

import Models.User;
import Service.CarrierRepository;
import Service.CashRepository;

public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;
    private CarrierRepository carrierRepo;
    private CashRepository cashRepo;
    public CashProvider() {
    }

    public CarrierRepository getCarrierRepo() {
        return carrierRepo;
    }

    public void setCarrierRepo(CarrierRepository carrierRepo) {
        this.carrierRepo = carrierRepo;
    }

    public CashRepository getCashRepo() {
        return cashRepo;
    }

    public void setCashRepo(CashRepository cashRepo) {
        this.cashRepo = cashRepo;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public long getHashCard() {
        return hashCard;
    }

    public void setHashCard(long hashCard) {
        this.hashCard = hashCard;
    }

    public boolean isAuthorization() {
        return isAuthorization;
    }

    public void setAuthorization(boolean authorization) {
        isAuthorization = authorization;
    }

    public CashProvider(long card, long hashCard, boolean isAuthorization) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = isAuthorization;
    }

    public boolean buy(double price){
        return true;
    }
    public void authorization(User user){}
}
