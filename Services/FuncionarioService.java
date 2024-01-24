// Diretório.
package Services;

// Importação da Classe Funcionario para construir o Service.
import Entity.Funcionario;

// Service especializado em realizar o aumento do salário.
public class FuncionarioService extends Funcionario {
    public void setAumento(double aumentoSalario) {
        salario = salario + ((aumentoSalario/100) * salario);
    }
}
