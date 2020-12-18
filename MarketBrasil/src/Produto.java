
public class Produto {
  private int id;
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
	this.id = (int) (Math.random() * 100);
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }
  
  public int getId() {
	return id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
  
  public void setId(int id) {
    this.id = id;
  }

}

