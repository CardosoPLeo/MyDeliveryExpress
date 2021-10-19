package model;

public class Funcionario {
    private Integer idFuncionario;
    private String nome;
    private String telefone;

    public Funcionario() {
        super();
    }

    public Funcionario(Integer idFuncionario, String nome, String telefone) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
