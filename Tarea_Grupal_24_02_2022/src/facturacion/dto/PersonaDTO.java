package facturacion.dto;

import java.util.ArrayList;
import java.util.List;

/*Contruyo un DTO que tendrá la información de PersonaVo,
 *  la información de FacturaVO y la información de LineaVO
 *  que me interese.
 */
public class PersonaDTO {
	
	private int idPersona;
	private String nombre;
	private String apellidos;
	//Ojo 
	private List<FacturaDTO> facturas= new ArrayList<FacturaDTO>();
	
	//No es necesario el constructor.
	
	public void addFactura(FacturaDTO fdto) {
		facturas.add(fdto);
	}
	
	
	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public List<FacturaDTO> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<FacturaDTO> facturas) {
		this.facturas = facturas;
	}
	
	
	
	
}
