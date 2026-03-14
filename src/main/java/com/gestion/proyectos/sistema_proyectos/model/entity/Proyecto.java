package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;
import jakarta.persistence.*;

@Entity
@Table(name = "proyectos")
public class Proyecto extends BaseEntity {

    @Column(nullable = false)
    private String nombre;

    @Column(length = 1000)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoProyecto estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "prioridad", nullable = false)
    private Prioridad prioridad;

    @Embedded
    private ContactoCliente contactoCliente;

    public Proyecto() {}

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public EstadoProyecto getEstado() { return estado; }
    public void setEstado(EstadoProyecto estado) { this.estado = estado; }

    public Prioridad getPrioridad() { return prioridad; }
    public void setPrioridad(Prioridad prioridad) { this.prioridad = prioridad; }

    public ContactoCliente getContactoCliente() { return contactoCliente; }
    public void setContactoCliente(ContactoCliente contactoCliente) { this.contactoCliente = contactoCliente; }
}