import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("0.00");
        Scanner leitor = new Scanner(System.in);

        int opcaoEscolhida = 0;
        int quantidade = 0;
        double total = 0;

        String [] cardapio = {"Cachorro quente", "X-Salada", "X-Bacon", "Torrada simples", "Refrigerante"};
        double [] preco = {4.00, 4.50, 5.00, 2.00, 1.50};

        for (int i = 0; i< cardapio.length && i< preco.length; i++){
            System.out.println((i+1) + " : " + cardapio[i] +" = R$" + preco[i]);
        }

        while (opcaoEscolhida < 1 || opcaoEscolhida> 5) {
            System.out.println("Informe a opçõ desejada: ");
            opcaoEscolhida = leitor.nextInt();

        }
        System.out.println("Informe a quantidade: ");
        quantidade = leitor.nextInt();

        switch (opcaoEscolhida){
            case 1:
                total =preco [opcaoEscolhida -1] * quantidade;
                break;
            case 2:
                total =preco [opcaoEscolhida -1] * quantidade;
                break;
            case 3:
                total =preco [opcaoEscolhida -1] * quantidade;
                break;
            case 4:
                total =preco [opcaoEscolhida -1] * quantidade;
                break;
            case 5:
                total =preco [opcaoEscolhida -1] * quantidade;
                break;
        }
        System.out.println("Total: R$" + f.format(total));
    }
}
