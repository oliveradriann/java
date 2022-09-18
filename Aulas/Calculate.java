public class Calculate {
    public static void main(String[] args) {
        int x= Integer.parseInt(args[1]);  // dá um parse no argumento e os torna int
        int y= Integer.parseInt(args[2]);

          if(args[0].equals("somar")) { // usou a palavra .equals como =
              sum(x,y);
            } else if (args[0].equals("subtrair")){
              minus(x, y);
          }else {           // else é o ultimo do bloco if
              System.out.println("nenhuma instrução definida");
          }

        }

            static void sum(int x,int y) {
                System.out.println(x + y);
            }

    static void minus(int x,int y) {
        System.out.println(x - y);
    }
}
