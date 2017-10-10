package Application;
import mercadoVirtual.BancoDeDados;
import mercadoVirtual.Carrinho;
import mercadoVirtual.Cliente;
import mercadoVirtual.Produto;

public class Mercado {
	
	public void registrarCliente(BancoDeDados bd, String cli, Integer id) {
		Cliente cliente = Cliente.create(cli, id);
		Carrinho car = Carrinho.create();
		cliente.adicionarCarrinho(car);
		bd.registrarCliente(cliente);
	}
	
	public void realizarCompra(BancoDeDados bd, Integer id, Integer... produtos) {
		for(Integer prod : produtos) {
			Produto produto = bd.selectProduto(prod);
			bd.selectCliente(id).getCarrinho().adicionar(produto);
		}
		Cliente cliente = bd.selectCliente(id);
		double valor = cliente.getCarrinho().getTotal();
		bd.processarPagamento(cliente, valor);
	}
}
