public class Aula3 {
    public static void main(String[] args){
        //int nota=80, media=70, faltas=10, maxFaltas=8;
        
        /*
        if (faltas > maxFaltas){
            System.out.println("Reprovado por falta.");
        }
        else{
            if (nota >= media){
                System.out.println("Aprovado!");
            }
            else if(nota >= 40){
                System.out.println("Recuperação.");
            }
            else{
                System.out.println("Reprovado.");
            }
        }
        */

        /*String res;
        
        res = (nota >= media ? "Aprovado." : "Reprovado.");

        System.out.println(res);*/

        int pos=4;

        switch(pos){
            case 1:
                System.out.println("Primeiro lugar.");
                break;
            case 2: 
                System.out.println("Segundo Lugar.");
            case 3: 
                System.out.println("Terceiro Lugar.");
            case 4: case 5: case 6:
                System.out.println("Premio de participação.");
                break;
            default:
                System.out.println("Não ganha prémio.");
                break; 

        }



        
    }
}
