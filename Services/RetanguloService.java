// Separação do pacote na pasta Services.
package Services;

// Importação da classe Retangulo com os atributos necessários.
import Classes.Retangulo;

// Criação da classe RetanguloService complementado pela Retangulo.
public class RetanguloService extends Retangulo {

    // Método criado para realizar o cálculo da área, utilizando as informação digitadas pelo usuário.
    public static void meuCalculo(){
        int area = comprimento * altura;
        System.out.println("O resultado da área é: " + area);
    }
}