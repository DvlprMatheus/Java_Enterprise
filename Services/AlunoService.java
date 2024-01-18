// Separação do pacote na pasta Services.
package Services;

// Importação da classe Aluno com os atributos necessários.
import Classes.Aluno;

// Criação da classe AlunoService complementado pela Aluno.
public class AlunoService extends Aluno {

    // Método que é distribuido as informações e feito os cálculos de média.
    public static void calcMedia(){

        // Objetos de cada aluno.
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        Aluno aluno03 = new Aluno();

        // Aluno 1.
        aluno01.nome = "Gabriel Damasceno";
        aluno01.nota1 = 7;
        aluno01.nota2 = 9;
        aluno01.nota3 = 8;

        // Aluno 2.
        aluno02.nome = "Monyke Angel";
        aluno02.nota1 = 5;
        aluno02.nota2 = 9;
        aluno02.nota3 = 10;

        // Aluno 3.
        aluno03.nome = "Ariany Silva";
        aluno03.nota1 = 4;
        aluno03.nota2 = 10;
        aluno03.nota3 = 10;

        // Médias.
        float media_a = (aluno01.nota1 + aluno01.nota2 + aluno01.nota3)/3;
        float media_b = (aluno02.nota1 + aluno02.nota2 + aluno02.nota3)/3;
        float media_c = (aluno03.nota1 + aluno03.nota2 + aluno03.nota3)/3;

        // Exibição da tabela de resultados finais.
        System.out.printf("---------- Médias Escolar ----------\n%s = %.1f\n%s = %.1f\n%s = %.1f\n------------------------------------",aluno01.nome, media_a, aluno02.nome, media_b, aluno03.nome, media_c);
    }
}