package br.com.prova.prova;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import br.com.prova.prova.questao2.Principal;

public class TestePrincipal {

	@Test
	public void testGetHorario() {
 		Principal p = new Principal();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		try {
			Date joda = sdf.parse(p.getHorario());
			Date dateJava = sdf.parse(sdf.format(new Date()));
			assertEquals(joda.getTime(), dateJava.getTime(), 100);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
