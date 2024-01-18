// Separação do pacote na pasta Classes.
package Classes;

// Importação do método para ser chamado na função principal.
import static Services.CalendarioService.methValidacao;

// Criação de classe.
public class Calendario {

    // Atributo dia.
    public int dia = 31;

    // Atributo mês.
    public int mes = 12;

    // Atributo ano máximo.
    public int ano_max = 2100;

    // Atributo ano mínimo.
    public int ano_min = 1500;

    // Função principal que inicia o método.
    public static void main(String[] args){
        methValidacao();
    }
}