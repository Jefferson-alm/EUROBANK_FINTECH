package org.example;

import java.time.LocalDate;

public class Cliente {

    String dni_cliente;
    String nombre_cliente;
    String apellido_cliente;
    String telefono_cliente;
    String correo_electronico;
    LocalDate fecha_creacion;
    String nro_cuenta_cliente;
    String cci_cliente;

    public Cliente() {

    }

    public Cliente(String dni_cliente, String nombre_cliente, String apellido_cliente, String telefono_cliente, String correo_electronico, LocalDate fecha_creacion, String nro_cuenta_cliente, String cci_cliente) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_electronico = correo_electronico;
        this.fecha_creacion = fecha_creacion;
        this.nro_cuenta_cliente = nro_cuenta_cliente;
        this.cci_cliente = cci_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getNro_cuenta_cliente() {
        return nro_cuenta_cliente;
    }

    public void setNro_cuenta_cliente(String nro_cuenta_cliente) {
        this.nro_cuenta_cliente = nro_cuenta_cliente;
    }

    public String getCci_cliente() {
        return cci_cliente;
    }

    public void setCci_cliente(String cci_cliente) {
        this.cci_cliente = cci_cliente;

    }

    @Override
    public String toString() {
        return "Cliente{\n" +
                "\t" +"DNI: " + dni_cliente + '\n' +
                "\t" +"NOMBRE: " + nombre_cliente + '\n' +
                "\t" +"APELLIDOS: " + apellido_cliente + '\n' +
                "\t" +"TELEFONO: " + telefono_cliente + '\n' +
                "\t" +"CORREO: " + correo_electronico + '\n' +
                "\t" +"FECHA CREACION" + fecha_creacion + '\n' +
                "\t" +"NRO DE CUENTA: " + nro_cuenta_cliente + '\n' +
                "\t" +"CCI: " + cci_cliente + '\n' +
                '}';
    }
}
