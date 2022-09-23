package praticaIntegradora2;

public class NoPerishable extends Product{
    private String type;

    public NoPerishable(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String message = super.toString();
        return message + "\n Tipo: " + type;
    }
}
