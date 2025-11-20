package jdev.mentoria.lojavirtual.enums;

public enum StatusContaPagar {
    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    ALUGUEL("Aluguel"),
    FUNCIONARIO("Funcionário"),
    NEGOCIADA("Renegociada");

    private final String descricao;
    
    StatusContaPagar(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

}
