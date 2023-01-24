package br.com.equals.conciliadorapi.usuario;

import br.com.equals.conciliadorapi.usuario.mapper.IUsuarioMapper;
import br.com.equals.domain.SituacaoPagamentoDeVenda;
import br.com.equals.domain.Usuario;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class UsuarioController {

    @Inject
    IUsuarioMapper usuarioMapper;

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retorna informações do usuário")
    @APIResponse(responseCode = "200", //
            content = @Content(//
                    mediaType = MediaType.APPLICATION_JSON, //
                    schema = @Schema(//
                            implementation = Usuario.class, //
                            type = SchemaType.OBJECT)))
    public Usuario getUser(@PathParam("id") Integer id) {
        
        return usuarioMapper.getUsuarioById(id);
    }
}
