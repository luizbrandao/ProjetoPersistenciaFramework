/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.vo.Reserva;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luiz
 */
public class ReservaController {
    private Reserva reserva;
    private DataModel listaReserva;

    
    public DataModel getListaReserva(){
        List<Reserva> lista = new ReservaDAOImp().list();
        listaReserva = new ListDataModel(lista);
        return listaReserva;
    }
    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public void prepararAdicionarReserva(ActionEvent actionEvent){
        reserva = new Reserva();
    }
    public void prepararAlterarReserva(ActionEvent actionEvent){
        reserva = (Reserva)listaReserva.getRowData();
        
    }
    public String excluirReserva(){
        Reserva reservaTemp = (Reserva)(listaReserva.getRowData());
        ReservaDAO dao = new ReservaDAOImp();
        dao.remove(reservaTemp);
        return "index";
    }
    public void adicionarReserva(){
        ReservaDAO dao = new ReservaDAOImp();
        dao.save(reserva);
    }
    public void alterarReserva(){
        ReservaDAO dao = new ReservaDAOImp();
        dao.update(reserva);
    }   
}