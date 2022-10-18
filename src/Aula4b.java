import java.util.Scanner;


public class Aula4b{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int soma=0, nota=0;
        int cont=0;
        String nome, resultado;

        System.out.print("Insira o nome do aluno: ");
        nome = scan.nextLine();

        while (cont < 3){

            System.out.printf("Insira a %da nota: ", cont+1);
            nota = scan.nextInt();

            soma += nota;
            cont++;
        }

        soma = soma/3;

        resultado = (soma >= 6 ? "Aprovado": "Reprovado");

        System.out.printf("Com média %d, o aluno %s foi %s", soma, nome, resultado);

    }
}