/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Endereco;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class EnderecoController {
    private Endereco endereco;
    private DataModel listaEndereco;

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public DataModel getListaEndereco(){
        List<Endereco> lista = new EnderecoDAOImp().list();
        listaEndereco = new ListDataModel(lista);
        return listaEndereco;
    }
    
    public void prepararAdicionarEndereco(ActionEvent actionEvent){
        endereco = new Endereco();
    }
    public void prepararAlterarEndereco(ActionEvent actionEvent){
        endereco = (Endereco)listaEndereco.getRowData();
        
    }
    public String excluirEndereco(){
        Endereco enderecoTemp = (Endereco)(listaEndereco.getRowData());
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.remove(enderecoTemp);
        return "index";
    }
    public void adicionarEndereco(){
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.save(endereco);
    }
    public void alterarEndereco(){
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.update(endereco);
    }
}