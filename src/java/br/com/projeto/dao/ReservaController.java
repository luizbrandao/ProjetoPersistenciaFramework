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
    
    public void prepararAdicionarEmpresa(ActionEvent actionEvent){
        reserva = new Reserva();
    }
    public void prepararAlterarEmpresa(ActionEvent actionEvent){
        reserva = (Reserva)listaReserva.getRowData();
        
    }
    public String excluirEmpresa(){
        Reserva reservaTemp = (Reserva)(listaReserva.getRowData());
        ReservaDAO dao = new ReservaDAOImp();
        dao.remove(reservaTemp);
        return "index";
    }
    public void adicionarEmpresa(){
        ReservaDAO dao = new ReservaDAOImp();
        dao.save(reserva);
    }
    public void alterarEmpresa(){
        ReservaDAO dao = new ReservaDAOImp();
        dao.update(reserva);
    }
    
}
