package hs_mannheim.ws14.tpe_uib_05.ueb3;

import static org.junit.Assert.*;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.junit.Test;

public class JUnitTests {

	@Test
	public void isEmpty() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		assertTrue("Tree is emtpy", test.isEmpty());
	}

	@Test
	public void addKnoten() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);
		assertFalse("Baum hat einen Knoten", test.isEmpty());

	}

	@Test
	public void clear() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);
		test.clear();

		assertTrue("Tree is emtpy", test.isEmpty());

	}

	@Test
	public void containsKey() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);
		assertTrue("Baum hat einen Knoten mit dem Schluessel 'Dennis'",
				test.containsKey("Dennis"));
	}

	@Test
	public void containsValue() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);

		assertTrue("Baum hat einen Knoten mit dem Wert '23'",
				test.containsValue(23));

	}

	@Test
	public void remove() {

		// Testobjekte
		typesafeAssociativeArray<String, String> test = new typesafeAssociativeArray<>();
		typesafeAssociativeArray<String, Integer> test1 = new typesafeAssociativeArray<>();

		test.addKnoten("Pinar", "Dennis");
		test1.addKnoten("Sovann", 25);

		test.remove("Dennis");
		test1.remove("Sovann");

		assertNull("Soll Null zurueckgeben", test.get("Dennis"));
		assertTrue("Pinar ist enthalten", test.containsKey("Pinar"));
		assertFalse("Sovann ist nicht mehr enthalten",
				test1.containsKey("Sovann"));
	}

	@Test
	public void update() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);

		assertTrue("test soll 23 enthalten", test.get("Dennis").equals(23));

		test.update("Dennis", 42);

		assertTrue("test soll 42 enthalten", test.get("Dennis").equals(42));
	}

	@Test
	public void forEach() {

		// Testobjekt
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);

		// forEach
		BiConsumer<String, Integer> addiere = (key, value) -> {
			test.update(key, value + 19);
		};

		test.forEach(addiere);

		assertTrue("test soll nach Addition 42 enthalten", test.get("Dennis")
				.equals(42));

	}

	@Test
	public void map() {

		// Testobjekte
		typesafeAssociativeArray<String, Integer> test = new typesafeAssociativeArray<>();
		typesafeAssociativeArray<Double, Double> test1 = new typesafeAssociativeArray<>();

		test.addKnoten("Dennis", 23);
		test1.addKnoten(23.0, 25.0);

		// map
		BiFunction<Double, Double, Double> malFuenf = (key, value) -> {
			return value = value * 5;
		};

		test1 = test1.map(malFuenf);

		assertTrue("test1 soll 125 enthalten", test1.get(23.0).equals(125.0));

	}

	@Test
	public void keys() {

		// Testobjekt
		Dictionary dic = new Dictionary();

		dic.addKnoten("Dennis", "D");
		dic.addKnoten("Laura", "L");
		dic.addKnoten("Sandra", "S");

		String[] key = { "Dennis", "Laura", "Sandra" };
		String[] dicKeys = dic.keys();

		assertTrue("Dennis soll enthalten sein", dic.containsKey("Dennis"));
		assertArrayEquals(key, dicKeys);

	}

	@Test
	public void values() {
		
		// Testobjekt
		Dictionary dic = new Dictionary();
		
		dic.addKnoten("Dennis", "D");
		
		String[] values = {"D"};
		
		
		assertTrue("dic soll D enthalten",dic.containsValue("D"));
		assertArrayEquals("Arrays sind gleich",dic.values(),values);

	}

}
