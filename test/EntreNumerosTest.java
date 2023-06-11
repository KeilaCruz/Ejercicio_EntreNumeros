package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import entrenumeros.EntreNumeros;

public class EntreNumerosTest{
    @Test
    public void testUno()
    {
        int numUno = 5;
        int numDos = 10;

        String esperado = "6 8";
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        EntreNumeros.imprimirNumeros(numUno, numDos);
        String actual = salida.toString().trim();
        assertEquals(esperado,actual);

    }
    @Test
    public void testDos()
    {
        int numUno = -1;
        int numDos = 5;

        String esperado = "0 2 4";
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        EntreNumeros.imprimirNumeros(numUno, numDos);
        String actual = salida.toString().trim();
        assertEquals(esperado,actual);

    }
    @Test
    public void testTres()
    {
        int numUno = -3;
        int numDos = 10;

        String esperado = "-2 0 2 4 6 8";
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        EntreNumeros.imprimirNumeros(numUno, numDos);
        String actual = salida.toString().trim();
        assertEquals(esperado,actual);
    }
    @Test
    public void testCuatro()
    {
        int numUno = 4;
        int numDos = 1;

        String esperado = "El num uno no es valido";
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        EntreNumeros.imprimirNumeros(numUno, numDos);
        String actual = salida.toString().trim();
        assertEquals(esperado,actual);

    }
    @Test
    public void testCinco()
    {
        int numUno = 7;
        int numDos = 7;

        String esperado = "El num uno no es valido";
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));
        EntreNumeros.imprimirNumeros(numUno, numDos);
        String actual = salida.toString().trim();
        assertEquals(esperado,actual);

    }
}