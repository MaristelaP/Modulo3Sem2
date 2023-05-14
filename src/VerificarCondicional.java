public class VerificarCondicional {
    public static void main(String[] args) {
        int a = 7;
        int b = 30;
        int c = 3;
        int d = 3;
        int e = -1;
        int f = 100;

            if (a <= 10) {
                System.out.println("a é menor ou igual a 10!");
            } else if (b >= 5) {
                System.out.println("b é maior ou igual a 5!");
            } else if (c == 3) {
                System.out.println("c é igual a 3!");
            } else if (d != 8) {
                System.out.println("d é Não é igual a 8!");
            } else if (e < 0) {
                System.out.println("e é menor que 0!");
            } else if (f <= 100) {
                System.out.println("f é menor ou igual a 100!");
            } else {
                System.out.println("Todas as condições foram atendidas!");
            }

    }
}




