package exercicio2;

public class Main {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("Miguel Granville");

        aluno.insereNotas();

        String nomeAluno = aluno.getNome();
        double[] notasAluno = aluno.getNotas();
        int tamanhoArrayNotas = aluno.getTamanho();

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Nome do aluno: " + nomeAluno);

        for (int i = 0; i < tamanhoArrayNotas; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notasAluno[i]);
        }

        System.out.println("Menor nota: " + aluno.menorNota());
        System.out.println("Média final: " + aluno.calculaMedia());
    }
}