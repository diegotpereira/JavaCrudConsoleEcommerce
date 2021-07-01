package br.com.java.model;

public class Usuario {
	
	private String login;
	private String senha;
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	
	

    /**
     * @return String return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Usuario() {}

	public Usuario(String login, String senha, String nome, String cpf, String telefone, String endereco) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + ", telefone="
				+ telefone + ", endereco=" + endereco + "]";
	}
}
