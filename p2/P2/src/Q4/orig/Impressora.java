package Q4.orig;

public class Impressora {
	public Impressora() {
		this._tipo = "laser";
	}
	
	private String _tipo;
	
	public void setTipo(String tipo) {
		this._tipo = tipo;
	}
	
	public String getTipo() {
		return this._tipo;
	}
	
	public String Imprimir(String conteudo) {
		if (conteudo==null) {
			throw new IllegalArgumentException("conteudo nulo");
		}
		else 
//			System.out.println(conteudo);
			return conteudo;
	}
}