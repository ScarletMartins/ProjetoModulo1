package projetoPlanta;

public abstract class Planta {

    private String especie;
    private String raiz;
    private String aspecto;
    private String clima;

    abstract public void trocarTerra();

    abstract public void regar();

    abstract public void pararDeRegar();

    abstract public void tirarDoSol();

    abstract public void colocarNoSol();

    abstract public void podar();

    abstract public void indicacao();

    public Planta(String raiz, String aspecto, String clima) {
        this.raiz = raiz;
        this.aspecto = aspecto;
        this.clima = clima;
    }

    public String getRaiz() {
        return raiz;
    }

    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

}
