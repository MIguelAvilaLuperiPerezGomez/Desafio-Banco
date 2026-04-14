import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Double Saldo = 2500.0;
        int escolha = 0;
        while(escolha != 4){
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            escolha = scanner.nextInt();


            switch (escolha){
                case 1 :
                    System.out.println(Saldo);
                    System.out.println("");
                    break;
                case 2 :
                    System.out.println("Digite o Valor a receber");
                    double valor = scanner.nextDouble();
                    Saldo += valor;
                    break;
                case 3 :
                    System.out.println("Digite o valor a ser transferido");
                    double transferido = scanner.nextDouble();
                    Saldo -= transferido;
                    break;


            }

        }
    }
}
