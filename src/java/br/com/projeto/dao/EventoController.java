/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Evento;
import br.com.projeto.vo.Usuario;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class EventoController {
    private Evento evento;
    private DataModel listaEventos;
    
    public DataModel getListaEventos(){
        List<Evento> lista = new EventoDAOImp().list();
        listaEventos = new ListDataModel(lista);
        return listaEventos;
    }

    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public void prepararAdicionarUsuario(ActionEvent actionEvent){
        evento = new Evento();
    }
    public void prepararAlterarUsuario(ActionEvent actionEvent){
        evento = (Evento)listaEventos.getRowData();
        
    }
    public String excluirUsuario(){
        Evento eventoTemp = (Evento)(listaEventos.getRowData());
        EventoDAO dao = new EventoDAOImp();
        dao.remove(eventoTemp);
        return "index";
    }
    public void adicionarUsuario(){
        EventoDAO dao = new EventoDAOImp();
        dao.save(evento);
    }
    public void alterarUsuario(){
        EventoDAO dao = new EventoDAOImp();
        dao.update(evento);
    }
    
}
