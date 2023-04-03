import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        //Declaração de variáveis;

        int number, result; 

        //Pedindo entrada de dados do usuário    
        System.out.println("informe o número que você deseja saber a tabuada");

        //Atribuindo valor a variavel number
        number = input.nextInt();

        //Estrutura de repetição for para exibição dos resultados em tela;
        for(int i = 0; i<=10; i++){
        result = (number*i);
        System.out.println("" +result);

       }
    }
}
