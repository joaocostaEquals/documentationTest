package br.com.equals.conciliadorapi.usuario;

import br.com.equals.conciliadorapi.usuario.mapper.IUsuarioMapper;
import br.com.equals.domain.Usuario;

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
    public Usuario getUser(@PathParam("id") Integer id) {
        
        return usuarioMapper.getUsuarioById(id);
    }
}
