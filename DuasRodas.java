/**
 * DuasRodas
 * Classe que gera um veículo do tipo DuasRodas
 *
 * @author Rafael Felipe Cardoso Lino
 *
 * @see Veiculo
 */
package trabalho;


public class DuasRodas extends Veiculo {
    Veiculo v = new Veiculo();
    /**
	 * Construtor da classe DuasRodas, que usa um super para chamar o construtor da classe Veículo
	 *
	 * @see Veiculo
	 * @param cordX
	 * @param cordY
	 * @param speed
	 * @param color
	 * @param maternidade
	 */
    public DuasRodas (int cordX, int cordY, int speed, String color, boolean maternidade) {
		super(cordX, cordY, speed, color, maternidade);
	}

}
