import java.util.Scanner;

public class Estudante {
    private final int tamanhoArray = 5;
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[this.tamanhoArray];
    }

    public void insereNotas() {
        Scanner meuScanner = new Scanner(System.in);

        for (int i = 0; i < this.tamanhoArray; i++) {
            System.out.print("Insira a nota " + (i + 1) + " abaixo: ");
            this.notas[i] = meuScanner.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0.0;

        for (int i = 0; i < this.tamanhoArray; i++) {
            soma += this.notas[i];
        }

        return soma / this.tamanhoArray;
    }

    public double calculaMedia(int[] pesos) {
        if (pesos == null || pesos.length != this.tamanhoArray) {
            System.out.println("Erro: O array de pesos deve conter exatamente " + this.tamanhoArray + " elementos.");
            return 0.0;
        }

        double somaPonderada = 0.0;
        int somaPesos = 0;

        for (int i = 0; i < this.tamanhoArray; i++) {
            somaPonderada += this.notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        if (somaPesos == 0) {
            return 0.0;
        }

        return somaPonderada / somaPesos;
    }

    public String getNome() {
        return this.nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public int getTamanho() {
        return this.tamanhoArray;
    }

    public double menorNota() {
        double menor = this.notas[0];
        for (int i = 1; i < this.tamanhoArray; i++) {
            if (this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }
}