// Diretório.
package Entity;

// Importação do Service para utilizar na função principal.
import Services.LivroService;

// Criação da classe.
public class Livro {

    // Atributos.
    public String titulo;
    public String autor;
    public int anoPublicado;

    // Métodos Setter para manipular os atributos.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    // Função principal que setta os atributos e chama o método que exibe a descrição ao usuário.
    public static void main(String[] args){
        LivroService book = new LivroService();

        book.setTitulo("A Paciente Silenciosa");
        book.setAutor("Alex Michaeledes");
        book.setAnoPublicado(2019);

        book.setDescLivro();
    }
}