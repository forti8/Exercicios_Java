class main
{
    public static void main (String[] args)
    {
        Estudante miguel = new Estudante("Miguel Granville");
        miguel.insereNotas();
        System.out.println(miguel.calculaMedia());
    }
}