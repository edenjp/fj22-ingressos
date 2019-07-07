package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import br.com.caelum.ingresso.model.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.ingresso.model.descontos.SemDesconto;

public class DescontoTest {
	private Lugar lugar;
	private Sala sala;
	private Filme filme;
	private Sessao sessao;
	private Ingresso ingresso;
	private BigDecimal precoEsperado;


	@Before
	public void before() {
		this.lugar = new Lugar("A",1);
		this.sala = new Sala("Eldorado - IMAX", new BigDecimal("20.5"));
		this.filme = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12"));
		this.sessao = new Sessao(LocalTime.parse("10:00:00"), filme, sala);
	}


	@Test
	public void naoDeveConcederDescontoParaIngressoNormal(){
		this.ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO, lugar);
		this.precoEsperado = new BigDecimal("32.50");
	}

	@Test
	public void deveConcederDescontoDe30PorcentoParaIngressosDeClientesDeBancos() {
		this.ingresso = new Ingresso(sessao, TipoDeIngresso.BANCO, lugar);
		this.precoEsperado = new BigDecimal("22.75");
	}

	@Test
	public void deveConcederDescontoDe50PorcentoParaIngressoDeEstudante() {
		this.ingresso = new Ingresso(sessao, TipoDeIngresso.ESTUDANTE, lugar);
		this.precoEsperado = new BigDecimal("16.25");
	}

	@After
	public void after() {
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
}
