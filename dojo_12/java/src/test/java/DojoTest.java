import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	List<Aula> aulas ;
	
	@Before
	public void setup() {
		aulas = new ArrayList<>();
		List<Feature> featuresA = new ArrayList<>(Arrays.asList(new Capacity(5)));
		List<Feature> featuresB = new ArrayList<>(Arrays.asList(new Capacity(20)));
		aulas.add(new Aula(featuresA, new Label("lab 1")));
		aulas.add(new Aula(featuresB,new Label("lab 2")));

	}

	@Test
	public void test_se_solicita_aulas_para_10_personas() {
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(10))));
		Assert.assertEquals(cau.getSuitableRoom(aulas,solicitud).printLabel(),new Label("lab 2").printLabel());
	}


	@Test
	public void test_se_solicita_aula_para_30_personas_deberia_devolver_no_hay_disponibilidad(){
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(30))));
		Aula au = cau.getSuitableRoom(aulas,solicitud);
		Assert.assertEquals(new NoAula().printLabel(),au.printLabel());
	}

	@Test public void test_se_solicita_aula_para_arquitectura_metros_cuadrados(){


	}

}