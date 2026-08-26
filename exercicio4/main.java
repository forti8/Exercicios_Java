class Main
{
    public static void main (String[] args)
    {
        Estudante aluno = new Estudante("Miguel Granville");

        aluno.insereNotas();
        int[] pesos = { 2, 2, 3, 1, 2 };

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Menor nota: " + aluno.menorNota());
        System.out.println("Média simples: " + aluno.calculaMedia());
        System.out.println("Média ponderada: " + aluno.calculaMedia(pesos));
    }
}