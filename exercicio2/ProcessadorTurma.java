import java.util.ArrayList;
public class ProcessadorTurma {

    public static Estudante[] filtraAprovados(Estudante[] turma) {
        if (turma == null || turma.length == 0) {
            return null;
        }

        int qtdAprovados = 0;
        for (int i = 0; i < turma.length; i++) {
            if (turma[i] != null && turma[i].calculaMedia() >= 6.0) {
                qtdAprovados++;
            }
        }

        if (qtdAprovados == 0) {
            return null;
        }

        Estudante[] aprovados = new Estudante[qtdAprovados];
        int posicao = 0;

        for (int i = 0; i < turma.length; i++) {
            if (turma[i] != null && turma[i].calculaMedia() >= 6.0) {
                aprovados[posicao] = turma[i];
                posicao++;
            }
        }

        return aprovados;
    }
}