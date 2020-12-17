
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaDamares = new Conta();
		contaDaDamares.deposita(1000);
		boolean sucessoTransferencia =
				
			contaDaDamares.transfere(300, contaDoPaulo);
			if(sucessoTransferencia) {
				
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaDamares.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
		
		
		
		
		
		
			
		}
	}

