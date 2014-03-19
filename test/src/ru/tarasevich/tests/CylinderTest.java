package ru.tarasevich.tests;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.tarasevich.lab5.Cylinder;

    public class CylinderTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Цилиндр");
			Cylinder t = new Cylinder(1,1,1,"Cylinder");
			assertEquals("Cylinder",t.name);
		}   
	@Test
	 public void testMethod(){
			System.out.println("Тестируем метод getArea()");
			Cylinder t = new Cylinder(4,8,4,"Cylinder");
			assertEquals(32.0,t.getArea(),0.01);			
		}
}
