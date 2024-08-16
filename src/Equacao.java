import java.util.Scanner;

public class Equacao {
    public static Scanner entrada = new Scanner(System.in);

    public static double a;
    public static double b;
    public static double c;
    public static double delta;

    public static void calcDelta() {
        delta = (Math.pow(b, 2)) - (4 * a * c);
    }

    public static String raiz() {


        if (delta < 0)
            return "Não existe raiz real.";

        else if (delta == 0)
            return "Existe uma raiz real.";

        else
            return "Existem duas raizes reais";

    }

    public static void calcularRaiz() {
        calcDelta();

        double raiz1, raiz2;
        raiz1 = Math.sqrt(delta);
        raiz2 = Math.sqrt(-delta);

        System.out.printf("Resultado:\nx1 = %f\nx2 = %f", raiz1, raiz2);
    }

    public static void media() {


        //Declaração das variáveis
        float n1, n2, n3, n4, media;
        // Solicita quatro números ao usuário
        System.out.println("Digite 4 números:");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Média = " + media);

    }

    public static void somarCem() {

        int soma = 0, numero;

       /* Random random = new Random();
        numero = random.nextInt(100);*/

        for (int i = 0; i < 101; i++) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            soma += numero;

        }

        System.out.println("Soma dos 100 primeiros números = " + soma);


    }



}

