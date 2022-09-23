package praticaIntegradora2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
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
        return "Produto: " + this.getName() + "\n Preço: " + this.getPrice();
    }

    public double calc(int qntProducts) {
        return qntProducts * this.price;
    }

}
