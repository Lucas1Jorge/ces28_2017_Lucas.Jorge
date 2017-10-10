package Application;

//import mercadoVirtual.BancoDeDados;
//import mercadoVirtual.Carrinho;
//import mercadoVirtual.Cliente;
//import mercadoVirtual.Produto;
public class Aplicacao {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.registrarCliente("ZÉ", 123);
		facade.realizarCompra(123, 223, 342);
	}
}