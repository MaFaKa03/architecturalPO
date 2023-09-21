import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CinemaTicket cinemaTicket = new CinemaTicket();
        Random random = new Random();
        long num = random.nextLong(999999999);
        cinemaTicket.setRootNumber(num);
        System.out.println(cinemaTicket.getRootNumber());
    }
}