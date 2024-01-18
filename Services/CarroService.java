// Separação do pacote na pasta Services.
package Services;

// Importação da classe Carro com os atributos necessários.
import Classes.Carro;

// Criação da classe CarroService complementado pela Carro.
public class CarroService extends Carro {

    // Método criado para especificar todos os atributos do carro.
    public static void testDrive(){
        System.out.println("Seja bem vindo ao Test Drive!\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nAproveite sua jornada!");
    }
}