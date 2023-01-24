package br.com.equals.conciliadorapi.situacaopagamentovenda.mapper;

import br.com.equals.domain.SituacaoPagamentoDeVenda;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.cursor.Cursor;

@Mapper
public interface ISituacaoPagamentoVendaMapper {

    public Cursor<SituacaoPagamentoDeVenda> pesquisarRelatorioPronto(Long idHistRelatorio);
    
}
