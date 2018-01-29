//Jorge Huete
//Practica 1


public class Cuadrado {

	int x = 0, y = 0;
	int lado = 0;
	
	Cuadrado(int x, int y, int lado){
		
		this.x = x;
		this.y = y;
		this.lado = lado;
		
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getLado() {
		return lado;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void setLado(int lado) {
		this.lado=lado;
	}
	
}
