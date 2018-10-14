/**
 * Veículo
 * Classe que gera um veículo que sera usado por quatroRodas,ninja e mercedes
 *
 * @author Rafael Felipe Cardoso Lino
 *
 * @see Veiculo
 */

package trabalho;

import java.util.Random;

public class Veiculo {


        private int cordX; /// Coordenada X do veículo
	private int cordY; /// Coordenada Y do veículo
	private double speed; /// Velocidade do veículo
	private boolean maternidade; /// Está ou não em uma fabrica
	private String color; ///Cor dos veículo

    	Random r = new Random();/// Função random, gera posições aleatórias

        /**
	 * Construtor de Veículo
	 * Inicia veículo
	 */

    public Veiculo() {
        cordX = 0;
        cordY = 0;
        speed = 0;
        maternidade = false;
        color = null;
	}

    	/**
	 * Construtor da classe Veículo
	 * Cria veículos que são recebidas na chamada das funções
	 *
	 * @param cordX
	 * @param cordY
	 * @param speed
	 * @param color
	 * @param maternidade
	 */

    public Veiculo(int cordX, int cordY, double speed, String color, boolean maternidade) {


		this.cordX = cordX;
		this.cordY = cordY;
		this.speed = speed;
		this.color = color;
		this.maternidade = maternidade;

	}

    /**
	 * Cria um valor para o X do veículo
	 *
	 * @return O valor gerado para X
	 */
    public int setX() {
        cordX =  r.nextInt(28);
        return cordX;
    }
    /**
	 * Cria um valor para o Y do veículo
	 *
	 * @return O valor gerado para Y
	 */

    public int setY() {

	cordY = r.nextInt(58);

	return cordY;
    }
    /**
	 * @return O valor de X do veículo
	 */
    public int getX() {
        return cordX;
    }

    /**
	 * @return O valor de Y do veículo
	 */

    public int getY() {
        return cordY;
    }
    /**
	 * Altera o valor de X com base no que será passado dentro de cada objeto
	 *
	 * @param cordX
	 */

    public void MoveX(int cordX) {
        this.cordX = cordX;
    }
    /**
	 * Altera o valor de Y com base no que será passado dentro de cada objeto
	 *
	 * @param cordY
	 */

    public void MoveY(int cordY) {

	this.cordY = cordY;

    }


    /**
	 * @return Se um veículo está ou não em uma maternidade
	 */

    public boolean geradores() {
        return maternidade;
    }
    /**
	 * Define se um veiculo está ou não dentro de uma maternidade, com base no que é recebido em status
	 *
	 * @param ´maternidade
	 */
    
    /**
	 * @return A color do veículo
	 */

        public String getCor() {
        return color;
    }
    public void setFabrica(boolean maternidade) {
        this.maternidade = maternidade;
    }

    Random civic = new Random();

    /**
	 * @return A speed do veículo
	 */

    public double getVelocidade() {
        return speed;
    }
        /**
	 * Random utilizado para gerar movimentos aleatórios
	 */


        /**
	 * Função que movimenta o quatroRodas, recebendo um objeto da classe quatroRodas como parâmetro
	 * @param ca
	 */

    public void moveCarro(Carro ca){
        int mov;///"mov" recebe o número aleatório

        	mov = civic.nextInt(4); ///< Gerando um número aleatório para movimentação do veículo em 4 direções possíveis(cima,baixo,esquerda,direta)

		/**
		 * Ifs para verificar o resultado obtido no random e
                 * poder decidir em qual direção o quatroRodas irá se movimentar
		 */

		if(mov == 0) {
			int cordX1 = ca.getX(); ///< Obtendo o valor atual de X
			cordX1 = cordX1 + 2;///< Somando 2 (speed do quatroRodas) no valor atual de X
			ca.MoveX(verificaX(cordX1));///< Chamando a função moveX da classe Veículo para realizar a movimentação
		}
                /**
		 * O if a cima se repete no restante da função, só muda a direção
		 */

		if(mov == 1) {
			int cordX2 = ca.getX();
			cordX2 = cordX2 - 2;
			ca.MoveX(verificaX(cordX2));
		}
                   if(mov == 3) {
			int cordY2 = ca.getY();
			cordY2 = cordY2 - 2;
			ca.MoveY(verificaY(cordY2));
		}
		if(mov == 2) {
			int cordY1 = ca.getY();
			cordY1 = cordY1 + 2;
			ca.MoveY(verificaY(cordY1));
		}

		


    }



    /**
	 * Função que movimenta o caminhão, recebendo um objeto da classe caminhão como parâmetro
	 * @param ca
	 */
            /**
	 * Random utilizado para gerar movimentos aleatórios
	 */
    Random truck = new Random();

