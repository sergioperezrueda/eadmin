package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoRegistro extends Documento{

	private final String dniInteresado;
	private final String codigoRegistro;
	
	public DocumentoRegistro(Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado,
			String dniInteresado, String codigoRegistro, Date fechaUltimaActualizacion) {
		super(codigo, nombre, fechaCreacion, publico, estado, fechaUltimaActualizacion);
		this.dniInteresado = dniInteresado;
		this.codigoRegistro = codigoRegistro;
	}

	public String getDniInteresado() {
		return dniInteresado;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Codigo Registro: " + codigoRegistro;
	}
}
