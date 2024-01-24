// Diretório.
package Services;

// Importação da Classe Aluno para construir o Service.
import Entity.Aluno;

// Service especializado em calcular a média.
public class AlunoService extends Aluno {
    public void setMedia(double pmrNota, double sgdNota, double trcNota) {
        media = (pmrNota + sgdNota + trcNota)/3;
    }
}