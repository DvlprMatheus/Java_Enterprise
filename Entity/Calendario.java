// Diretório.
package Entity;

// Importação do Service para utilizar na função principal.
import Services.CalendarioService;

// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação de classe.
public class Calendario {

    // Atributos.
    private int dia;
    private int mes;
    private int ano;

    // Métodos Getter e Setter para manipular os atributos.
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Função principal que setta os atributos e chama o método de validação da data.
    public static void main(String[] args){
        CalendarioService calendar = new CalendarioService();

        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Digite um dia (Apenas número): ");
            calendar.setDia(scan.nextInt());

            System.out.print("Digite um mês (Apenas número): ");
            calendar.setMes(scan.nextInt());

            System.out.print("Digite um ano (Apenas número): ");
            calendar.setAno(scan.nextInt());

            calendar.setValData(calendar.getDia(), calendar.getMes(), calendar.getAno());

        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}