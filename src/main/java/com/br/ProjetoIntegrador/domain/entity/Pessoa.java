package com.br.ProjetoIntegrador.domain.entity;
import com.br.ProjetoIntegrador.exception.PessoaException;

import java.util.Date;
public class Pessoa {
  private String endereco;
    private String cpfcnpj;
    private String nome;
    private Date datanascimento;

    public Pessoa (String endereco, String cpfcnpj, String nome, Date datanascimento){
        this.endereco = endereco;
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
        this.datanascimento = datanascimento;
    }

public String getEndereco(){
    return endereco;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public String getCpfcnpj(){
    return cpfcnpj;
}

public void setCpfcnpj(String cpfcnpj){
    this.cpfcnpj = cpfcnpj;
}
public String getNome(){
        return nome;
}
public void setNome(String nome){
        this.nome = nome;

}
public Date getDataNascimento() {
    return datanascimento;
}
public void setDatanascimento(Date datanascimento){
        this.datanascimento = datanascimento;
        Date hoje = new Date();

        // A lógica de erro permanece a mesma
        if (datanascimento.after(hoje)) {
            // Lançando a exceção importada
            throw new PessoaException.DataNascimentoInvalidaException("A data de nascimento não pode ser uma data futura. Data fornecida: " + datanascimento);
        }

        this.datanascimento = datanascimento;
    }
}


