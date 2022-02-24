package facturacion.vo;

import java.util.ArrayList;
import java.util.List;

public class PersonaVO {
	
	//Atributos
	private int idPersona;	
	private String nombre;
	private String apellidos;
	private int edad;
	
	private List<FacturaVO> facturas = new ArrayList<FacturaVO>();
	
	
	//Método para añadir una factura al atributo facturas.
	public void addFactura(FacturaVO f) {
		facturas.add(f);
	}

	//Sobrecarga de constructores:
	public PersonaVO(int idPersona) {
		this.idPersona = idPersona;
	}

	public PersonaVO(int idPersona, String nombre,String apellidos, int edad) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public PersonaVO(int idPersona, String nombre,String apellidos, int edad, List<FacturaVO> facturas) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.facturas = facturas;
	}

	//Getters y Setters:
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<FacturaVO> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<FacturaVO> facturas) {
		this.facturas = facturas;
	}
	//Genérico
	@Override
	public String toString() {
		return "Cliente idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad 
				+ ", Tiene= " + facturas.size()+" facturas asociadas";
	}

	

	
	

}
