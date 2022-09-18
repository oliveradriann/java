public class ManipulandoStrings {
    public static void main(String[] args) {
        String x = "Olá Mundo, este é o novo Mundo";
        System.out.println(x.length()); //retorna quantas letras tem
        System.out.println(x + " Concatenada"); // concatena
        System.out.println(x.contains("novo"));//retorna true se contem essa palavra
        System.out.println(x.indexOf("Mundo"));//retorna onde começa a sequencia  conta -se de 0 o resultado é 4
        System.out.println(x.lastIndexOf("Mundo")); // retorna ultima vez que aparece a sequncia
        System.out.println(x.toUpperCase()); // transforma em caixa alta;
        System.out.println(x.toLowerCase());//transforma em caixa baixa;
        System.out.println(x.trim()); // remove espacos desnecessários no inicio  ou fim;
        System.out.println(x.substring(9)); // retorna frase apartir da posição 9
        System.out.println(x.equals("ola"));  // compara strings retorna false;
        // equals é utilizado sempre para comparar strings
        




    }
}
