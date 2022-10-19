package Get_set;

public class Principal {
    public static void main(String[] args){

        int num = 1;

        Jogador jogador1 = new Jogador(num++);
        Jogador jogador2 = new Jogador(num++);
        Jogador jogador3 = new Jogador(num++);

        jogador1.addVidas();
        jogador1.addVidas();
        jogador1.addVidas();
        jogador1.addVidas();
        jogador1.addVidas();

        System.out.printf("\nNúmero de vidas do jogador 1: %d", jogador1.getVidas());
        System.out.printf("\nNúmero de vidas do jogador 2: %d", jogador2.getVidas());
        System.out.printf("\nNúmero de vidas do jogador 3: %d", jogador3.getVidas());

    }
    
}
