// Separação do pacote na pasta Classes.
package Classes;

// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Importação do método para ser chamado na função principal.
import static Services.TrianguloService.valObj;

// Criação da classe.
public class Triangulo {

    // Atributo primeiro lado.
    public int lado1 = 0;

    // Atributo segundo lado.
    public int lado2 = 0;

    // Atributo terceiro lado.
    public int lado3 = 0;

    // Objeto Global.
    public static Triangulo triangObj = new Triangulo();

    // Função principal que coleta os dados e inicia o método.
    public static void main(String[] args){

        // Input do primeiro lado.
        Scanner lado1Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do primeiro lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado1 = lado1Obj.nextInt();

        // Input do segundo lado.
        Scanner lado2Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do segundo lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado2 = lado2Obj.nextInt();

        // Input do terceiro lado.
        Scanner lado3Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do terceiro lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado3 = lado3Obj.nextInt();

        // Chamada do método.
        valObj();
    }
}