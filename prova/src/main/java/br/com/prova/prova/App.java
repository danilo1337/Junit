package br.com.prova.prova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.prova.prova.questao2.Principal;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws Exception
    {
 		Principal p = new Principal();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		try {
			Date joda = sdf.parse(p.getHorario());
			
			System.out.println(joda.getTime());
			System.out.println(new Date().getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
