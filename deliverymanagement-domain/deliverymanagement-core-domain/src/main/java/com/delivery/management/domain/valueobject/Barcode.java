package com.delivery.management.domain.valueobject;

public class Barcode {

    private String barcode;

    public Barcode(){}
    public Barcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
