package BD;

import java.util.HashMap;
import java.util.Map;

import notaFiscal.Imposto;
import notaFiscal.ItemVenda;
import notaFiscal.ProdutoServiço;

public class BD_Tax {
	private Map<ProdutoServiço, Imposto> _impostos;
	
	public BD_Tax() {
		_impostos = new HashMap<ProdutoServiço, Imposto>();
	}
	
	public Imposto getImposto(ItemVenda IV) {
		return _impostos.get(IV.getPS());
	}
	
	public void setImposto(ProdutoServiço PS, Imposto imposto) {
		_impostos.put(PS, imposto);						// requisito 12
	}
}
