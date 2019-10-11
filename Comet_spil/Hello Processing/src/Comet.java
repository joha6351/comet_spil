import processing.core.PApplet;

public class Comet {
		int c;
		float xpos;
		float ypos;
		float speed;
		boolean mouse;
		PApplet parent;

		  Comet(PApplet p) {
			parent = p;
		    c = parent.color(95,89,89);
		    xpos = parent.random(parent.width);
		    ypos = 0;
		    speed = ypos+parent.random(1,3);
		    mouse = false;
		  }

		  void display() {
		    parent.rectMode(parent.CENTER);
		    parent.fill(c);
		    parent.rect(xpos,ypos,12,12);
		  }
		  
		  void fall() {
		    ypos = ypos+speed;
		    if (ypos > parent.height) {
		      ypos = 0;
		      xpos = parent.random(parent.width);
		      speed = ypos+parent.random(1,3);
		    }
		  }
		  
		  void collision(int mx, int my) {
		    if (mx > xpos-6 && mx < xpos+6 && my > ypos-6 && my < ypos+6) {
		      mouse = true;
		    } else {
		      mouse = false;
		    }
		    if (mouse) {
		      PApplet.println("Game Over");
		      int score;
		      score = parent.millis();
		      PApplet.print("Score:", score);
		      parent.exit();
		    }
		  }
		}
