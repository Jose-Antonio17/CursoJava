import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Naves.Guerrero;
import Naves.NaveDestructora;
import Naves.VehiculoGuerra;

public class Nave extends VehiculoGuerra{
	
	private static final Logger logger = LoggerFactory.getLogger(NaveDestructora.class);

	public Nave(String nombre, String tipo, int ataque, int defensa) {
		super(nombre, tipo, ataque, defensa);
	}

	@Override
	public int atacar() {
		double fuerzas = 0;
		for (Guerrero guerrero : getGuerreros()) {// como es una clase hija de Vehiculo de Guerra le podemos llamar al
													// método drectamente
			fuerzas += guerrero.getFuerza();
		}
		double total = getAtaque() * Math.random() + fuerzas * Math.random() / 2;
		int totalfinal = (int) total;
		logger.info(" "+getNombre() + " ataca con " + totalfinal + " puntos");
		return totalfinal;
	}

	@Override
	public void defender(int ataque) {
		double defensas = 0;
		for (Guerrero guerrero : getGuerreros()) {
			defensas += guerrero.getResistencia();
		}
		double totaldefensa = getDefensa() * Math.random() + getDefensa() * Math.random() / 2;
		int totaldeffinal = (int) totaldefensa;
		logger.info(" "+getNombre() + " se defiende con " + totaldeffinal + " puntos");
		logger.info("\nRESULTADO:");
		if (ataque > totaldeffinal) {
			int diferencia = ataque - totaldeffinal;
			logger.info(getNombre() + " pierde " + diferencia + " puntos de vida");
			int vidaactualizada = getPuntosvida() - diferencia;
			setPuntosvida(vidaactualizada);
		} else {
			logger.info(" "+getNombre() + " no pierde puntos de vida");
		}

		
	}


	
	
	
}
