//Jorge Huete
//Practica 2

public class AppDibujo02 {

	public static void main(String[] args) {

		Cuadrado cuadrados[] = new Cuadrado[3];

		cuadrados[0] = new Cuadrado(1,1,150);
		cuadrados[1] = new Cuadrado(200,220,0); //No es elegante
		cuadrados[2] = new Cuadrado(300,400,0); //pero hace lo que se pide

		Dibujo dibujo = new Dibujo();

		Util util = new Util();

		dibujo.pintar(cuadrados);

		util.wait(1);

		cuadrados[1] = new Cuadrado(200,220,150);
		dibujo.pintar(cuadrados);

		util.wait(1);

		cuadrados[2] = new Cuadrado(300,400,150);
		dibujo.pintar(cuadrados);

	}

}
