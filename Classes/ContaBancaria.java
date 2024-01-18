// Separação do pacote na pasta Classes.
package Classes;

// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Importação do método para ser chamado na função principal.
import static Services.ContaBancariaServices.meuSys;

// Criação da classe.
public class ContaBancaria {

    // Objeto Global.
    public static ContaBancaria minhaAcao = new ContaBancaria();

    //------------------- Atributo conta (Necessário para entrar)-------------------
    public String nmr_conta = "98765-4";

    // Atributo saldo.
    public double saldo = 99.9;


    // Função principal que valida o número da conta e entra no sistema.
    public static void main(String[] args){

        // Input da conta para validação
        Scanner valObj = new Scanner(System.in);
        System.out.print("Seja bem vindo ao Banco Omotor!\nDigite o número da sua conta: ");

        // Coleta de dados
        String validacao = valObj.nextLine();

        // Condição que valida a conta que o usuário colocou e a que está cadastrada.
        if(validacao.equals(minhaAcao.nmr_conta)){
            meuSys();
        } else {
            System.out.println("Conta inválida ou não digitada corretamente!");
        }
    }
}