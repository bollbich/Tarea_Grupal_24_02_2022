package Vista;
import java.util.Scanner;

import Controladores.DAOController;
import facturacion.dao.FacturaDAO;
import facturacion.dao.PersonaDAO;
import facturacion.dto.FacturaDTO;
import facturacion.dto.PersonaDTO;
import facturacion.vo.FacturaVO;
import facturacion.vo.LineaVO;
import facturacion.vo.PersonaVO;

public class Principal {

	public static void main(String[] args) {
		
		//Voy a crear unos objetos:
		
		PersonaVO p = new PersonaVO(1,"Celia","García Jerez",18);
		FacturaVO f = new FacturaVO(1,"Ordenador");
		LineaVO l1 = new LineaVO(1,"CPU",200);
		LineaVO l2 = new LineaVO(2,"Monitor",987);
		
		//Añado al objeto factura las líneas:
		
		f.addLinea(l1);
		f.addLinea(l2);
		
		//Añado al objeto persona la factura:
		
		p.addFactura(f);
		
		PersonaDTO pdto = new PersonaDTO();
		
		pdto.setIdPersona(p.getIdPersona());
		pdto.setNombre(p.getNombre());
		pdto.setApellidos(p.getApellidos());
		
		for(FacturaVO factura: p.getFacturas()) {
			pdto.addFactura(new FacturaDTO(factura.getIdFactura(),factura.importeTotal()));
		}
		
		
		//Ejemplo de un DTO por pantalla
		
		System.out.println("ID de cliente: "+pdto.getIdPersona());
		System.out.println("Nombre cliente: "+pdto.getNombre()+" "+pdto.getApellidos());
		
		for(FacturaDTO fdto: pdto.getFacturas())
		{
			System.out.println("Numero de factura: "+fdto.getIdFactura());
			System.out.println("Importe total factura: "+fdto.getImporteTotal());
		
			
		}
		//Hasta aqui el comportamiento de la aplicacion con el uso exclusivo del patrón DTO	
		String captura = "nop";
		
		DAOController controlador = new DAOController();
		
		while (!captura.equals("fin"))
		{			
		
			Scanner lector = new Scanner(System.in);			
			
			System.out.println("Clientes en la base de datos");
			for(PersonaVO pDTO: controlador.ListarPersonas())
			{
				System.out.println(pDTO.toString());
				
			}
			
			System.out.println("¿Desea eliminar algún cliente?, teclee 'si' para borrar. ");
		    captura = lector.next();
			
			if(captura.equals("Si")||captura.equals("si"))
			{
				System.out.println("Indique el nombre del cliente que desea borrar: ");
				
				captura = lector.next();
				
				PersonaVO PersonaParaBorrar = null;
				
				for(PersonaVO pDTO: controlador.ListarPersonas())
				{
					if(pDTO.getNombre().equals(captura))
					{
						PersonaParaBorrar = pDTO;					
					}					
				}	
				
				if(PersonaParaBorrar!=null)
				{
					System.out.println("El cliente "+PersonaParaBorrar.getNombre()+" ha sido eliminado.");
					controlador.ListarPersonas().remove(PersonaParaBorrar);
				}
			}			
					
			
			
			System.out.println("Facturas en la base de datos");
			for(FacturaVO fDTO: controlador.ListarFacturas())
			{
				System.out.println(fDTO.toString());
				
			}	
			
			System.out.println("¿Desea eliminar alguna factura?, teclee 'si' para borrar. ");
			captura = lector.next();
			
			if(captura.equals("Si")||captura.equals("si"))
			{
				System.out.println("Indique el id de la factura que desea borrar: ");
				
				captura = lector.next();
				
				FacturaVO FacturaParaBorrar = null;
				
				for(FacturaVO fDTO: controlador.ListarFacturas())
				{
					if(fDTO.getIdFactura()== Integer.parseInt(captura))
						{
							FacturaParaBorrar = fDTO;					
						}
					
				}
				
				if(FacturaParaBorrar!=null)
				{
					System.out.println("La factura con ID:"+FacturaParaBorrar.getIdFactura()+" ha sido eliminada.");
					controlador.ListarFacturas().remove(FacturaParaBorrar);
				}
			}
					
			
			
			System.out.println("Si desea finalizar teclee fin. para continuar ingrese cualquier valor. ");
			captura = lector.next();
		
		}
	}

}
