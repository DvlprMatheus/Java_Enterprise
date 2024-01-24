// Diretório.
package Services;

// Importação da Classe Triangulo para construir o Service.
import Entity.Triangulo;

// Service especializado em calcular a área.
public class TrianguloService extends Triangulo {
    public void setValTriangulo() {
        valTriangulo = lado1 == lado2 && lado1 == lado3;
    }
}