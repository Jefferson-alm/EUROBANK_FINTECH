package org.example;

import java.time.LocalDateTime;

public class Cliente {

    private Cuenta cuenta;

    private String dni_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String telefono_cliente;
    private String correo_electronico;
    private LocalDateTime fecha_creacion;
    private String password;


    public Cliente() {

    }

    public Cliente(String dni_cliente, String nombre_cliente, String apellido_cliente, String telefono_cliente, String correo_electronico, LocalDateTime fecha_creacion, String password) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_electronico = correo_electronico;
        this.fecha_creacion = fecha_creacion;
        this.password = password;
    }

    public Cliente(String dni_cliente, String nombre_cliente, String apellido_cliente, String telefono_cliente, String correo_electronico, LocalDateTime fecha_creacion, String password, Cuenta cuenta) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_electronico = correo_electronico;
        this.fecha_creacion = fecha_creacion;
        this.password = password;
        this.cuenta = cuenta;
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

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "\nCliente\n" +
                "\tDNI: " + dni_cliente + "\n" +
                "\tNOMBRE: " + nombre_cliente + "\n" +
                "\tAPELLIDO: " + apellido_cliente + "\n" +
                "\tTELEFONO: " + telefono_cliente + "\n" +
                "\tCORREO ELECTRONICO: " + correo_electronico + "\n" +
                "\tFECHA CREACION: " + fecha_creacion + "\n" +
                "\tCuenta: " + cuenta +"\n"
                ;
    }
}
