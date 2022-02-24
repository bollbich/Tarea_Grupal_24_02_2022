package facturacion.dto;

public class FacturaDTO {
	
	private int idFactura;
	private int importeTotal;
	
		
	public FacturaDTO(int idFactura, int importeTotal) {
	
		this.idFactura = idFactura;
		this.importeTotal = importeTotal;
	}



	public int getIdFactura() {
		return idFactura;
	}



	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	public int getImporteTotal() {
		return importeTotal;
	}



	public void setImporteTotal(int importeTotal) {
		this.importeTotal = importeTotal;
	}
	

}
