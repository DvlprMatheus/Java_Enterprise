// Separação do pacote na pasta Classes.
package Classes;

// Importação do método para ser chamado na função principal.
import static Services.AlunoService.calcMedia;

// Criação da classe.
public class Aluno {

    // Atributo nome.
    public String nome = "";

    // Atributo primeira nota.
    public float nota1 = 0;

    // Atributo segunda nota.
    public float nota2 = 0;

    // Atributo terceira nota.
    public float nota3 = 0;

    // Função principal que inicia o método.
    public static void main(String[] args){
        calcMedia();
    }
}