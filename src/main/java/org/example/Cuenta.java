package org.example;

public class Cuenta {

    private String nro_cuenta;
    private String nro_cci;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nro_cuenta, String nro_cci, double saldo) {
        this.nro_cuenta = nro_cuenta;
        this.nro_cci = nro_cci;
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\n\t\tNro Cuenta: " + nro_cuenta +
                "\n\t\tCCI: " + nro_cci +
                "\n\t\tSaldo: " + saldo;
    }
}
