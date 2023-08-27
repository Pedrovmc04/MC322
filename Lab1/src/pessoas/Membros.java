public class Membros {
    private String nome;
    private String dataNascimento;
    private String endereco;

    public Membros(String nome, String dataNascimento, String endereco){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public  String getDataNascimento(){
        return dataNascimento;
    }

    public String getEndereco(){
        return endereco;
    }

    public String toString(){
        return "Nome: " + nome
                +"\nData de Nascimento:" + dataNascimento
                +"\nEndereço:" + endereco;
    }
}
