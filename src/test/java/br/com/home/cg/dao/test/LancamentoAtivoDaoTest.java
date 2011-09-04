package br.com.home.cg.dao.test;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.home.cg.dao.LancamentoAtivoDao;
import br.com.home.cg.modelo.Lancamento;
import br.com.home.cg.modelo.LancamentoAtivo;
import br.com.home.cg.modelo.TipoLancamento;
import br.com.home.cg.modelo.TipoLancamentoAtivo;

@ContextConfiguration(locations={"/context-test.xml"})
@TransactionConfiguration(defaultRollback=false)
public class LancamentoAtivoDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Resource
	private LancamentoAtivoDao dao;
	
	@Test
	public void testSalvar(){
		
		LancamentoAtivo ativo = new LancamentoAtivo();
		
		Lancamento lancamento = new Lancamento();
		
		lancamento.setDataLancamento(new Date());
		lancamento.setDescricao("lalala");
		lancamento.setTipoLancamento(TipoLancamento.DEPOSITO);
		lancamento.setValorLancamento(BigDecimal.valueOf(2600));
		
		ativo.setTipo(TipoLancamentoAtivo.TECSINAPSE);
		
		
		dao.salva(ativo);
	}
}
