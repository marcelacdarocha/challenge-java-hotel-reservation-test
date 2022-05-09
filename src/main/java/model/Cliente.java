package model;

public enum Cliente {

    REGULAR("Regular"),
    REWARDS("Rewards");

    private final String descricao;

    Cliente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
