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
        String caracteresEspeciais = "@_-";
        char continuar;
        boolean validacaoSenha;
        validacaoSenha = false;

        senha = "1@Pm";

        char auxiliarSenha, auxiliarCharEspecial;

        for (int i = 0; i < senha.length(); i++){
            auxiliarSenha = senha.charAt(i);

            // POR QUE É NECESSÁRIO FAZER ISSO?
            // PORQUE PARA CADA CHAR DA  SENHA, EU PRECISO VERIFICAR SE É IGUAL A ALGUM CHAR DOS CHAR ESPECIAL
            for(int j = 0; j < caracteresEspeciais.length(); j++){
                auxiliarCharEspecial = caracteresEspeciais.charAt(j);
                if (auxiliarSenha == auxiliarCharEspecial){
                    System.out.println("igual");
                }else{
                    System.out.println("não igual");
                }
            }


        }
//        System.out.println(senha.length());
//
//        for (int i = 0; i < senha.length(); i++){
//            System.out.println("letra: " + senha.toUpperCase().charAt(i) + " posição: " + i);
//        }

//        do {
//            System.out.println("=============== VALIDADOR DE SENHA ===============");
//            while (!validacaoSenha){
//                System.out.println("= Digite uma senha ela deve conter caracteres especiais (apenas @, _, -), letras maiusculas, letras minusculas e numeros: ");
//                senha = scan.nextLine();
//
//
//
//
//            }
//
//            System.out.println("= Deseja continuar utilizando o programa? (s - sim / n - não)?");
//            continuar = scan.nextLine().charAt(0);
//
//
//        }while (continuar == Character.toLowerCase('s'));
    }
}
