package Application;

import mercadoVirtual.BancoDeDados;

public class Facade {
	BancoDeDados bd = new BancoDeDados();
	Mercado mercado = new Mercado();
	
	public void registrarCliente(String nome, Integer id) {
		mercado.registrarCliente(bd, nome, id);
	}
	
	public void realizarCompra(Integer id, Integer... produtos) {
		mercado.realizarCompra(bd, id, produtos);
	}
}
