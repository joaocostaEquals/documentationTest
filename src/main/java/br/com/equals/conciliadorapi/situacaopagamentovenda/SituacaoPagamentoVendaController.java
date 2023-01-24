package br.com.equals.conciliadorapi.situacaopagamentovenda;

import br.com.equals.conciliadorapi.situacaopagamentovenda.mapper.ISituacaoPagamentoVendaMapper;
import br.com.equals.domain.SituacaoPagamentoDeVenda;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/situacaopagamentovenda")
public class SituacaoPagamentoVendaController {

    @Inject
    private ISituacaoPagamentoVendaMapper situacaoPagamentoVendaMapper;

    @Path("/{idHistRelatorio}")
    @GET
    @Transactional
    @Operation(summary = "Retorna o relatório de Situação de Pagamento de Vendas")
    @APIResponse(responseCode = "200", //
            content = @Content(//
                    mediaType = MediaType.APPLICATION_JSON, //
                    schema = @Schema(//
                            implementation = SituacaoPagamentoDeVenda.class, //
                            type = SchemaType.ARRAY)))
    @Produces(MediaType.APPLICATION_JSON)
    public List<SituacaoPagamentoDeVenda> getUser(@PathParam("idHistRelatorio") Long idHistRelatorio) throws IOException {
        List<SituacaoPagamentoDeVenda> situacaoPagamentoDeVendas = new ArrayList<>();
        try (Cursor<SituacaoPagamentoDeVenda> cursor = situacaoPagamentoVendaMapper.pesquisarRelatorioPronto(idHistRelatorio)) {
            cursor.forEach(s -> situacaoPagamentoDeVendas.add(s));
        } catch (PersistenceException | IOException e) {
          throw e;
        }
        return situacaoPagamentoDeVendas;
    }
}
