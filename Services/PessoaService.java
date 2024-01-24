// Diretório.
package Services;

// Importação da Classe Pessoa para construir o Service.
import Entity.Pessoa;

// Service especializado em descrever o usuário e validar sua idade.
public class PessoaService extends Pessoa {
    public void setValIdade(){
        if(idade > 18) {
            System.out.printf("Seu nome é %s, você tem %.2f de altura.\nE você é maior de idade!", nome, altura);
        } else {
            System.out.printf("Seu nome é %s, você tem %.2f de altura.\nE você é maior de idade!", nome, altura);
        }
    }
}