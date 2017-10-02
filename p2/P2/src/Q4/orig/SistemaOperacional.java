package Q4.orig;

public class SistemaOperacional {
	public String getDriverImpressao(String conteudo) {
		Impressora impressora = new Impressora();
		if (impressora.getTipo() == "laser" || impressora.getTipo() == "jato de tinta") {
			return impressora.Imprimir(conteudo);
		}
		return null;
	}
}