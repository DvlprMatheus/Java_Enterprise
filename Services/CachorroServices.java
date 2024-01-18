// Separação do pacote na pasta Services.
package Services;

// Importação da classe Cachorro com os atributos necessários.
import Classes.Cachorro;

// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe CachorroService complementado pela Cachorro.
public class CachorroServices extends Cachorro{

    // Método para especificar os atributos e fazer ele latir.
    public static void acaoLatir(){
        // Objeto criado para pegar os atributos.
        Cachorro dogObj = new Cachorro();

        // Input de resposta do usuário.
        Scanner confirmObj = new Scanner(System.in);
        System.out.printf("Conheça %s, ele é um %s e tem %d ano(s).\nDeseja acaricia-lo? ", dogObj.nome, dogObj.raca, dogObj.idade);

        // Coleta de dados
        String confirm = confirmObj.nextLine();

        // Condição que verifica a resposta do usuário.
        if(confirm.equals("s") || confirm.equals("S") || confirm.equals("Sim") || confirm.equals("sim")){
            System.out.println("Woof! woof! Ele late de felicidade com seu carinho!");
        } else {
            System.out.println("Woof! Ele late e gosta da sua companhia mesmo assim.");
        }
    }
}