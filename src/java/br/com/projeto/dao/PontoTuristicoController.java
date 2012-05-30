/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.PontoTuristico;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class PontoTuristicoController {
    private PontoTuristico ponto;
    private DataModel listaPontos;

    /**
     * @return the ponto
     */
    public PontoTuristico getPonto() {
        return ponto;
    }

    /**
     * @param ponto the ponto to set
     */
    public void setPonto(PontoTuristico ponto) {
        this.ponto = ponto;
    }
    
    public DataModel getListaPontoTuristico(){
        List<PontoTuristico> lista = new PontoTuristicoDAOImp().list();
        listaPontos = new ListDataModel(lista);
        return listaPontos;
    }
    
    public void prepararAdicionarPonto(ActionEvent actionEvent){
        ponto = new PontoTuristico();
    }
    public void prepararAlterarPonto(ActionEvent actionEvent){
        ponto = (PontoTuristico)listaPontos.getRowData();
        
    }
    public String excluirPonto(){
        PontoTuristico pontoTemp = (PontoTuristico)(listaPontos.getRowData());
        PontoTuristicoDAO dao = new PontoTuristicoDAOImp();
        dao.remove(pontoTemp);
        return "index";
    }
    public void adicionarPonto(){
        PontoTuristicoDAO dao = new PontoTuristicoDAOImp();
        dao.save(ponto);
    }
    public void alterarPonto(){
        PontoTuristicoDAO dao = new PontoTuristicoDAOImp();
        dao.update(ponto);
    }   
}