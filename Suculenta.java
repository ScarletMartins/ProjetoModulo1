package projetoPlanta;

public class Suculenta extends Planta {
    public Suculenta(String raiz, String aspecto, String clima) {
        super(raiz, aspecto, clima);
    }

    @Override
    public void trocarTerra() {
        System.out.println("\nTroque sua terra");
    }

    @Override
    public void regar() {
        System.out.println("\nRegue sua planta uma vez por semana");
    }

    @Override
    public void pararDeRegar() {
        System.out.println("\nPare de regar sua planta");
    }

    @Override
    public void tirarDoSol() {
        System.out.println("\nTire sua planta do sol");
    }

    @Override
    public void colocarNoSol() {
        System.out.println("\nColoque sua planta no sol");
    }

    @Override
    public void indicacao() {
        System.out.println("\nCuidados de acordo com o clima");
    }
    
    public void info() {
    	System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t\tDados gerais da sua planta: " + "\n\nEspécie: Suculenta \nRaíz: " + getRaiz() + "\nAspecto: "+ getAspecto() + "\nClima: " + getClima());
   }
}
