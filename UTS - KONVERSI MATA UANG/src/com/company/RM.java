package com.company;

public class RM {
    public int nominal;

    public RM(int nominal) {
        this.nominal = nominal;
    }

    public RM() {
        nominal = 1;
    }

    public float getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public float rm (int nominal) {
        return nominal/3500;
    }

    public String toString() {
        return  "Uang yang anda masukkan : IDR " + nominal +
                "\nHasil konversi ke [RM] : " + rm(nominal);
    }
}
