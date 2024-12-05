package exercices;

public class Temperatura {
    public static void main(String[] args) {

        double celsius = 27.0;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f celsius sera %f fahrenheit", celsius, fahrenheit);

        System.out.println(mensagem);

        int fahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em farhenheit inteira é: " + fahrenheitInteira);


    }
}
