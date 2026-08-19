class main
{
    public static void main (String[] args)
    {
        Estudante aluno = new Estudante("Miguel Granville");
        
        String nomeAluno = aluno.getNome();

        aluno.insereNotas();
        double[] notasAluno = aluno.getNotas();

        System.out.println("Nome do aluno: "+nomeAluno);

        int tamanhoArrayNotas = aluno.getTamanho();

        for(int i = 0; i<tamanhoArrayNotas; i++)
        {
            System.out.println("Nota " + (i+1) + ": "+notasAluno[i]);
        }

        System.out.println("Média final: " + aluno.calculaMedia());
    }
}