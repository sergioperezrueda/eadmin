package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public abstract class BaseAdministracion {

	private final Integer codigo;
	private final String nombre;
	private final Date fechaCreacion;
	private final Boolean publico;
	private final Date fechaUltimaActualizacion;
	
	public BaseAdministracion(Integer codigo, String nombre, Date fechaCreacion, Boolean publico, Date fechaUltimaActualizacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.publico = publico;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public Boolean getPublico() {
		return publico;
	}
	
	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}
	
	@Override
	public int hashCode() {
		return codigo.hashCode() + nombre.hashCode() + fechaCreacion.hashCode() + publico.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BaseAdministracion) {
			return codigo.equals(((BaseAdministracion) obj).getCodigo()) && nombre.equals(((BaseAdministracion) obj).getNombre()) 
					&& fechaCreacion.equals(((BaseAdministracion) obj).getFechaCreacion()) && publico.equals(((BaseAdministracion) obj).getPublico());
		}
		return false;
	}
}
