/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;


import br.com.projeto.vo.Usuario;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class UsuarioController {
    private Usuario usuario;
    private DataModel listaUsuarios;
    
    public DataModel getListaUsuarios(){
        List<Usuario> lista = new UsuarioDAOImp().list();
        listaUsuarios = new ListDataModel(lista);
        return listaUsuarios;
    }

    /**
     * @return the empresa
     */
    public Usuario getEmpresa() {
        return usuario;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void prepararAdicionarUsuario(ActionEvent actionEvent){
        usuario = new Usuario();
    }
    public void prepararAlterarUsuario(ActionEvent actionEvent){
        usuario = (Usuario)listaUsuarios.getRowData();
        
    }
    public String excluirUsuario(){
        Usuario usuarioTemp = (Usuario)(listaUsuarios.getRowData());
        UsuarioDAO dao = new UsuarioDAOImp();
        dao.remove(usuarioTemp);
        return "index";
    }
    public void adicionarUsuario(){
        UsuarioDAO dao = new UsuarioDAOImp();
        dao.save(usuario);
    }
    public void alterarUsuario(){
        UsuarioDAO dao = new UsuarioDAOImp();
        dao.update(usuario);
    }
}
