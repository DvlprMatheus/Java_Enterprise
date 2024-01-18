// Separação do pacote na pasta Services.
package Services;

// Importação da classe Triangulo com os atributos necessários.
import Classes.Triangulo;

// Criação da classe TrianguloService complementado pela Triangulo.
public class TrianguloService extends Triangulo {

    // Método que realiza a verificação do triângulo.
    public static void valObj(){
        if(triangObj.lado1 == triangObj.lado2 && triangObj.lado1 == triangObj.lado3){
            System.out.println("O triângulo é válido!");
        } else {
            System.out.println("O triângulo não é valido!");
        }
    }
}