package BD;

public class NotaFiscal {
	NotaFiscal (VerificadorCPF verif, BDCliente BDC,BDServico BDS, String itemVenda, int qtdd, String CPF) {
		this._BDC = BDC;
		this._itemVenda = BDS.getItem(itemVenda);
		this._cliente = getCliente(verif, BDC, CPF);
	}
	
	private Cliente getCliente(VerificadorCPF verif, BDCliente BDC, String CPF) {
		if (verif.verifySPC(CPF)) {
			return BDC.getCliente(CPF);
		} else
			return null;
	}
	
	private BDCliente _BDC;
	private ItemVenda _itemVenda;
	private Cliente _cliente;
}
