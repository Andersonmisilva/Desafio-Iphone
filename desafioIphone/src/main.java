package src;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Atender ligação");
            System.out.println("2. Reprodutor de música");
            System.out.println("3. Navegador de internet");
            System.out.println("4. Ligar iPhone");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Atendendo ligação...");
                    break;
                case 2:
                    System.out.println("Iniciando reprodutor de música...");
                    break;
                case 3:
                    System.out.println("Iniciando navegador de internet...");
                    break;
                case 4:
                    System.out.println("Ligando iPhone...");
                    break;
                case 0:
                    System.out.println("Saindo. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