     public void moveCaminhao(MuitasRodas ca){

        int mov; ///"mov" recebe o número aleatório

        	mov = truck.nextInt(4); ///< Gerando um número aleatório para movimentação do veículo em 4 direções possíveis(cima,baixo,esquerda,direta)

                /**
		 * Verificando o result obtido no randon
                 * poder decidir em qual direção o quatroRodas irá se movimentar
		 */

		if(mov == 0) {
			int cordX1 = ca.getX(); ///< Obtendo o valor atual de X
			cordX1 = cordX1 + 1; ///< Somando 1 (speed do caminhão) no valor atual de X
			ca.MoveX(verificaX(cordX1)); ///< Chamando o objeto moveX da class Veículo para se movimentar
		}

                /**
		 * O if a cima se repete, só muda a direção
		 */
                if(mov == 2) {
			int cordY1 = ca.getY();
			cordY1 = cordY1 + 1;
			ca.MoveY(verificaY(cordY1));
		}

		if(mov == 3) {
			int cordY2 = ca.getY();
			cordY2 = cordY2 - 1;
			ca.MoveY(verificaY(cordY2));
		}
		if(mov == 1) {
			int cordX2 = ca.getX();
			cordX2 = cordX2 - 1;
			ca.MoveX(verificaX(cordX2));
		}

		

    }
        /**
	 * Random para gerar movimentos aleatórios
	 */
     Random moty = new Random();

     /**
	 * Função que movimenta a ninja, recebendo um objeto da classe ninja
	 * @param city
	 */

      public void moveMoto(DuasRodas city){

          int mov; ///"mov" recebe o número aleatório

        	mov = moty.nextInt(4); ///< Gerando um número aleatório para o veículo ir em alguma das 4 direções possívei


		if(mov == 0) {
			int cordX1 = city.getX(); ///< Obtendo o valor de X
			cordX1 = cordX1 + 3; ///< Somando 3 (speed da ninja) no valor atual de X
			city.MoveX(verificaX(cordX1)); ///< Chamando o objeto moveX da classe Veículo para a movimentação
		}

                /**
		 * O if a cima se repete só muda a direção
		 */

		if(mov == 1) {
			int cordX2 = city.getX();
			cordX2 = cordX2 - 3;
			city.MoveX(verificaX(cordX2));
		}

		if(mov == 2) {
			int cordY1 = city.getY();
			cordY1 = cordY1 + 3;
			city.MoveY(verificaY(cordY1));
		}

		if(mov == 3) {
			int cordY2 = city.getY();
			cordY2 = cordY2 - 3;
			city.MoveY(verificaY(cordY2));
		}


    }
      Random bmx = new Random();

     /**
	 * Função que movimenta a ninja, recebendo um objeto da classe ninja
	 * @param city
	 */
      public void moveBike(Bicitreta b){

          int mov;///"mov" recebe o número aleatório

        	mov = bmx.nextInt(4); ///< Gerando um número aleatório para movimentação do veículo em 4 direções possíveis


		if(mov == 0) {
			int cordX1 = b.getX(); ///< Obtendo o valor atual de X
			cordX1 = cordX1 + (1/2); ///< Somando 1 (speed da ninja) no valor atual de X
			b.MoveX(verificaX(cordX1)); ///< Chamando a função moveX da classe Veículo para a movimentação
		}

                /**
		 * O if a cima se repete só muda a direção
		 */

		if(mov == 1) {
			int cordX2 = b.getX();
			cordX2 = cordX2 - 1;
			b.MoveX(verificaX(cordX2));
		}

		if(mov == 2) {
			int cordY1 = b.getY();
			cordY1 = cordY1 + (1/2);
			b.MoveY(verificaY(cordY1));
		}

		if(mov == 3) {
			int cordY2 = b.getY();
			cordY2 = cordY2 - 1;
			b.MoveY(verificaY(cordY2));
		}


    }
      /**
	 * Função que verifica se chegou ao limite do mapa em X
	 * @param cordX
	 * @return
	 */
      public int verificaX(int cordX) {
		if (cordX >= 29) {
			cordX = 1;
		}
		if(cordX <= 0) {
			cordX = 28;
		}
		return cordX;
	}

      /**
	 * Função que verifica se chegou ao limite do mapa em Y
	 * @param cordY
	 * @return
	 */


	public int verificaY(int cordY) {
		if (cordY >= 59) {
			cordY = 1;
		}
		if(cordY <= 0) {
			cordY = 58;
		}
		return cordY;
	}







}
