package praticaIntegradora2;

import java.time.LocalDateTime;

public class Perishable extends Product {
    private int daysToWin;
    private final double FOURFOLD_REDUCTION = 0.25;
    private final double THREE_REDUCTION = 0.33;
    private final double HALF_REDUCTION = 0.5;

    public Perishable(String name, double price, int daysToWin) {
        super(name, price);
        this.daysToWin = daysToWin;
    }

    public int getDaysToWin() {
        return daysToWin;
    }

    public void setDaysToWin(int daysToWin) {
        this.daysToWin = daysToWin;
    }

    @Override
    public String toString() {
        String message = super.toString();
        return message + "\n Dias para vencer: " + getDaysToWin();
    }

    public double calc(int qntProducts) {
        double initialPrice = qntProducts * super.getPrice();

        switch (daysToWin) {
            case 1: return initialPrice * FOURFOLD_REDUCTION;
            case 2: return initialPrice * THREE_REDUCTION;
            case 3: return initialPrice * HALF_REDUCTION;
            default: return initialPrice;
        }
    }

}
