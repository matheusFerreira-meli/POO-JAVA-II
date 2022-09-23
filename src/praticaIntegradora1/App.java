package praticaIntegradora1;

public class App {
    public static void main(String[] args) {
        Person personWithoutAttrs = new Person();
        Person personWithNameAndAge = new Person("Matheus", 20, "id-01");
        Person personWithAllAttrs = new Person("Matheus", 20, "id-01", 60, 1.70);

        String messageIMC;

        if (personWithAllAttrs.calcIMC() < 0) {
            messageIMC = "Abaixo do peso";
        } else if (personWithAllAttrs.calcIMC() > 0) {
            messageIMC = "Sobrepeso";
        } else {
            messageIMC = "Peso saudável";
        }

        System.out.println("Dados da pessoa");
        System.out.println("============================================");
        System.out.println(personWithAllAttrs);
        System.out.println("IMC: " + messageIMC);
    }
}
