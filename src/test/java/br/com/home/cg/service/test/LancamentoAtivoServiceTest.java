package br.com.home.cg.service.test;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.home.cg.modelo.Lancamento;
import br.com.home.cg.modelo.LancamentoAtivo;
import br.com.home.cg.modelo.TipoLancamento;
import br.com.home.cg.modelo.TipoLancamentoAtivo;
import br.com.home.cg.service.GenericService;

@ContextConfiguration(locations={"/context-test.xml"})
@TransactionConfiguration(defaultRollback=false)
public class LancamentoAtivoServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Resource
	private GenericService<LancamentoAtivo> service;
	
	@Test
	public void testSalvar(){
		
		LancamentoAtivo ativo = new LancamentoAtivo();
		
		Lancamento lancamento = new Lancamento();
		
		lancamento.setDataLancamento(new Date());
		lancamento.setDescricao("lalala");
		lancamento.setTipoLancamento(TipoLancamento.DEPOSITO);
		lancamento.setValorLancamento(BigDecimal.valueOf(2600));
		
		ativo.setTipo(TipoLancamentoAtivo.TECSINAPSE);
		ativo.setLancamento(lancamento);
		
		
		service.salvar(ativo);
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context-test.xml");
		GenericService<LancamentoAtivo> service = ctx.getBean(GenericService.class);
		
		LancamentoAtivo ativo = new LancamentoAtivo();
		
		Lancamento lancamento = new Lancamento();
		
		lancamento.setDataLancamento(new Date());
		lancamento.setDescricao("lalala");
		lancamento.setTipoLancamento(TipoLancamento.DEPOSITO);
		lancamento.setValorLancamento(BigDecimal.valueOf(2600));
		
		ativo.setTipo(TipoLancamentoAtivo.TECSINAPSE);
		ativo.setLancamento(lancamento);
		
		
		service.salvar(ativo);
	}
}
