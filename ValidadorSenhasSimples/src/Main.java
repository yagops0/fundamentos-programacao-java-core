import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *  = O QUE FAZER?
        *  = PEDIR PARA O USUÁRIO DIGITAR UMA SENHA SEGUINDO AS OBJEÇÕES ESPECIFICADAS
        *  = VERIFICAR SE A SENHA COMPLETA TODAS AS ESPECIFICAÇÕES
        *  = PEDIR PARA O USUÁRIO DIGITAR A SENHA E VERIFICAR SE É CORRETA
        *  = UTILIZAR A OS MÉTODOS 'is' DA CLASSE CHARACTER
        * */
        Scanner scan = new Scanner(System.in);
        String senha;
        String caracter
        char continuar;
        boolean validacaoSenha;
        validacaoSenha = false;
//        System.out.println(senha.length());
//
//        for (int i = 0; i < senha.length(); i++){
//            System.out.println("letra: " + senha.toUpperCase().charAt(i) + " posição: " + i);
//        }

        do {
            System.out.println("=============== VALIDADOR DE SENHA ===============");
            while (!validacaoSenha){
                System.out.println("= Digite uma senha ela deve conter caracteres especiais (apenas @, _, -), letras maiusculas, letras minusculas e numeros: ");
                senha = scan.nextLine();


            }
            System.out.println("=");
        }while (continuar == Character.toLowerCase('s'));
    }
}
