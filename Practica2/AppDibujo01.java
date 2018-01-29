//Jorge Huete
//Practica 1

public class AppDibujo01 {

	public static void main(String[] args) {

		Cuadrado cuadrados[] = new Cuadrado[3];

		cuadrados[0] = new Cuadrado(1,1,150);
		cuadrados[1] = new Cuadrado(200,220,150);
		cuadrados[2] = new Cuadrado(300,400,150);

		Dibujo dibujo = new Dibujo();

		dibujo.pintar(cuadrados);

	}

}
