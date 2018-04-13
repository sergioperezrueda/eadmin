package es.fpdual.eadmin.eadmin.mapper;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.EstadoDocumento;

public abstract class DocumentoMapperTest {
	private static final Date FECHA = new Date();
	@Autowired
	private DocumentoMapper mapper;
	
	@Test
	public void deberiaInsertarUnDocumento() throws Exception{
		Documento documento = new Documento (1, "Ejemplo", FECHA, true, EstadoDocumento.ACTIVO, FECHA);
		assertEquals(1, mapper.insertarDocumento(documento));
	}
}
