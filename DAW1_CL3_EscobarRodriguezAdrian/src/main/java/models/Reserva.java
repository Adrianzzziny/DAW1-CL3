package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fchregistro")
	private int fchregistro;
	
	private int idcarrera;

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fchregistro="
				+ fchregistro + ", idcarrera=" + idcarrera + "]";
	}

	public Reserva() {
		super();
	}

	public Reserva(int codigo, String nombre, String apellido, int fchregistro, int idcarrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fchregistro = fchregistro;
		this.idcarrera = idcarrera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getFchregistro() {
		return fchregistro;
	}

	public void setFchregistro(int fchregistro) {
		this.fchregistro = fchregistro;
	}

	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}
	
	
	
}
