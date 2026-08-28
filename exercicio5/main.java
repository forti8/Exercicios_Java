class Main
{
    public static void main (String[] args)
    {
        Livro livro1 = new Livro("Dom Casmurro");
        System.out.println("--- LIVRO ---");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Está disponível? " + livro1.isDisponivel());
        livro1.emprestar();
        System.out.println("Está disponível? " + livro1.isDisponivel());

        livro1.devolver();
        System.out.println("Está disponível? " + livro1.isDisponivel());
        Periodico revista = new Periodico("National Geographic", 42);

        System.out.println("\n--- PERIÓDICO ---");
        System.out.println("Título: " + revista.getTitulo());
        System.out.println("Volume: " + revista.getVolume());
        System.out.println("(Periódicos não podem ser emprestados)");
    }
}