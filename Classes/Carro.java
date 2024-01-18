// Separação do pacote na pasta Classes.
package Classes;

// Importação do método para ser chamado na função principal.
import static Services.CarroService.testDrive;

// Criação da classe
public class Carro {

    // Atributo modelo.
    public static String modelo = "Divo";

    // Atributo marca.
    public static String marca = "Bugatti";

    // Atributo ano.
    public static int ano = 2020;

    // Função principal que inicia o método
    public static void main(String[] args){
        testDrive();
    }
}