import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // ENTRADA
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        // DECISÃO E SAÍDA
        if (numero >= 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }

        entrada.close();
    }
}
