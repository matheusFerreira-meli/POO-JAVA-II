package praticaIntegradora2;

public class Distributor {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new NoPerishable("Arroz", 7.50, "Grão");
        products[1] = new Perishable("Leite", 5, 3);
        products[2] = new Perishable("Melancia", 2.30, 1);

        System.out.println("Lucro ao vender 5 items de cada produto");
        for (Product product: products) {
            System.out.println(product.getName() + " - R$" + String.format("%.2f", product.calc(5)));
        }
    }
}
