package br.com.projeto.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "empresa")
@SequenceGenerator(initialValue=1, name="seq_empresa", sequenceName="seq_empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_empresa")
    private int idEmpresa;
    private String razaoSocial;
    private String nomeFantasia;
    private int cnpj;
    private String endereco;
    
    @OneToMany(fetch=FetchType.EAGER)
    private List<Empresa> empresas = new ArrayList<Empresa>();
    
    @OneToMany(fetch=FetchType.EAGER)
    private Endereco idEndereco;
    
    @OneToMany(fetch=FetchType.EAGER)
    private Evento idEvento;
    
    @OneToMany(fetch=FetchType.EAGER)
    private CategoriaEmpresa idCategoria;
    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public List<Empresa> getEmpresas(){
        return empresas;
    }
    
    public void setEmpresas(List<Empresa> empresas){
        this.empresas = empresas;
    }
}