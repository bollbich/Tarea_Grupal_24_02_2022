package facturacion.vo;

public class LineaVO {
	
	private int idLinea;
	private String concepto;
	private int importe;
	
	public LineaVO() {
		
	}
	public LineaVO(int idLinea, String concepto, int importe) {
		super();
		this.idLinea = idLinea;
		this.concepto = concepto;
		this.importe = importe;
	}
	public int getIdLinea() {
		return idLinea;
	}
	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	

}
