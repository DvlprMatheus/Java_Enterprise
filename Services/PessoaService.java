// Separação do pacote na pasta Services.
package Services;

// Importação da classe Pessoa com os atributos necessários.
import Classes.Pessoa;

// Criação da classe PessoaService complementado pela Pessoa.
public class PessoaService extends Pessoa {

    // Método para validar se é maior ou menor de idade.
    public static void valIdade(){
        if(user.idade >= 18){
            System.out.printf("\nSeu nome: %s\nSua idade: %d\nSua altura: %.2f\nVocê é maior de idade!\n", user.nome, user.idade, user.altura);
        } else {
            System.out.printf("\nSeu nome: %s\nSua idade: %d\nSua altura: %.2f\nVocê é menor de idade!\n", user.nome, user.idade, user.altura);
        }
    }
}