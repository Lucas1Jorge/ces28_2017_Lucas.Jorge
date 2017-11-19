package BD;

import java.util.HashMap;
import java.util.Map;

import notaFiscal.ProdutoServiço;

public class BD_PS {
	private Map<String, ProdutoServiço> _catalogo;
	
	public BD_PS() {
		_catalogo = new HashMap<String, ProdutoServiço>();
	}
	
	public boolean hasPS(String nome) {
		return _catalogo.containsKey(nome);
	}
	
	public ProdutoServiço getPS(String nome) throws Exception{
		if(!hasPS(nome)) {
			throw new Exception("Produto/Serviço não consta no BD_PS");
		}
		return _catalogo.get(nome);
	}
}
