import java.util.Random;

public class Loops {
    public static void main(String[] args) {

        Random rnd =new Random();

          int i =0;
          // while (true) loop infinito
        while (i<6){
            int x = rnd.nextInt(60);
            System.out.print(x);
            System.out.print("-");

            i++;
        }
      // for (vlr inicial; condicao ; acrescimo)
        //for(;;) for infinito
        for (i=0;i<6;i++){
            System.out.println("indo");

        }

    }

}
