import java.util.Arrays;


public class Array2{
    public static void main(String [] args){
        //int[] numeros = new int[5];
        int[] numeros = {1, 3, 2, 4, 5};

        Arrays.sort(numeros);

        for (int n:numeros){
            System.out.printf(" %d ", n);
        }
        

    }
}