import java.awt.*;
import javax.swing.JFrame;

public class Lienzo extends Canvas
{
	private Cuadrado cuadrados[];

	public void pintar(Cuadrado[] cuadrados)
	{
		this.cuadrados = new Cuadrado[cuadrados.length];
		this.cuadrados = cuadrados;
	}

	public void paint(Graphics g)
	{
		
			g.setColor(Color.RED);
			for(int i=0; i<cuadrados.length; i++){
				if(cuadrados[i]!=null){
					g.drawRect(cuadrados[i].getX(), cuadrados[i].getY(), cuadrados[i].getLado(), cuadrados[i].getLado());
				}
			}
			
		
	}
}
