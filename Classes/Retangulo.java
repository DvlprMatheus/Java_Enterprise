// Separação do pacote na pasta Classes.
package Classes;

// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Importação do método para ser chamado na função principal.
import static Services.RetanguloService.meuCalculo;

// Criação da classe
public class Retangulo {

    // Atributo comprimento.
    public static int comprimento = 0;

    // Atributo altura.
    public static int altura = 0;

    // Função principal que chama o método e coleta as informações do usuário.
    public static void main(String[] args){

        // Input do comprimento.
        Scanner compObj = new Scanner(System.in);
        System.out.print("Digite o comprimento do retângulo: ");

        // Alocação da informação dentro do atributo comprimento.
        comprimento = compObj.nextInt();

        // Input da altura.
        Scanner largObj = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");

        // Alocação da informação dentro do atributo altura.
        altura = largObj.nextInt();

        // Chamada do método.
        meuCalculo();
    }
}