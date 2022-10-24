package Get_set2;

public class Principal {
    public static void main(String[] args){
        Caneta caneta1 = new Caneta();

        caneta1.setMarca("BIC");
        caneta1.setPonta(0.5f);

        System.out.printf("Tenho uma caneta da marca '%s' que tem ponta %.1f.", caneta1.getMarca(), caneta1.getPonta());

    }
}
