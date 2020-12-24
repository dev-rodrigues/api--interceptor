package br.com.devrodrigues.cartoes.domain.objectvalue;

public enum AcceleratorType {

    ACCELERATOR("ACCELERATOR");

    String value;

    AcceleratorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}