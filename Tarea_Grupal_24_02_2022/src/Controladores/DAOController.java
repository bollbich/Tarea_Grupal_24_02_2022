package Controladores;

import java.util.List;

import facturacion.dao.FacturaDAO;
import facturacion.dao.PersonaDAO;
import facturacion.dto.FacturaDTO;
import facturacion.dto.PersonaDTO;
import facturacion.vo.FacturaVO;
import facturacion.vo.PersonaVO;

public class DAOController {

	private FacturaDAO accesoDBFacturas = new FacturaDAO();
	private PersonaDAO accesoDBPersonas = new PersonaDAO();
	

	public void DeleteFactura(FacturaDTO factura)
	{
		accesoDBFacturas.Delete(factura);
		
	}
	
	public void DeletePersona(PersonaDTO persona)
	{
		accesoDBPersonas.Delete(persona);
		
	}
	
	public List <FacturaVO> ListarFacturas()
	{
		return accesoDBFacturas.Listar();
		
	}
	
	public List <PersonaVO> ListarPersonas()
	{
		return accesoDBPersonas.Listar();
		
	}
}
