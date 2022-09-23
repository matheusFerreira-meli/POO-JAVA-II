package praticaIntegradora1;

public class Person {
    String name;
    int age;
    String id;
    double heavy;
    double height;
    final int minAge = 18;

    public Person() {}

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, String id, double heavy, double height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.height = height;
        this.heavy = heavy;
    }

    public int calcIMC() {
        double imc = this.heavy/Math.pow(this.height, 2);
        if (imc < 20) return -1;
        if (imc < 26) return 0;
        return 1;
    }

    public boolean isOfLegalAge() {
        return this.age >= minAge;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + ", idade: " + this.age + ", id: " + this.id + ", peso: " + this.heavy + ", altura: " + this.height;
    }

}
