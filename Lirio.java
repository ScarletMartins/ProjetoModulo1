package projetoPlanta;

public class Lirio extends Planta {
    public Lirio(String raiz, String aspectoPlanta, String clima) {
        super(raiz, aspectoPlanta, clima);
    }

    @Override
    public void trocarTerra() {
        System.out.println("\nTroque sua terra");
    }

    @Override
    public void regar() {
        System.out.println("\nBorrife água uma vez na sua planta");
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
    public void podar() {
        System.out.println("\nRealize a poda da sua planta");
    }

    @Override
    public void indicacao() {
        System.out.println("\nCuidados de acordo com o clima");
    }
    
    public void info() {
    	System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("\n\t\tDados gerais da sua planta: " + "\n\nEspécie: Lirio \nRaíz: " + getRaiz() + "\nAspecto: "+ getAspecto() + "\nClima: " + getClima());
        System.out.println("\nA presença de plantas em casa só traz benefícios: além de deixar qualquer ambiente "
        		+ "mais charmoso e aconchegante, elas ainda melhoram a qualidade do ar.");
    }
}
