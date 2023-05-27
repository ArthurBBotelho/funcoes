
import java.util.Scanner;
public class funcoes {
    public static void main(String[] args){

        // Scanner para buscar input do nome do usuário

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String userName = input.nextLine();
        System.out.println("Nome do usuário: " + userName);

        //Scanner para inserir um número inteiro e somar com outro número inteiro

        System.out.println("Digite 1 número inteiro: ");
        int n1 = input.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n2 = input.nextInt();

        int resultado = soma(n1, n2);
        System.out.println("Soma dos dois números: " + resultado);

        input.close();

    }

    public static int soma(int n1, int n2){
        return n1 + n2;
    }
}
