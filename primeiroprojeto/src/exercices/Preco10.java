package exercices;

public class Preco10 {
    public static void main(String[] args) {
        double precoOriginial = 100.0;
        double desconto = 10.0;
        double valorDesconto = (desconto / 100) * precoOriginial;
        double novoPreco = precoOriginial - desconto;

        System.out.println("Preço original " + precoOriginial + " e valor com desconto: " + novoPreco);
    }
}
