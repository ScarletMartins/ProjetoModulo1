package projetoPlanta;

public class Suculenta extends Planta {
    public Suculenta(String raiz, String aspecto, String clima) {
        super(raiz, aspecto, clima);
    }

    @Override
    public void trocarTerra() {
        System.out.println("\nTroque sua terra. E não esqueça de colocar suprimentos como areia e nutrientes!");
    }
    
    @Override
    public void reporTerra() {
        System.out.println("\nReponha nutrientes na sua terra. \nAo decorrer do tempo, a terra tende a perder nutrientes e é preciso troca-lá para reposição.");
    }

    @Override
    public void regar() {
        System.out.println("\nRegue sua planta uma vez por semana!");
    }

    @Override
    public void pararDeRegar() {
        System.out.println("\nPare de regar sua planta por uma semana e observe sua resposta.");
    }

    @Override
    public void tirarDoSol() {
        System.out.println("\nTire sua planta do sol direto. Suculentas precisam de iluminação solar indireta diariamente!");
    }

    @Override
    public void colocarNoSol() {
        System.out.println("\nColoque sua planta em iluminação solar indireta diariamente!");
    }
    
    public void info() {
    	System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t\tDados gerais da sua planta: " + "\n\nEspécie: Suculenta \nRaíz: " + getRaiz() + "\nAspecto: "+ getAspecto() + "\nClima: " + getClima());
    }
}
