package Models;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public abstract class Ticket {
    private long rootNumber;
    private double price;
    private int place;
    private Date date;
    private boolean isValid;
    public Ticket(long rootNumber, double price, int place, Date date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return rootNumber == ticket.rootNumber && Double.compare(ticket.price, price) == 0 && place == ticket.place && isValid == ticket.isValid && Objects.equals(date, ticket.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootNumber);
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(long rootNumber) {
        this.rootNumber = rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
