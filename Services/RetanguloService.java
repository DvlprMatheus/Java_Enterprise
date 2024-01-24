// Diretório.
package Services;

// Importação da Classe Retangulo para construir o Service.
import Entity.Retangulo;

// Service especializado em calcular a área.
public class RetanguloService extends Retangulo {
    public void setArea(int comprimento, int altura){
        int areaRetangulo = comprimento * altura;
        System.out.println("A área do retângulo é: " + areaRetangulo);
    }
}