
package trabalho;

/**
 *
 * @author Rafael Felipe Cardoso Lino
 */


public class Bicitreta extends Veiculo {

    Veiculo bicicleta = new Veiculo();

    /**
	 * Construtor da classe Bicitreta
	 *
	 * @see Veiculo
   * @param cordY
   * @param maternidade
	 * @param speed
	 * @param color
	 * @param cordX

	 */
    public Bicitreta (int cordX, int cordY, double speed, String color, boolean maternidade) {
		super(cordX, cordY, speed, color, maternidade);
    }

}
