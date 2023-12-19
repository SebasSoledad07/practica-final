package com.practicarest.practica.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Empleado")
public class Empleado {
	    
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer codigo;
	    private String nombres;
	    private String apellidos;
	    @Column(unique = true, length = 13)
	    private String cedula;
	    private Integer edad;
	    private String telefono;
	    private Date fecha_nacimiento;

}