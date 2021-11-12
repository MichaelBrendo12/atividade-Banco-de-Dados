
package com.mycompany.atvbancod.cadastro.model;
public class Professor {
        private String cpf; 
	private String nome_professor;
	private String email;
	private int telefone;

    public Professor(String cpf, String nome_professor, String email, int telefone) {
        this.cpf = cpf;
        this.nome_professor = nome_professor;
        this.email = email;
        this.telefone = telefone;
    }

    public Professor() {
        this.cpf = null;
        this.nome_professor = null;
        this.email = null;
        this.telefone = 0;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
        

}
