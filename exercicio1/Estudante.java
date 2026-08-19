import java.util.Scanner;

class Estudante 
{
    private final int tamanhoArray = 5;
    private String nome;
    private double[] notas;

    public Estudante (String nome)
    {
        this.nome = nome;
        this.notas = new double[this.tamanhoArray];
    }

    public void insereNotas ()
    {
        Scanner meuScanner = new Scanner(System.in);

        for (int i = 0; i<this.tamanhoArray; i++)
        {
            this.notas[i] = meuScanner.nextDouble();
        }
    }

    public double calculaMedia ()
    {
        double media = .0;

        for (int i = 0; i<this.tamanhoArray; i++)
        {
            media += this.notas[i];
        }

        return (media / this.tamanhoArray);
    }
}