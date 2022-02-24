package facturacion.dao;

import java.util.ArrayList;
import java.util.List;

import facturacion.dto.FacturaDTO;
import facturacion.vo.FacturaVO;
import facturacion.vo.PersonaVO;

public class FacturaDAO{
	
	List <FacturaVO>listafactura = new ArrayList<FacturaVO>();
	
	public void Delete(FacturaDTO factura)
	{
		listafactura.remove(factura);
	}
	
	public List <FacturaVO> Listar()
	{
		return listafactura;
	}

	public FacturaDAO() {

		FacturaVO f = new FacturaVO(34,"Ordenador");
		FacturaVO f2 = new FacturaVO(45,"Chupachups");
		FacturaVO f3 = new FacturaVO(78,"cachuetes");
		
		listafactura.add(f);
		listafactura.add(f2);
		listafactura.add(f3);
		
	}

}
