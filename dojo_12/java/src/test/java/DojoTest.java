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
		List<Feature> featuresA = new ArrayList<>(Arrays.asList(new Capacity(5),new M2(10)));
		List<Feature> featuresB = new ArrayList<>(Arrays.asList(new Capacity(20),new M2(20)));
		List<Feature> featuresC = new ArrayList<>(Arrays.asList(new Capacity(10),new M2(30)));
		List<Feature> featuresD = new ArrayList<>(Arrays.asList(new Capacity(15),new M2(50),new HasComputers(1)));
		aulas.add(new Aula(featuresA, new Label("lab 1")));
		aulas.add(new Aula(featuresB,new Label("lab 2")));
		aulas.add(new Aula(featuresC,new Label("lab C")));
		aulas.add(new Aula(featuresD,new Label("lab D")));

	}

	@Test
	public void test_se_solicita_aulas_para_10_personas() {
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(10))));
		Assert.assertEquals(cau.getSuitableRoom(aulas,solicitud).printLabel(),new Label("lab 2").print());
	}


	@Test
	public void test_se_solicita_aula_para_30_personas_deberia_devolver_no_hay_disponibilidad(){
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(30))));
		Aula au = cau.getSuitableRoom(aulas,solicitud);
		Assert.assertEquals(new NoAula().printLabel(),au.printLabel());
	}

	@Test public void test_se_solicita_aula_para_arquitectura_metros_cuadrados(){
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(10),new M2(30))));
		Aula au = cau.getSuitableRoom(aulas,solicitud);
		Assert.assertEquals("lab C",au.printLabel());
	}

	@Test public void test_se_solicita_aula_para_arquitectura_metros_cuadrados_y_computadoras(){
		Cau cau = new Cau();
		Solicitud solicitud = new Solicitud(new ArrayList<>(Arrays.asList(new Capacity(10),new M2(30),new HasComputers(1))));
		Aula au = cau.getSuitableRoom(aulas,solicitud);
		Assert.assertEquals("lab D",au.printLabel());
	}

}
