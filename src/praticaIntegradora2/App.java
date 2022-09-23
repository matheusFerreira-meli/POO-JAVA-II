package praticaIntegradora2;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        int date = LocalDateTime.now().getDayOfMonth();

        System.out.println(date);
    }
}
