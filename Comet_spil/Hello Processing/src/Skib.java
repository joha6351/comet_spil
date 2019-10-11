import processing.core.PApplet;

public class Skib {
		  int col;
		  float xpos;
		  float ypos;
		  PApplet parent;

		  Skib(PApplet p) {
			  parent = p;
			  col = parent.color(252,10,10);
			  xpos = parent.mouseX;
			  ypos = parent.mouseY;
		  }

		  void display() {
		    parent.fill(col);
		    parent.triangle(xpos+6,ypos,xpos-6,ypos,xpos,ypos-9);
		  }
		  
		  void follow() {
		    xpos = parent.mouseX;
		    ypos = parent.mouseY;
		  }
		}