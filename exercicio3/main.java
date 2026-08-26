package exercicio4;

public class Main {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("Miguel Granville");

        aluno.insereNotas();

        // Definindo os 5 pesos para as notas
        int[] pesos = { 2, 2, 3, 1, 2 };

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média Simples: " + aluno.calculaMedia());
        System.out.println("Média Ponderada (pesos 2,2,3,1,2): " + aluno.calculaMedia(pesos));
    }
}