public class Principal {

	public static void main(String[] args) throws IllegalAccessException {
		Conta c = new Conta();
		c.setSaldo(302.1);
		try{
			c.deposita(3002);
		}catch(ValorInvalidoException e){
			System.out.println("Valor de depósito inválido : " + e);
		}finally{
			System.out.println("--");
		}
		
	}

}
