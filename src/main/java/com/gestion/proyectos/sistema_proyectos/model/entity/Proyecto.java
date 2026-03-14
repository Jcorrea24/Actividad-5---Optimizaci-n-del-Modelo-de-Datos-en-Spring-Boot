package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyectos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}