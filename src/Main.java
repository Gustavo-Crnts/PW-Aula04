import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Equacao equacao = new Equacao();
        System.out.println("Calculo do delta");
        System.out.println("Digite o valor de a: ");
        equacao.a = leitor.nextInt();

        System.out.println("Digite o valor de b: ");
        equacao.b = leitor.nextInt();

        System.out.println("Digite o valor de c: ");
        equacao.c = leitor.nextInt();

        equacao.calcDelta();
        System.out.println("Delta = " + equacao.delta);
        System.out.println(equacao.raiz());


    }
}