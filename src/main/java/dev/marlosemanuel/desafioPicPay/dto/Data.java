package dev.marlosemanuel.desafioPicPay.dto;

public class Data {
    private boolean authorization;

    public Data(boolean authorization) {
        this.authorization = authorization;
    }

    public boolean isAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

}
