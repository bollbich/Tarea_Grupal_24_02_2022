package facturacion.vo;

import java.util.ArrayList;
import java.util.List;

public class FacturaVO {
	
	@Override
	public String toString() {
		return "FacturaVO [idFactura=" + idFactura + ", concepto=" + concepto + ", lineas=" + lineas + "]";
	}

	private int idFactura;
	private String concepto;
	
	private List<LineaVO> lineas = new ArrayList<LineaVO>();
	
	
	public void addLinea(LineaVO l) {
		lineas.add(l);
	}


	public FacturaVO() {
		
	}


	public FacturaVO(int idFactura, String concepto, List<LineaVO> lineas) {
		
		this.idFactura = idFactura;
		this.concepto = concepto;
		this.lineas = lineas;
	}
	public FacturaVO(int idFactura, String concepto) {
		
		this.idFactura = idFactura;
		this.concepto = concepto;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public List<LineaVO> getLineas() {
		return lineas;
	}


	public void setLineas(List<LineaVO> lineas) {
		this.lineas = lineas;
	}

	//Otros métodos:
	public int importeTotal() {
		int total = 0;
		for(LineaVO l : lineas) {
			total += l.getImporte();
		}
		return total;
	}
}
