// Separação do pacote na pasta Services.
package Services;

// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Importação da classe ContaBancaria com os atributos necessários.
import Classes.ContaBancaria;

// Criação da classe ContaBancariaService complementado pela ContaBancaria.
public class ContaBancariaServices extends ContaBancaria{

    // Método de Depósito.
    static void meuDeposito(){

        // Input do valor.
        Scanner depObj = new Scanner(System.in);
        System.out.print("\nInforme o valor do depósito: ");

        // Coleta de dados.
        double deposito = depObj.nextDouble();

        // Adição do depósito e exibição do saldo.
        minhaAcao.saldo = minhaAcao.saldo + deposito;
        System.out.printf("Seu saldo atual é: R$ %.2f \n", minhaAcao.saldo);
        meuSys();
    }

    // Método de Saque.
    static void meuSaque(){

        // Input do valor.
        Scanner saqObj = new Scanner(System.in);
        System.out.print("\nInforme o valor do saque: ");

        // Coleta de dados.
        double saque = saqObj.nextDouble();

        // Condição para verificar se tem a quantidade solicitada para realizar o saque.
        if(saque > minhaAcao.saldo){
            System.out.println("Não foi possível efetuar o saque, valor maior do que possui na conta!");
            meuSaldo();
        } else {
            minhaAcao.saldo = minhaAcao.saldo - saque;
            System.out.printf("Seu saldo atual é: R$ %.2f \n", minhaAcao.saldo);
            meuSys();
        }
    }

    // Método de Saldo
    static void meuSaldo(){

        // Exibe o valor do saldo
        System.out.printf("\nSeu saldo é: R$ %.2f \n", minhaAcao.saldo);
        meuSys();
    }

    // Método utilizado como interface do usuário para realizar as outras funcionalidades.
    public static void meuSys(){
        Scanner escObj = new Scanner(System.in);
        System.out.print("\n1) Depósito\n2) Saque\n3) Saldo\n4) Sair\nDigite sua escolha: ");

        int escolha = escObj.nextInt();

        switch(escolha){
            case 1:
                meuDeposito();
                break;
            case 2:
                meuSaque();
                break;
            case 3:
                meuSaldo();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Escolha um número entre 1 e 2\n");
                meuSys();
        }
    }
}