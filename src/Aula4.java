import java.util.Scanner;

public class Aula4{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int n1=0, n2=0;
        String nome;

        System.out.print("Insira seu nome: ");
        nome = scan.nextLine();

        System.out.print("Insira o primeiro valor: ");
        n1 = scan.nextInt();

        System.out.print("Insira o segundo valor: ");
        n2 = scan.nextInt();

        System.out.printf("%s, a soma entre %d e %d é igual a %d", nome, n1, n2, n1+n2);
        

    }


}