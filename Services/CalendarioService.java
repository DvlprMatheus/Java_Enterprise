// Diretório.
package Services;

// Importação da Classe Calendario para construir o Service.
import Entity.Calendario;

// Service especializado em validar a data digitada pelo usuário.
public class CalendarioService extends Calendario {
    public void setValData(int dia, int mes, int ano){
        if(ano < 1900 || ano > 2100) {
            System.out.println("Ano inválido!");
        } else {
            if(mes > 12) {
                System.out.println("Mês inválido!");
            } else {
                switch (mes){
                    case 1, 3, 5, 7, 8, 10, 12:
                        if(dia > 31){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                    case 2:
                        if(dia > 28){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                    case 4, 6, 9, 11:
                        if(dia > 30){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                }
            }
        }
    }
}