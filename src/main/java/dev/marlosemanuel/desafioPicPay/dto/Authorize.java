package dev.marlosemanuel.desafioPicPay.dto;

public class Authorize {
    private String status;
    private Data data;

    public Authorize(String status, Data data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
