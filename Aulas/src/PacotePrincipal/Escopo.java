package PacotePrincipal;

public class Escopo {
    static int x; // (default) VISIVEL A TODA CLASSE E O MESMO PACOTE
    public static int y; //(public) VISIVEL A TODA CLASSE E TODOS OS PACOTES
    private static int z; //(privada) SOMENTE A CLASSE ATUAL PODE ACESSAR;
    protected static int w ; //(vamos aprender ainda)

    public static void main(String[] args) {
        // VISIBILIDADE DE ESCOPO
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }

    public static void printt (){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
