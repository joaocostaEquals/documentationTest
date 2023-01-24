package br.com.equals.conciliadorapi.usuario.mapper;

import br.com.equals.domain.Usuario;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUsuarioMapper {

    public Usuario getUsuarioById(Integer id);
    
}
