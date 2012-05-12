package br.com.projeto.vo;

public class Rota {

    private float endereco_inicial;
    private float endereco_final;
    private int distancia;
    private RotaFactory rotaFactory;

    /**
     * @return the endereco_inicial
     */
    public float getEndereco_inicial() {
        return endereco_inicial;
    }

    /**
     * @param endereco_inicial the endereco_inicial to set
     */
    public void setEndereco_inicial(float endereco_inicial) {
        this.endereco_inicial = endereco_inicial;
    }

    /**
     * @return the endereco_final
     */
    public float getEndereco_final() {
        return endereco_final;
    }

    /**
     * @param endereco_final the endereco_final to set
     */
    public void setEndereco_final(float endereco_final) {
        this.endereco_final = endereco_final;
    }

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the rotaFactory
     */
    public RotaFactory getRotaFactory() {
        return rotaFactory;
    }

    /**
     * @param rotaFactory the rotaFactory to set
     */
    public void setRotaFactory(RotaFactory rotaFactory) {
        this.rotaFactory = rotaFactory;
    }
}
