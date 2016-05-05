package dbHave.Angular;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

public class MyPages {

	@ScreenMap(name = "Neo", location = "http://localhost:3000")
	public class Neo {
	}

	@ScreenMap(name = "Login", location = "http://localhost:3000/#/login")
	public class Login {

		@ElementMap(name = "Usuario", locatorType = ElementLocatorType.Name, locator = "email")
		private TextField email;

		@ElementMap(name = "Senha", locatorType = ElementLocatorType.Id, locator = "input_1")
		private TextField Senha;
		
		@ElementMap(name = "Entrar", locatorType = ElementLocatorType.ClassName, locator = "entrar md-button md-ink-ripple")
		private Button Entrar;
	}
	@ScreenMap(name = "TelaPrincipal", location = "http://localhost:3000/#/app")
	public class TelaPrincipal {
	}



}
