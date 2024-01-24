// Diretório.
package Services;

// Importação da Classe Livro para construir o Service.
import Entity.Livro;

// Service especializado em descrever o livro para o usuário.
public class LivroService extends Livro {
    public void setDescLivro(){
        System.out.printf("---------- Descrição do Livro ----------\nTitulo: %s\nAutor: %s\nAno Publicado: %d\n----------------------------------------", titulo, autor, anoPublicado);
    }
}