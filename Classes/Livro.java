// Separação do pacote na pasta Classes.
package Classes;

// Importação do método para ser chamado na função principal.
import static Services.LivroService.sobreLivro;

// Criação da classe.
public class Livro {

    // Atributo título.
    public String titulo = "A Paciente Silenciosa";

    // Atributo autor.
    public String autor = "Alex Michaelides";

    // Atributo ano publicado.
    public int ano_publicado = 2019;

    // Função principal que inicia o método.
    public static void main(String[] args){
        sobreLivro();
    }
}