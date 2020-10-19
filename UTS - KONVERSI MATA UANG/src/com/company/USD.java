package com.company;

public class USD {
    public float nominal;

    public USD(float nominal) {
        this.nominal = nominal;
    }

    public USD() {
        nominal = 1;
    }

    public float getNominal() {
        return nominal;
    }

    public void setNominal(float nominal) {
        this.nominal = nominal;
    }

    public float usd (float nominal) {
        return nominal/13000;
    }

    public String toString() {
        return  "Uang yang anda masukkan : IDR " + nominal +
                "\nHasil konversi ke [USD] : " + usd(nominal);
    }
}
