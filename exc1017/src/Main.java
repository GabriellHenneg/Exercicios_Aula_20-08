import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// EXERCICIO AULA 20/08/2024 - 1017.JPG

        Scanner leitor = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("00.000");

        System.out.println("Informe o tempo gasto na viagem: ");
        int tempoGastoNaViagem = leitor.nextInt();

        System.out.println("Informe o a velocidade media da viagem:  ");
        int kmMedio = leitor.nextInt();

        double litrosNecessarios = (tempoGastoNaViagem * kmMedio) /12.00;

        System.out.println("É necessario: " + f.format(litrosNecessarios)+ " litros  para essa viagem!");
    }
}