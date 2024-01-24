// Diretório.
package Entity;

// Importação do Service para utilizar na função principal.
import Services.PessoaService;

// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Pessoa {

    // Atributos.
    public String nome;
    public int idade;
    public double altura;

    // Métodos Setter para manipular os atributos.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Função principal que setta os atributos e valida a idade digitada pelo usuário.
    public static void main(String[] args) {
        PessoaService people = new PessoaService();

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            people.setNome(scan.nextLine());

            System.out.print("Digite sua idade: ");
            people.setIdade(scan.nextInt());

            System.out.print("Digite sua altura: ");
            people.setAltura(scan.nextDouble());

            people.setValIdade();

        } catch (Exception e) {
            System.out.println("Valor Inválido");
        }
    }
}