package intro;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitAnnotations {

	@BeforeAll // se executa inainte de orice
	public static void beforeAll() {
		System.out.println("Inainte de toate!");
	}

	@AfterAll // se executa dupa orice
	public static void afterAll() {
		System.out.println("Dupa toate!");
	}

	@BeforeEach // inainte de fiecare test se executa beforeEach
	public void before() {
		System.out.println("Inainte de fiecare toate!");
	}

	@AfterEach // se executa dupa fiecare test
	public void after() {
		System.out.println("Dupa fiecare test!");
	}

	@Test
	public void test1() {
		System.out.println("Test care verifica daca 2 valori sunt egale");
		String actual = "da";
		String expected = "nu";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		System.out.println("verific daca un text e inclus in rezultat");
		String textFromApp = "afara e soare";
		String searchedKeyword = "noapte";
		Assertions.assertTrue(textFromApp.contains(searchedKeyword), "Textul: " + searchedKeyword + " nu se afla in textul din pagina: "+ textFromApp);
	}
}
