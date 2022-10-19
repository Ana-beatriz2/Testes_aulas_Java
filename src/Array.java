import java.util.Scanner;
public class Array{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        char[] gabarito  = {'a', 'b', 'b', 'b', 'd'};
        char resposta_aluno;
        int nota = 0;

        for(int i = 0; i < gabarito.length; i++){
            System.out.printf("Insira resposta da %d questão: ", i+1);
            resposta_aluno = scan.next().charAt(0);

            if (gabarito[i] == resposta_aluno){
                nota++;
            }
        }

        System.out.println("Resultado: " + nota + " acertos.");
    }
}