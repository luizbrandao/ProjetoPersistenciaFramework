/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Empresa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
@ManagedBean
@SessionScoped
public class EmpresaController {
    private Empresa empresa;
    private DataModel listaEmpresas;
    
    public DataModel getListaEmpresa(){
        List<Empresa> lista = new EmpresaDAOImp().list();
        listaEmpresas = new ListDataModel(lista);
        return listaEmpresas;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void prepararAdicionarEmpresa(ActionEvent actionEvent){
        empresa = new Empresa();
    }
    public void prepararAlterarEmpresa(ActionEvent actionEvent){
        empresa = (Empresa)listaEmpresas.getRowData();
        
    }
    public String excluirEmpresa(){
        Empresa empresaTemp = (Empresa)(listaEmpresas.getRowData());
        EmpresaDAO dao = new EmpresaDAOImp();
        dao.remove(empresaTemp);
        return "index";
    }
    public void adicionarEmpresa(){
        EmpresaDAO dao = new EmpresaDAOImp();
        dao.save(empresa);
    }
    public void alterarEmpresa(){
        EmpresaDAO dao = new EmpresaDAOImp();
        dao.update(empresa);
    }
}