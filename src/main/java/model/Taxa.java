package model;

public class Taxa {

    Integer valorRegular;
    Integer valorReward;

    public Taxa(Integer valorRegular, Integer valorReward) {
        this.valorRegular = valorRegular;
        this.valorReward = valorReward;
    }

    public Integer getValorRegular() {
        return valorRegular;
    }

    public void setValorRegular(Integer valorRegular) {
        this.valorRegular = valorRegular;
    }

    public Integer getValorReward() {
        return valorReward;
    }

    public void setValorReward(Integer valorReward) {
        this.valorReward = valorReward;
    }
}
