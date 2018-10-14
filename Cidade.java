/**
 * Cidade
 * Classe que gera cidade
 *
 * @author Rafael Felipe Cardoso Lino
 *
 * @see Cidade
 */

package trabalho;

import java.util.ArrayList;

public class Cidade {


        /**
	 * Instanciando a classe veículo
	 */

    Veiculo v = new Veiculo();

        /**
	 * Gerando ArrayList de cada um dos veículos
	 */

        ArrayList <Carro> civic = new ArrayList<>(); ///Carro
	ArrayList <MuitasRodas> mercedes = new ArrayList<>(); ///MuitasRodas
	ArrayList <DuasRodas> ninja = new ArrayList<>(); ///DuasRodas
        ArrayList <Bicitreta> bicicleta = new ArrayList<>();  // Bicicleta


    public int mapa [] [] ={{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};


        /**
	 * Função que gera veículos aleatóriamente
	 */
   public void CriaVeiculos() {
		for(int i = 0; i < 10; i++) {
			civic.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
			while (mapa[civic.get(i).getX()][civic.get(i).getY()] == 2) {/**< Verificando se o quatroRodas foi gerado onde há uma maternidade, se sim, trocando-o */
				civic.get(i).setX();
				civic.get(i).setY();
			}

			mercedes.add(new MuitasRodas((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
			while (mapa[mercedes.get(i).getX()][mercedes.get(i).getY()] == 2) {
				mercedes.get(i).setX();
				mercedes.get(i).setY();
			}

			ninja.add(new DuasRodas((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
			while (mapa[ninja.get(i).getX()][ninja.get(i).getY()] == 2) {
				ninja.get(i).setX();
				ninja.get(i).setY();
			}


			bicicleta.add(new Bicitreta((v.setX()+1), (v.setY()+1), 1, "Verde", false));
			while (mapa[bicicleta.get(i).getX()][bicicleta.get(i).getY()] == 2) {
				bicicleta.get(i).setX();
				bicicleta.get(i).setY();
			}
                        }
	}
        /**
	 * Função que reinicia o mapa, apaga os rastros
	 */

    public void zeraMapa() {
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mapa[i][j] != 1 && mapa[i][j] != 2) {
					mapa[i][j] = 0;
				}
			}
		}
                for (int a = 0; a < civic.size(); a++) {

			int xcar = civic.get(a).getX();
			int ycar = civic.get(a).getY();


			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xcar && j == ycar) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;

						}
						else {
							mapa[i][j] = 3;
						}
					}
				}
			}
		}
                /**
		 * Adicionando os novos veículos no mapa
		 */

