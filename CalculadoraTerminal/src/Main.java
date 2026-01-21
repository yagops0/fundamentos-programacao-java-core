import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // UMA CALCULADOR NO CLI PARA RELEMBRAR CONCEITOS BÁSICOS

        // O QUE EU QUERO NA CALCULADORA?
        // OPERAÇÕES: + , - , x , /

        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao, continuar;

        System.out.println("========== CALCULADORA ==========");
        do {
            System.out.println("= Escolha a operação que deseja fazer (+: adição, -: subtração, x: multiplicação, /: divisão, %: porcentagem): ");
            operacao = scan.nextLine().charAt(0);

            switch (operacao){
                case '+':
                    System.out.println("======= ADIÇÃO =======");
                    System.out.println();
                    System.out.println("= Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.println();
                    System.out.println("= Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println();
                    System.out.println("======= RESULTADO =======");
                    resultado = num1 + num2;
                    System.out.printf("%.5f + %.5f = %.5f %n", num1, num2, resultado); // PARA MOSTRAR UM NUMERO DECIMAL COM SUAS CASAS DECIMAIS DELIMITADAS UTILIZASSE %.ALGUMNUMEROf
                    break;

                case '-':
                    System.out.println("======= SUBTRAÇÃO =======");
                    System.out.println();
                    System.out.println("= Digiteo primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.println();
                    System.out.println("= Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println();
                    System.out.println("======= RESULTADO =======");
                    resultado = num1 - num2;
                    System.out.printf("%.5f - %.5f = %.5f %n", num1, num2, resultado);
                    break;

                case 'x':
                    System.out.println("======= MULTIPLICAÇÃO =======");
                    System.out.println();
                    System.out.println("= Digiteo primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.println();
                    System.out.println("= Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println();
                    System.out.println("======= RESULTADO =======");
                    resultado = num1 * num2;
                    System.out.printf("%.5f x %.5f = %.5f %n", num1, num2, resultado);
                    break;
                case '/':
                    System.out.println("======= DIVISÃO =======");
                    System.out.println();
                    System.out.println("= Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.println();
                    System.out.println("= Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("======= RESULTADO =======");
                    resultado = num1 / num2;
                    System.out.printf("%.5f / %.5f = %.5f %n", num1, num2, resultado);
                    break;
                case '%':
                    System.out.println("======= PORCENTAGEM =======");
                    System.out.println("= Digite o número que deseja ver a porcentaem: ");
                    num1 = scan.nextDouble();
                    System.out.println("= Digite a porcentagem que quer ver: ");
                    num2 = scan.nextDouble();
                    System.out.println("======= RESULTADO =======");
                    resultado = (num2 / 100) * num1;
                    System.out.printf("%.5f%% DE %.5f é igual a %.5f %n", num2, num1, resultado);
            }

            scan.nextLine();
            System.out.println("Deseja continuar utilizando a calculadora? (s - sim / n - não)");
            continuar = scan.nextLine().charAt(0);

        }while (continuar == Character.toLowerCase('s'));

    }
}
