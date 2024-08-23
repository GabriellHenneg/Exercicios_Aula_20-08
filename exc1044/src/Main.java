import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int A = leitor.nextInt();

        System.out.print("Informe o segundo numero: ");
        int B = leitor.nextInt();

        int resultado = 0;

        for (int i = 1; resultado != B ; i++ ){
            resultado = A * i;
            //System.out.println(A + " x " + i + " = " +   resultado);
            if( resultado == B){
                System.out.println(A + " e " + B +" São multiplos");
            }
            else if (resultado > B) {
                System.out.println(A + " e " + B + " Não são multiplos");
                break;
            }

        }
    }
}
