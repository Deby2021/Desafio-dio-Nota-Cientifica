import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class NotaCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // Escreva aqui o seu código

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String[] aux = new String[entrada.length()];

        aux = entrada.split("");

        double x;

        if (aux[0].equals("+")) {

            entrada = entrada.substring(1);

            x = Double.parseDouble(entrada);

            System.out.printf("+%.4E\n", x);

        }

        else if (aux[0].equals("-")) {

            entrada = entrada.substring(1);

            x = Double.parseDouble(entrada);

            System.out.printf("-%.4E\n", x);

        }

        else {

            x = Double.parseDouble(entrada);

            if (x > 0)

                System.out.printf("+%.4E\n", x);

            else if (x < 0)

                System.out.printf("-%.4E\n", x);

            else

                System.out.printf("+%.4E\n", x);

        }

        sc.close();

    }

}