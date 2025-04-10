import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        /**
         * parametros sao os "args" que sao passados como se fosse um input do usuario escrever no cmd ''
         */
        // mas por ser demorado a questao de digitar no arquivo json para ter as informações, usamos o SCANER, logo abaixo
                // String nome = args[0];
                // String sobrenome = args[1];
                // int idade = Integer.valueOf(args[2]);
                // double altura = Double.valueOf(args[3]);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Dgiite  sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("ola, meu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + " metros");
    }
    
    }

