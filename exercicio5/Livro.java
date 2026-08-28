class Livro extends ItemAcervo
{
    private boolean disponivel;

    public Livro (String titulo)
    {
        super(titulo);
        this.disponivel = true;
    }

    public boolean isDisponivel ()
    {
        return this.disponivel;
    }

    public void emprestar ()
    {
        if (this.disponivel)
        {
            this.disponivel = false;
            System.out.println("Livro '" + getTitulo() + "' emprestado com sucesso!");
        }
        else
        {
            System.out.println("Livro '" + getTitulo() + "' já está emprestado.");
        }
    }

    public void devolver ()
    {
        if (!this.disponivel)
        {
            this.disponivel = true;
            System.out.println("Livro '" + getTitulo() + "' devolvido com sucesso!");
        }
        else
        {
            System.out.println("Livro '" + getTitulo() + "' já estava disponível.");
        }
    }
}