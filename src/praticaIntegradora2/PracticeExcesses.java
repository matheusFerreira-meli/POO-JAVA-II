package praticaIntegradora2;

public class PracticeExcesses {
    public static void main(String[] args) {
        int result;

        try {
            result = 20 / 0;
        } catch (Exception exception) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
