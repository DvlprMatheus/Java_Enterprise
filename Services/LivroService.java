// Separação do pacote na pasta Services.
package Services;

// Importação da classe Livro com os atributos necessários.
import Classes.Livro;

// Criação da classe LivroService complementado pela Livro.
public class LivroService extends Livro{

    // Método para exibir as informações do livro ao usuário.
    public static void sobreLivro(){
        // Objeto criado para pegar os atributos.
        Livro livObj = new Livro();

        // Exibição dos dados
        System.out.printf("---------- Sobre o Livro ----------\nTítulo: %s\nAutor: %s\nAno Publicado: %d\n-----------------------------------\n", livObj.titulo, livObj.autor, livObj.ano_publicado);
    }
}