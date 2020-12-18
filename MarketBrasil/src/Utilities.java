import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Utilities {
  ArrayList<String> nomes = new ArrayList<>(Arrays.asList("1 - Sophie", "2 - Damares", "3 - Marco", "4 - Joanna", "5 - Rafa",
      "6 - Jonathan", "7 - Nathalie", "8 - Júnior", "9 - Guilherme", "10 - Victória", "11 - Pedro", "12 - Mayra", "13 - Audrey", "14 - JM", "15 - Roberta"));
  /* Cria um ArrayList de items do tipo String, e
  imediatamente o popula com os nomes dos integrantes
  do FlowTalents
  */

  Random rand = new Random();
  //Instancia classe que gera uma sequencia de numeros aleatorios

  public String geraNome() {
    return nomes.get(rand.nextInt(15));
  }
  //Aleatoriamente pega um dos strings contidos
  // dentro do ArrayList nomes


  public Compra geraCompra(ArrayList<Produto> produtos) {
    Compra compra = new Compra();
    for (Produto el : produtos) {
      if (rand.nextInt(2) == 1) {
        compra.produtos.add(el);
      }
    }

    /* metodo que aceita como parametro um ArrayList com
    items do tipo Produto. executa um laço que: 
    (for)para cada elemento do tipo Produto dentro de produtos
    (if)se o numero aleatorio gerado entre 1 e 0 for 1 
    ele adiciona este elemento ao ArrayList produtos dentro de compra.
    */

    return compra;
  } 
  
  public void mostraCliente () {
	  for (String el : nomes) {
	      System.out.println(el);
	  }
  }
  
  public String mostraClienteId(String id) {
	  Boolean stopSelector = false;
	  String cliente = null;
	  for (String el : nomes) {
		  if(el.contains(id) && !stopSelector) {
			 cliente = el;
			 stopSelector = true;
		  }
	  }
	  
	  return cliente;
  }
}
