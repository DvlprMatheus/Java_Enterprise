// Diretório
package Entity;

// Importação do Service para utilizar na função principal.
import Services.AlunoService;

// Criação da classe.
public class Aluno {

    // Atributo.
    private String nome;
    public double media;

    // Métodos Getter e Setter para manipular os atributos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    // Função principal que setta os atributos, e exibe ao usuário.
    public static void main(String[] args){
        AlunoService aluno = new AlunoService();

        aluno.setNome("Gabriel Damasceno");
        aluno.setMedia(5, 8, 9);

        System.out.printf("---------- Médias Escolares ----------\n%s = %.1f", aluno.getNome(), aluno.getMedia());

        aluno.setNome("João Pedro");
        aluno.setMedia(9, 7, 5.7);

        System.out.printf("\n%s = %.1f", aluno.getNome(), aluno.getMedia());

        aluno.setNome("Ariany Silva");
        aluno.setMedia(8, 6.4, 10);

        System.out.printf("\n%s = %.1f\n--------------------------------------", aluno.getNome(), aluno.getMedia());
    }
}