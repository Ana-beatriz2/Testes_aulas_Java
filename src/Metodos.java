public class Metodos {
    public static void main(String[] args){

        System.out.println(soma2(12, 8));
        System.out.println(soma(10, 10, 50, 7));
        System.out.println(soma(10.8, 9.7, 5.1));

    }

    public static int soma(int... numeros){
        int resultado = 0;

        for (int n:numeros){
            resultado += n;
        }

        return resultado;
    }

    public static Double soma(Double... numeros){
        Double resultado = 0.0;

        for (Double n:numeros){
            resultado += n;
        }

        return resultado;

    }

    public static int soma2(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

}
