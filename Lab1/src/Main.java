public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter","Pedro","111-0-123");
        Membros membro = new Membros("Pedro Victor","16/04/2004","Rua rua");
        Funcionario funcionario = new Funcionario("Thiago","Atendente");

        emprestimo(livro,membro);

        System.out.println(livro);
    }

    private static void emprestimo(Livro livro,Membros membro){
        System.out.println(livro.getTitulo() + " emprestado para " + membro.getNome());
        livro.markAvailable();
    }
}