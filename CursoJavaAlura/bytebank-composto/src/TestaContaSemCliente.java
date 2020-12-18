
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaDamares = new Conta();
		System.out.println(contaDaDamares.getSaldo());
		
		contaDaDamares.titular = new Cliente();
		System.out.println(contaDaDamares.titular);
		
		contaDaDamares.titular.nome = "Damares";
		System.out.println(contaDaDamares.titular.nome);
		
	}
	
	
}
