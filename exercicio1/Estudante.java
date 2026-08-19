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
            System.out.println("Insira a nota " + (i+1) + " abaixo: ");
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

    public String getNome ()
    {
        return this.nome;
    }

    public double[] getNotas ()
    {
        return this.notas;
    }

    public int getTamanho ()
    {
        return this.tamanhoArray;
    }

    public double menorNota ()
    {
        double menor = 11;
        for(int i = 0; i<this.tamanhoArray; i++)
        {
            double nota = this.notas[i];
            if(nota < menor)
            {
                menor = nota;
            }
        }

        return menor;
    }
}