		for(int a  = 0; a < mercedes.size(); a++) {
                    /// Obtendo as corrdenadas
			int xcao = mercedes.get(a).getX();
			int ycao = mercedes.get(a).getY();

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xcao && j == ycao) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;

						}
						else {
							mapa[i][j] = 4;
						}
					}
				}
			}
		}

		for(int a = 0; a < ninja.size(); a ++) {
			int xm = ninja.get(a).getX();
			int ym = ninja.get(a).getY();

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xm && j == ym) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;

						}
						else {
							mapa[i][j] = 5;
						}
					}
				}
			}
		}
                for(int a = 0; a < bicicleta.size(); a ++) {
			int xm = bicicleta.get(a).getX();
			int ym = bicicleta.get(a).getY();

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xm && j == ym) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;

						}
						else {
							mapa[i][j] = 6;
						}
					}
				}
			}
		}



	}

        /**
	 * Função que desenha o cidade
	 */

    public void newCity() {

                /**
		 * Variaveís que recebem o código da color e auxíliam na hora de imprimir na tela
		 */
                String map = "\u001B[33m";///Código referente color WHITE
                String maternidade = "\u001B[35m";///Código referente color MAGENTA
                String limite = "\u001B[36m" ;///Código referente color CYAN
		String carroVermelho = "\u001B[31m";///Código referente color RED
                String camiAmarelo = "\u001B[37m";///Código referente color YELLOW
                String motoAzul = "\u001B[34m";///Código referente color BLUE
                String bikess = "\u001B[32m"; // Codigo referente color GREEN
                 /**
		 * Contadores para exibição
		 */
		int civics = 0;
		int ninjas = 0;
		int trucks = 0;
                int bicicletas = 0;

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {

                                        /**
					 * Gerando mapa
					 */

					if(mapa[i][j] == 1) {
						System.out.print(limite + "█");
					}
					else if(mapa[i][j] == 0) {
						System.out.print(map + "█");
					}

					else if(mapa[i][j] == 2) {
						System.out.print(maternidade + "█");
					}
					else if(mapa[i][j] == 3){
						System.out.print(carroVermelho + "█");
					}
					else if(mapa[i][j] == 4){
						System.out.print(camiAmarelo + "█");
					}
					else if(mapa[i][j] == 5){
						System.out.print(motoAzul + "█");
					}
                                        else if(mapa[i][j] == 6){
						System.out.print(bikess + "█");
					}

				}

				System.out.println("");
			}

                         /**
			 * Imprimindo a legenda
			 */

       System.out.print(bikess + "█");
 			System.out.print(" Bikes  ");
      System.out.print(motoAzul + "█");
			System.out.print(" Motos  ");
			System.out.print(carroVermelho + "█");
			System.out.print(" Carros   ");
			System.out.print(camiAmarelo + "█");
			System.out.println(" Caminhão");



                        /**
			 * Contadores
			 */

			for(int a = 0; a < civic.size(); a++) {
				civics++;
			}
			for(int a = 0; a < mercedes.size(); a++) {
				trucks++;
			}
			for(int a = 0; a < ninja.size(); a++) {
				ninjas++;
			}

			for(int a = 0; a < bicicleta.size(); a++) {
				bicicletas++;
			}

      System.out.println("Numero de Bikes: " + bicicletas);
      System.out.println("Numero de Motos: " + ninjas);
			System.out.println("Numero de Carros: " + civics);
			System.out.println("Numero de Caminhoes: " + trucks);


	}

	/**
	 * Função que atualiza a cidade fazendo os veículos se moverem
	 */
	public void attCity() {
            //contaRodadas +=1;

		for(int i = 0; i < civic.size(); i++) {
			civic.get(i).moveCarro(civic.get(i));
		}

		for (int i = 0; i < mercedes.size(); i ++) {
			mercedes.get(i).moveCaminhao(mercedes.get(i));
		}

		for (int i = 0; i < ninja.size(); i ++) {
			ninja.get(i).moveMoto(ninja.get(i));
		}
                for (int i = 0; i < bicicleta.size(); i ++) {
			bicicleta.get(i).moveBike(bicicleta.get(i));
		}

		geraVeiculo();
		detectaColisao();
		zeraMapa();
		newCity();

	}
	/**
	 * Função que detecta colisão entre os veículos
	 */

	public void detectaColisao() {
		/// Colisão quatroRodas com quatroRodas
		for (int i = 0; i < civic.size(); i ++) {
			for (int j = 0; j < civic.size(); j++) {
				if(civic.get(j).getX() == civic.get(i).getX() && civic.get(j).getY() == civic.get(i).getY()) {
					if (i == j) {

					}
					else {
						civic.remove(civic.get(i));
					}
				}
			}
		}
		/// Colisão caminhão com caminhão

		for (int i = 0; i < mercedes.size(); i ++) {
			for (int j = 0; j < mercedes.size(); j++) {
				if(mercedes.get(j).getX() == mercedes.get(i).getX() && mercedes.get(j).getY() == mercedes.get(i).getY()) {
					if(i == j) {

					}
					else {
						mercedes.remove(mercedes.get(i));
					}
				}
			}
		}
                //Colisão entre Bicitreta e Bicitreta
                for (int i = 0; i < bicicleta.size(); i ++) {
			for (int j = 0; j < bicicleta.size(); j++) {
				if(bicicleta.get(j).getX() == bicicleta.get(i).getX() && bicicleta.get(j).getY() == bicicleta.get(i).getY()) {
					if(i == j) {

					}
					else {
						bicicleta.remove(bicicleta.get(i));
					}
				}
			}
		}

		/// Colisão ninja com ninja
		for (int i = 0; i < ninja.size(); i ++) {
			for (int j = 0; j < ninja.size(); j++) {
				if(ninja.get(j).getX() == ninja.get(i).getX() && ninja.get(j).getY() == ninja.get(i).getY()) {
					if(i == j) {

					}
					else {
						ninja.remove(ninja.get(i));
					}
				}
			}
		}

		/// Colisão entre caminhão e quatroRodas
		for(int i = 0; i < mercedes.size(); i++) {
			for (int j = 0; j < civic.size(); j++) {
				if(civic.get(j).getX() == mercedes.get(i).getX() && civic.get(j).getY() == mercedes.get(i).getY()) {
					if(mercedes.size() > civic.size()) {

					}
					else {
						civic.remove(civic.get(j));
					}
				}
			}
		}

		/// Colisão entre caminhão e ninja
		for(int i = 0; i < mercedes.size(); i++) {
			for (int j = 0; j < ninja.size(); j++) {
				if(ninja.get(j).getX() == mercedes.get(i).getX() && ninja.get(j).getY() == mercedes.get(i).getY()) {
					if(mercedes.size() > ninja.size()) {

					}
					else {
						ninja.remove(ninja.get(j));
					}
				}
			}
		}

		/// Colisão entre ninja e quatroRodas
		for(int i = 0; i < civic.size(); i++) {
			for (int j = 0; j < ninja.size(); j++) {
				if(ninja.get(j).getX() == civic.get(i).getX() && ninja.get(j).getY() == civic.get(i).getY()) {
					if(civic.size()>ninja.size()) {

					}
					else {
						ninja.remove(ninja.get(i));
					}

				}
			}
		}


                //Colisão entre Bicitreta e DuasRodas
                for(int i = 0; i < ninja.size(); i++) {
			for (int j = 0; j < bicicleta.size(); j++) {
				if(bicicleta.get(j).getX() == ninja.get(i).getX() && bicicleta.get(j).getY() == ninja.get(i).getY()) {
					if(ninja.size()>bicicleta.size()) {

					}
					else {
						bicicleta.remove(bicicleta.get(i));
					}

				}
			}
		}
                //Colisão entre Bicitreta e Carro
                for(int i = 0; i < civic.size(); i++) {
			for (int j = 0; j < bicicleta.size(); j++) {
				if(bicicleta.get(j).getX() == civic.get(i).getX() && bicicleta.get(j).getY() == civic.get(i).getY()) {
					if(civic.size()>bicicleta.size()) {

					}
					else {
						bicicleta.remove(bicicleta.get(i));
					}

				}
			}
		}
                //Colisão entre Bicitreta e MuitasRodas
                for(int i = 0; i < mercedes.size(); i++) {
			for (int j = 0; j < bicicleta.size(); j++) {
				if(bicicleta.get(j).getX() == mercedes.get(i).getX() && bicicleta.get(j).getY() == mercedes.get(i).getY()) {
					if(mercedes.size()>bicicleta.size()) {

					}
					else {
						bicicleta.remove(bicicleta.get(i));
					}

				}
			}
		}
	}

	/**
	 * Objeto que gera um veículo na fábricas
	 */
	public void geraVeiculo() {
		for(int a = 0; a < civic.size(); a++) {
			int cordX = civic.get(a).getX();
			int cordY = civic.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == cordX && j == cordY) {
							if(mapa[i][j] == 2 && civic.get(a).geradores() == false) {
								civic.get(a).setFabrica(true);///O veículo não gera mais um outro veículo se ele ja foi gerado antes
								civic.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
								}
							}
						}
					}
				}

		for(int a = 0; a < mercedes.size(); a++) {
			int cordX = mercedes.get(a).getX();
			int cordY = mercedes.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == cordX && j == cordY) {
							if(mapa[i][j] == 2 && mercedes.get(a).geradores() == false) {
								mercedes.get(a).setFabrica(true);
								mercedes.add(new MuitasRodas((v.setX()+1), (v.setY()+1), 1, "verde", false));
								}
							}
						}
					}
				}


		for(int a = 0; a < ninja.size(); a++) {
			int cordX = ninja.get(a).getX();
			int cordY = ninja.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == cordX && j == cordY) {
							if(mapa[i][j] == 2 && ninja.get(a).geradores() == false) {
								ninja.get(a).setFabrica(true);
								ninja.add(new DuasRodas((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
							}
						}
					}
				}
		}
                for(int a = 0; a < bicicleta.size(); a++) {
			int cordX = bicicleta.get(a).getX();
			int cordY = bicicleta.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == cordX && j == cordY) {
							if(mapa[i][j] == 2 && bicicleta.get(a).geradores() == false) {
								bicicleta.get(a).setFabrica(true);
								bicicleta.add(new Bicitreta((v.setX()+1), (v.setY()+1), 3, "Verde", false));
							}
						}
					}
				}
		}
	}


    }
