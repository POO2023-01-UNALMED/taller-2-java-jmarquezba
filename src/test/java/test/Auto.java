package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantAsientos=0;
		for (int i=0; i<asientos.length; i++) {
			if(asientos[i] instanceof Asiento) {
				cantAsientos++;
			}
		}
		return cantAsientos;
	}
		
	public String verificarIntegridad() {
		if(motor.registro != registro) {
			return "Las piezas no son originales";
		}
		for(int i=0; i<asientos.length; i++) {
			if(asientos[i]!= null) {
				if(asientos[i].registro!= registro) {
					return "Las piezas no son originales";
				}
			}
		}
		return "Auto original";
	}
}
