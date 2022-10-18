import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){
        float[][] matriz = new float[3][3];
        float media;
        int i, j;

        Scanner scan = new Scanner(System.in);

        for(i = 0; i <  3; i++){

            System.out.printf("\n==============\nALUNO %d\n==============\n", i+1);
            media = 0;

            for (j = 0; j < 3; j++){
                if (j != 2){
                    System.out.printf("\nInsira a %da nota: ", j+1);
                    matriz[i][j] = scan.nextFloat();

                    media += matriz[i][j];
                }

                matriz[i][j] = media/2;
            }
        }

        for (i = 0; i < 3; i++){
            System.out.printf("\nMÉDIA DO ALUNO %d: %.1f", i+1, matriz[i][2]);
        }

    }
}
