public class Metodos2 {
    public static void main(String[]  args){

        System.out.println(soma(12, 8, 5));

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
}
