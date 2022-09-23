package praticaIntegradora2;

public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto: " + this.name + "\n Preço: " + this.price;
    }

    public double calc(int qntProducts) {
        return qntProducts * this.price;
    }

}
