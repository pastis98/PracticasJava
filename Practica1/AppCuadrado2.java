//Jorge Huete
//Practica 1

package prac1;

public class AppCuadrado2 {

	public static void main(String[] args) {

		Cuadrado cuadrado = new Cuadrado(1,1,150);
		Util u1 = new Util();
		Dibujo dibujo = new Dibujo();

		dibujo.pintar(cuadrado);

		u1.wait(1);

		cuadrado.setX(150);
		cuadrado.setY(200);
		dibujo.pintar(cuadrado);

		u1.wait(1);

		cuadrado.setX(300);
		cuadrado.setY(150);
		dibujo.pintar(cuadrado);

		u1.wait(1);

		cuadrado.setLado(50);
		dibujo.pintar(cuadrado);


	}

}
