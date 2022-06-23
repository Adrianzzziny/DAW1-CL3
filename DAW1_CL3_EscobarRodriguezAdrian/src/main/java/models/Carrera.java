package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "carrera")
public class Carrera {
	@Id
	private int idcarrera;
	private String descripcion;
	
	@Override
	public String toString() {
		return "Carrera [idcarrera=" + idcarrera + ", descripcion=" + descripcion + "]";
	}

	public Carrera() {
		super();
	}

	public Carrera(int idcarrera, String descripcion) {
		super();
		this.idcarrera = idcarrera;
		this.descripcion = descripcion;
	}

	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
