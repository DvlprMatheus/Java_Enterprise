// Separação do pacote na pasta Services.
package Services;

// Importação da classe Funcionario com os atributos necessários.
import Classes.Funcionario;

// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe FuncionarioService complementado pela Funcionario.
public class FuncionarioService extends Funcionario {
    // Método criado para realizar o aumento no salário, informando toda descrição do funcionário.
    public static void aumentSalario(){
        // Objeto para acessar atributos.
        Funcionario funcObj = new Funcionario();

        // Input da porcentagem desejada.
        Scanner aumentObj = new Scanner(System.in);
        System.out.print("Digite a porcentagem de aumento: ");

        // Coleta de dados.
        double nmr_porcentagem = aumentObj.nextInt();

        // Conta da porcentagem e adição sobre o salário antigo, já resultando no salário atual com aumento.
        double salario_final = funcObj.salario + ((nmr_porcentagem/100) * funcObj.salario);

        // Exibição das informações.
        System.out.printf("---------- Info Funcionário ----------\nNome: %s\nCargo: %s\nSalário antigo: %.2f\nSalário atual: %.2f\n--------------------------------------", funcObj.nome, funcObj.cargo, funcObj.salario, salario_final);
    }
}