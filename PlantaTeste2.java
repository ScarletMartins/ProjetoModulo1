package projetoPlanta;

import java.util.Scanner;

public class PlantaTeste2 {

	public static void main(String[] args) {
		int especie;
		int raiz;
		int aspecto;
		int clima;
		String valorRaiz = "";
		String valorAspecto = "";
		String valorClima = "";

		Suculenta suculenta = new Suculenta(valorRaiz, valorAspecto, valorClima);
		Begonia begonia = new Begonia(valorRaiz, valorAspecto, valorClima);
		Lirio lirio = new Lirio(valorRaiz, valorAspecto, valorClima);

		Scanner leia = new Scanner(System.in);
		
        System.out.println("\n** A presença de plantas em casa só traz benefícios: \nAlém de deixar qualquer ambiente "
        		+ "mais charmoso e aconchegante, elas ainda melhoram a qualidade do ar **");
 

		System.out.println("\nQual a sua planta? \n1-Suculenta \n2-Begonia \n3-Lirio ");
		especie = leia.nextInt();
		if(especie > 3) {
			System.out.println("\nOpção inválida!");
		}
		System.out.println(
				"\nComo está a raíz da sua planta?\n1-Seca \n2-Quebradiça \n3-Coloração Duvidosa \n4-Saudável");
		raiz = leia.nextInt();
		if(raiz > 4) {
			System.out.println("\nOpção inválida!");
		}
		System.out.println("\nComo está o aspecto geral da sua planta?\n1-Viva \n2-Capenga \n3-Pé na cova");
		aspecto = leia.nextInt();
		if(aspecto > 3) {
			System.out.println("\nOpção inválida!");
		}
		System.out.println("\nComo está o clima?\n1-Frio \n2-Quente \n3-Ameno");
		clima = leia.nextInt();
		if(clima > 3) {
			System.out.println("\nOpção inválida!");
		}

		switch (raiz) {
		case 1:
			valorRaiz = "Seca";
			break;
		case 2:
			valorRaiz = "Quebradiça";
			break;
		case 3:
			valorRaiz = "Coloração duvidosa";
			break;
		case 4:
			valorRaiz = "Saudável";
			break;
		}

		suculenta.setRaiz(valorRaiz);
		begonia.setRaiz(valorRaiz);
		lirio.setRaiz(valorRaiz);

		switch (aspecto) {
		case 1:
			valorAspecto = "Viva";
			break;
		case 2:
			valorAspecto = "Capenga";
			break;
		case 3:
			valorAspecto = "Pé na cova";
			break;
		}

		suculenta.setAspecto(valorAspecto);
		begonia.setAspecto(valorAspecto);
		lirio.setAspecto(valorAspecto);

		switch (clima) {
		case 1:
			valorClima = "Frio";
			break;
		case 2:
			valorClima = "Quente";
			break;
		case 3:
			valorClima = "Ameno";
			break;
		}

		suculenta.setClima(valorClima);
		begonia.setClima(valorClima);
		lirio.setClima(valorClima);

		System.out.println("\n\t\t\t\t\t\t\t\t\tRecomendações: ");
    	System.out.println("\n\t\t-------------------------------------------------------------------------------------------------------------------------------------------------------");

		switch (especie) {
		case 1:
			if ((raiz == 1 || raiz == 2) || (aspecto == 3)) {
				suculenta.trocarTerra();
				suculenta.tirarDoSol();
			} else if ((raiz > 0 || raiz <= 3) || (aspecto == 2 || aspecto == 3) || (clima == 2)) {
				suculenta.regar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 1)) {
				suculenta.pararDeRegar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 2)) {
				suculenta.colocarNoSol();
			}
			suculenta.info();
			break;
		case 2:
			if (raiz == 2 || (aspecto == 3)) {
				begonia.trocarTerra();
				begonia.tirarDoSol();
			} else if (raiz == 1 || (aspecto == 2 || aspecto == 3) || (clima == 2)) {
				begonia.regar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 1)) {
				begonia.pararDeRegar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 2)) {
				begonia.colocarNoSol();
			}
			begonia.info();
			System.out.println("\nPara cuidar de begônias, tente manter o solo sempre úmido, mas nunca encharcado, porque pode causar podridão nas raízes. \nQuando for regar, evite molhar as folhas, porque isso poderá causar fungos. \nAs begônias têm caules carnudos e folhas que armazenam água, por isso não precisam de rega constante.");
			break;
		case 3:
			if ((raiz == 1 || raiz == 2) || (aspecto == 3)) {
				lirio.trocarTerra();
				lirio.tirarDoSol();
			} else if ((raiz > 0 || raiz <= 3) || (aspecto == 2 || aspecto == 3) || (clima == 2)) {
				lirio.regar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 1)) {
				lirio.pararDeRegar();
			} else if ((raiz == 3 || raiz == 4) || (aspecto == 2)) {
				lirio.colocarNoSol();
			}
			lirio.info();
			break;
		}

		System.out.println(
				"\n\t\t-------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n\t\t\t\t\t\tE aqui algumas dicas para voce cuidar da sua planta indoor: ");
		System.out.println(
				"\n\n\n- A quantidade de regas varia de acordo com a espécie, a época do ano e o local de cultivo. "
						+ "\nUma boa maneira de descobrir a periodicidade ideal é afundar um pouco o dedo na terra. "
						+ "\nSe ainda estiver úmida, espere mais uns dias. Caso esteja seca, é sinal de que chegou a hora de regar. "
						+ "\nE lembre-se de que a água deve ser colocada sempre na terra, não sobre as folhas.");
		System.out.println(
				"\n- Para obter um solo bem drenado e bom para o cultivo de grande parte das espécies, misture duas partes de areia para uma parte de terra. "
						+ "\nE evite deixar a terra encharcada, porque a umidade excessiva apodrecer as raízes.");
		System.out.println(
				"\n- Para proporcionar um crescimento por igual, vire o vaso de tempos em tempos. Também é importante não mudar os vasos de lugar. "
						+ "\nSe for realmente preciso, faça isso de forma lenta e gradual, para que a espécie consiga se adaptar novamente. "
						+ "\nUma mudança repentina pode ocasionar uma queda drástica de folhas.");
		System.out.println(
				"\n- Crie o hábito de passar um pano úmido nas folhas para retirar o pó e deixá-las mais bonitas. "
						+ "\nAo descartar uma folha ou um galho seco, passe um pouco de canela em pó no local do corte. "
						+ "\nO ingrediente é um cicatrizante natural e impede a entrada de fungos e doenças.");
	}
}
