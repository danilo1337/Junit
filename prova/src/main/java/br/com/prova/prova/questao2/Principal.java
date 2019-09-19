package br.com.prova.prova.questao2;

import org.joda.time.LocalDateTime;

public class Principal {
	
	public String getHorario() {
		LocalDateTime joda = new LocalDateTime();
		return joda.toString("HH:mm:ss.SSS");
	}
}
