package projetoPlanta;

public class Lirio extends Planta {
    public Lirio(String raiz, String aspectoPlanta, String clima) {
        super(raiz, aspectoPlanta, clima);
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
        System.out.println("\nRegue sua planta de duas a tres vezes por semana.");
    }

    @Override
    public void pararDeRegar() {
        System.out.println("\nRegue sua planta uma vez por semana.");
    }

    @Override
    public void tirarDoSol() {
        System.out.println("\nTire sua planta do sol.");
    }

    @Override
    public void colocarNoSol() {
        System.out.println("\nColoque sua planta em luz solar direta ao menos metade do dia!");
    }

    public void info() {
    	System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t\tDados gerais da sua planta: " + "\n\nEspécie: Lirio \nRaíz: " + getRaiz() + "\nAspecto: "+ getAspecto() + "\nClima: " + getClima());
   }
}
