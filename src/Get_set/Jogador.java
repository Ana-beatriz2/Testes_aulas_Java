package Get_set;

public class Jogador {

    private final int maxVidas = 4;
    private int num;
    private int vidas = 1; 

    public Jogador(int num_jogador){
        System.out.printf("\nJogador %d criado com sucesso!\n", num_jogador);
    }

    public int getVidas(){
        return this.vidas;
    }

    /*public void setVidas(int vidas){
        this.vidas = vidas;
    }*/

    public void addVidas(){
        if (this.vidas < maxVidas){
            this.vidas++;
        }
    }



}
