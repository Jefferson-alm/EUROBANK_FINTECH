package org.example;

public class Cuenta {

    private String nro_cuenta;
    private String nro_cci;
    public Cuenta() {
    }

    public Cuenta(String nro_cuenta, String nro_cci) {
        this.nro_cuenta = nro_cuenta;
        this.nro_cci = nro_cci;
    }

    public String getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(String nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public String getNro_cci() {
        return nro_cci;
    }

    public void setNro_cci(String nro_cci) {
        this.nro_cci = nro_cci;
    }

    @Override
    public String toString() {
        return "\n\t\tnro_cuenta: " + nro_cuenta +
                "\n\t\tnro_cci: " + nro_cci;
    }
}
