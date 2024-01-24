// Diretório
package Services;

// Importação da Classe Cachorro para construir o Service.
import Entity.Cachorro;

// Service especializado na ação de fazer ele latir.
public class CachorroService extends Cachorro {
    public String getLatir() {
        return "Woof! Woof!";
    }
}