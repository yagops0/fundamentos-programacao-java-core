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
            }

            scan.nextLine();
            System.out.println("Deseja continuar utilizando a calculadora? (s - sim / n - não)");
            continuar = scan.nextLine().charAt(0);

        }while (continuar == Character.toLowerCase('s'));

    }
}
