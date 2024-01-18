// Separação do pacote na pasta Classes.
package Classes;

// Importação do método para ser chamado na função principal.
import static Services.CachorroServices.acaoLatir;

// Criação da classe.
public class Cachorro {

    // Atributo nome.
    public String nome = "Andory";

    // Atributo raça.
    public String raca = "Yorkshire";

    // Atributo idade.
    public int idade = 2;

    // Função principal que inicia o método.
    public static void main(String[] args){
        acaoLatir();
    }
}