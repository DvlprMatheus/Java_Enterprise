package Classes;

import static Services.FuncionarioService.aumentSalario;

// Criação da classe.
public class Funcionario {

    // Atributo nome.
    public String nome = "João Pedro";

    // Atributo cargo.
    public String cargo = "Desenvolvedor Junior";

    // Atributo salário.
    public double salario = 1500.00;

    // Função principal que inicia o método.
    public static void main(String[] args){
        aumentSalario();
    }
}