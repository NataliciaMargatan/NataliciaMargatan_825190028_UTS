package com.company;

public class SGD {
    public float nominal;

    public SGD(float nominal) {
        this.nominal = nominal;
    }

    public SGD() {
        nominal = 1;
    }

    public float getNominal() {
        return nominal;
    }

    public void setNominal(float nominal) {
        this.nominal = nominal;
    }

    public float sgd (float nominal) {
        return nominal/10000;
    }

    public String toString() {
        return  "Uang yang anda masukkan : IDR " + nominal +
                "\nHasil konversi ke [SGD] : " + sgd(nominal);
    }
}

