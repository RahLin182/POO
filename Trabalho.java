/**
 * @author Rafael Felipe Cardoso Lino RA:221181829
 */

package trabalho;

public abstract class Trabalho {

    public static void main(String[] args) throws InterruptedException{

        	Cidade city = new Cidade();
                //int contaRodadas = 0;

		city.CriaVeiculos();
		city.newCity();

		int i = 0;

		while (i == 0) {
			city.attCity();
			Thread.sleep(400);
		}
    }
}
