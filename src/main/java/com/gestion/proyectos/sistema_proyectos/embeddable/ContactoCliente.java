package com.gestion.proyectos.sistema_proyectos.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ContactoCliente {

    @Column(name = "nombre_representante")
    private String nombreRepresentante;

    @Column(name = "email_contacto")
    private String emailContacto;

    @Column(name = "telefono")
    private String telefono;

    public String getNombreRepresentante() { return nombreRepresentante; }
    public void setNombreRepresentante(String n) { this.nombreRepresentante = n; }

    public String getEmailContacto() { return emailContacto; }
    public void setEmailContacto(String e) { this.emailContacto = e; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String t) { this.telefono = t; }
}
