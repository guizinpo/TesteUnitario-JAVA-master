package projeto.DS ;  

import org.junit.Test;

import projetoDS.App;
import projetoDS.test;

import static org.junit.Assert.*;

public class AppTest {
	@test public void appHasAGreeting() {
		App classUnderTest = new App();
		assertNotNull("app should have a greeting", classUnderTest.getGreeting());
		
	}
}