/**
 * DuasRodas
 * Classe que gera um veículo do tipo MuitasRodas
 *
 * @author Rafael Felipe Cardoso Lino
 *
 * @see Veiculo
 */
package trabalho;


public class MuitasRodas extends Veiculo {

    Veiculo v = new Veiculo();
    /**
	 * Construtor da classe Muitas Rodas
	 *
	 * @see Veiculo
	 * @param cordX
	 * @param cordY
	 * @param speed
	 * @param color
	 * @param maternidade
	 */

    public MuitasRodas (int cordX, int cordY, int speed, String color, boolean maternidade) {
		super(cordX, cordY, speed, color, maternidade);
	}

}
