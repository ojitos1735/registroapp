/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registro.web.entidad;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="empleados")
public class empleado {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private String id;    
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private String dni;
    @Column(name="telefono")
    private String telefono;
    @Column(name="email", unique=true)
    private String email;
    
    
    @Column(name = "idUsuarioCreacion")
    private String idUsuarioCreacion; // tipo UsuarioEntidad relacion @ManyToOne

    @Column(name = "fechaCreacion")
    private LocalDate fechaCreacion;

    @Column(name = "idUsuarioUltimaActualizacion")
    private String idUsuarioUltimaActualizacion; // tipo UsuarioEntidad relacion @ManyToOne

    @Column(name = "fechaUltimaActualizacion")
    private LocalDate fechaUltimaActualizacion;
}
