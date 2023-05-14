public class VerificarCondicional {

    public static void main(String[] args) {
        int numero =32;

        if (numero <= 10) {
            System.out.println("Este número é menor ou igual a 10!");
        } else if (numero >= 5) {
            System.out.println("Este número é maior ou igual a 5!");
        } else if (numero != 3) {
            System.out.println("Este número não é igual a 3!");
        } else if (numero == 8) {
            System.out.println("Este número é igual a 8!");
        } else if (numero < 0) {
            System.out.println("Este número é menor que 0!");
        } else if (numero > 100) {
            System.out.println("Este número é maior que 100!");
        } else {
            System.out.println("Todas as condições foram atendidas!");
        }
    }
}
