package Teste.teste;


import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

public class MyPages {

	@ScreenMap(name= "Login",location = "http://192.168.0.48:3000")
	public class Login{
		@ElementMap(name= "Usuário",locatorType = ElementLocatorType.Id, locator="textfield-1011-inputEl")	
		private TextField email;
		
		@ElementMap(name= "Senha",locatorType = ElementLocatorType.Id, locator="textfield-1012-inputEl")	
		private TextField password;

		@ElementMap(name= "Entrar",locatorType = ElementLocatorType.Id, locator="button-1013-btnEl")	
		private Button Entrar;
		
			
	}

}
