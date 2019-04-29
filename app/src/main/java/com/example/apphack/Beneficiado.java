package com.example.apphack;

import android.media.Image;

import java.io.Serializable;
import java.util.Date;

public class Beneficiado implements Serializable {

    private String id_beneficiado,nombre_clinica,numero_cedula,telefono
                ,correo,estado,municipio,id_paypal;
    private Image foto;
    private Date fecha_nacimiento;


    public Beneficiado(String id_beneficiado, String nombre_clinica, String numero_cedula,
                       String telefono, String correo, String estado, String municipio,
                       String id_paypal, Date fecha_nacimiento) {

        this.id_beneficiado = id_beneficiado;
        this.nombre_clinica = nombre_clinica;
        this.numero_cedula = numero_cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
        this.municipio = municipio;
        this.id_paypal = id_paypal;
        //this.foto = foto;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getId_beneficiado() {
        return id_beneficiado;
    }

    public void setId_beneficiado(String id_beneficiado) {
        this.id_beneficiado = id_beneficiado;
    }

    public String getNombre_clinica() {
        return nombre_clinica;
    }

    public void setNombre_clinica(String nombre_clinica) {
        this.nombre_clinica = nombre_clinica;
    }

    public String getNumero_cedula() {
        return numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getId_paypal() {
        return id_paypal;
    }

    public void setId_paypal(String id_paypal) {
        this.id_paypal = id_paypal;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

}
