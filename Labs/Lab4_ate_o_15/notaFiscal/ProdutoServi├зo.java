package notaFiscal;

import java.util.ArrayList;
import java.util.List;

public class ProdutoServiço {
	private String _nome;
	private double _preço;
	private List<ProdutoServiço> _subordinates;			// composite -> requisito 4
	private ProdutoServiço _father;
	
	public ProdutoServiço(String produto) {
		_nome = produto;
		_subordinates = new ArrayList<ProdutoServiço>();
	}
	
	public String getName() {
		return _nome;
	}
	
	private void setFather(ProdutoServiço ps) {
		_father = ps;
	}
	
	public void add(ProdutoServiço ps) {
		_subordinates.add(ps);
		ps.setFather(this);
	}
	
	public void remove(ProdutoServiço ps) {
		_subordinates.remove(ps);
	}
	
	public List<ProdutoServiço> getSubordinates() {
		return _subordinates;
	}
}
