package com.example.ProjetoFullStack.FullStackProject.DTO;
import com.example.ProjetoFullStack.FullStackProject.entity.usuarioEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class usuarioDTO {

    public usuarioDTO(usuarioEntity usuario){

        BeanUtils.copyProperties(usuario, this);
    }

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;

}
