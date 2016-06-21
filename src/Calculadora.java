
public class Calculadora {

	public int soma(String numeros) {
		
		if (numeros.length() == 0){
			// Aqui será implementado o método soma.
			return 0;
		}
		else{
			 
			String [] vetor = numeros.split("[\n,]");
			if(vetor.length == 1)
			{
				return Integer.parseInt(numeros);
			}
			else{
				int vlrTotal = 0;
				
				for (int i=0; vetor.length > i; i++)
				{
					vlrTotal += Integer.parseInt(vetor[i]);
				}
				
				return vlrTotal;
			}
		}

		
	}
	
}
