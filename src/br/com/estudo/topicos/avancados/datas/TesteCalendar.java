package br.com.estudo.topicos.avancados.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.HOUR_OF_DAY, 15);
		c.set(Calendar.MINUTE, 45);
		c.set(Calendar.SECOND, 29);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, 28);
		System.out.println(formatador.format(c.getTime()));
		
		//Rola os dias dentro do próprio mÊs.
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
	}

}
