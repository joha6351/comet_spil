import processing.core.PApplet;

public class UsingProcessing extends PApplet{
	Comet[] cometer = new Comet[30];
	Skib[] skib = new Skib[1];
	boolean a = false;
	
	public static void main(String[] args) {
		PApplet.main("UsingProcessing");
		}

	public void settings() {
		size(360,240);
	}
	
	public void setup() {
		for (int i = 0; i < cometer.length; i++) {
		    cometer[i] = new Comet(this);
		  }
		  for (int n = 0; n < skib.length; n++) {
		    skib[n] = new Skib(this);
		  }
		  noCursor();
	}
	
	public void mousePressed() {
		  a = true;
	}
	
	public void draw() {
		  
		  background(0,0,0);

		  if (a == true) {
		  for (int i = 0; i < cometer.length; i++) {
		  cometer[i].fall();
		  cometer[i].display();
		  cometer[i].collision(mouseX,mouseY);  
		  }
		  for (int n = 0; n < skib.length; n++) {
		    skib[n].display();
		    skib[n].follow();
		  }
		  }
		}	
}
