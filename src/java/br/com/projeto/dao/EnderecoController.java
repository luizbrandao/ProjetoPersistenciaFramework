/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Empresa;
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
    
    public void prepararAdicionarEmpresa(ActionEvent actionEvent){
        endereco = new Endereco();
    }
    public void prepararAlterarEmpresa(ActionEvent actionEvent){
        endereco = (Endereco)listaEndereco.getRowData();
        
    }
    public String excluirEmpresa(){
        Endereco enderecoTemp = (Endereco)(listaEndereco.getRowData());
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.remove(enderecoTemp);
        return "index";
    }
    public void adicionarEmpresa(){
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.save(endereco);
    }
    public void alterarEmpresa(){
        EnderecoDAO dao = new EnderecoDAOImp();
        dao.update(endereco);
    }
}
