// Separação do pacote na pasta Classes.
package Classes;

// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Importação do método para ser chamado na função principal.
import static Services.PessoaService.valIdade;

// Criação da classe.
public class Pessoa {

    // Atributo nome.
    public String nome = "";

    // Atributo idade.
    public int idade = 0;

    // Atributo altura.
    public float altura = 0;

    // Objeto Global
    public static Pessoa user = new Pessoa();

    // Função principal que coleta as informações e chama o método de validação.
    public static void main(String[] args){

        // Input do nome.
        Scanner nomeObj = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        // Coleta de dados.
        user.nome = nomeObj.nextLine();

        // Input da idade.
        Scanner idadeObj = new Scanner(System.in);
        System.out.print("Digite sua idade: ");

        // Coleta de dados.
        user.idade = idadeObj.nextInt();

        // Input da altura.
        Scanner alturaObj = new Scanner(System.in);
        System.out.print("Digite sua altura: ");

        // Coleta de dados.
        user.altura = alturaObj.nextFloat();

        // Chamada do método.
        valIdade();
    }
}