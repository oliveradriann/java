public class FundamentosComentados {
    public static void main(String [] args){
        System.out.println("Boa noite !");
   Human joao =new Human();
        joao.nome="joao";
        joao.fala();

        Human pedro =new Human();
        pedro.nome="PEDROOO";
        pedro.fala();

        //instancia conta bradesco

        conta bradesco =new conta();
        bradesco.saldo=5000;  // atribui 5000 ao saldo;
        System.out.println(bradesco.saldo);

        bradesco.deposita(600); // usa o método deposita depositando 600

        System.out.println(bradesco.saldo); // bate o saldo


    }
}
