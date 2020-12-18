import java.util.ArrayList;

public class Prateleira {
  public ArrayList<Produto> produtos = new ArrayList<>();

  /**
   * a classe já tá implementando isso sem vc ver :) public Prateleira(){ produtos
   * = null; }
   */

  public void adicionarProduto(Produto p) {
    produtos.add(p);
    System.out.println("\nProduto adicionado!");
    for (Produto el : produtos) {
      System.out.println(el.getNome() + ": " + el.getPreco());
    }
    System.out.println();


    /* metodo que aceita um objeto do tipo Produto como parametro,
    adiciona o objeto no ArrayList produtos,
    (for)para cada elemento do tipo Produto na variavel produtos
    printe no console o nome do elemento + ":" + seu preço
    */
  }
  
  public void mostraProdutos( ) {
	  for (Produto el : produtos) {
	      System.out.println(el.getId()+ " - " + el.getNome() + ": " + el.getPreco());
	  }
  }
  
  public Produto mostraProduto(String idproduto) {
	  Produto prod = null;
	  for (Produto el : produtos) {
		  Boolean stopSelector = false;
		  if(el.getId() == (Integer.parseInt(idproduto))) {
			  prod = el;
		  }


	  }
	return prod;
  }

}
