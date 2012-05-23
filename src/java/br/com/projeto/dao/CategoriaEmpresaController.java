/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.CategoriaEmpresa;
import br.com.projeto.vo.Empresa;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class CategoriaEmpresaController {
    private CategoriaEmpresa categoria;
    private DataModel listaCategoriaEmpresa;
    
    public DataModel getListaCategoriaEmpresa(){
        List<CategoriaEmpresa> lista = new CategoriaEmpresaDAOImp().list();
        listaCategoriaEmpresa = new ListDataModel(lista);
        return listaCategoriaEmpresa;
    }

    /**
     * @return the categoria
     */
    public CategoriaEmpresa getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(CategoriaEmpresa categoria) {
        this.categoria = categoria;
    }
    
    public void prepararAdicionarCategoriaEmpresa(ActionEvent actionEvent){
        categoria = new CategoriaEmpresa();
    }
    public void prepararAlterarEmpresa(ActionEvent actionEvent){
        categoria = (CategoriaEmpresa)listaCategoriaEmpresa.getRowData();
        
    }
    public String excluirEmpresa(){
        CategoriaEmpresa categoriaTemp = (CategoriaEmpresa)(listaCategoriaEmpresa.getRowData());
        CategoriaEmpresaDAO dao = new CategoriaEmpresaDAOImp();
        dao.remove(categoriaTemp);
        return "index";
    }
    public void adicionarEmpresa(){
        CategoriaEmpresaDAO dao = new CategoriaEmpresaDAOImp();
        dao.save(categoria);
    }
    public void alterarEmpresa(){
        CategoriaEmpresaDAO dao = new CategoriaEmpresaDAOImp();
        dao.update(categoria);
    }
}