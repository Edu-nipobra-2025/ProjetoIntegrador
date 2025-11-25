package com.br.ProjetoIntegrador.enums;

public enum TipoDespesa {
    DOCUMENTACAO("Gasto por documentação."),
    MANUTENCAO("Gasto por manutenção.");

private final String descricao;

private TipoDespesa(String descricao){
    this.descricao = descricao;

}
public String getDescricao(){
    return descricao;
}
}
