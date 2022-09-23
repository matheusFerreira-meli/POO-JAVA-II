package praticaIntegradora1;

public class App {
    public static void main(String[] args) {
        Person personWithoutAttrs = new Person();
        Person personWithNameAndAge = new Person("Matheus", 20, "id-01");
        Person personWithAllAttrs = new Person("Matheus", 20, "id-01", 60, 1.70);

        System.out.println(personWithAllAttrs);
    }
}
