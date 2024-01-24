// Diretório
package Services;

// Importação da Classe ContaBancaria para construir o Service.
import Entity.ContaBancaria;

// Service especializado em realizar depósito e saque.
public class ContaBancariaService extends ContaBancaria {
    public void setDeposito(double deposito){
        saldo = saldo + deposito;
    }

    public void setSaque(double saque){
        saldo = saldo - saque;
    }
}
