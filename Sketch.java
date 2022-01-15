import processing.core.PApplet;

public class Sketch extends PApplet {
	float scale = random(0,200);
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.  test
   */
  public void setup() {
	// grass/sky   
    background(0,255,128);
    noStroke();
    fill(135,206,235);
    rect(0,0,600,300);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes   #
   */
  public void draw() {
    float sunX = 0;
    float sunY = 0;
    float houseX = 175;
    float houseY = 150;
    float roofX = 175;
    float roofY = 150;
    float roofX2 = 375;
    float roofY2 = 150;
    float roofX3 = 275;
    float roofY3 = 75;
    float doorX = 208;
    float doorY = 221;
	 // sun drawing 
	 stroke(150);
	 fill(253,184,19);
	 ellipse(sunX,sunY,180,180);
	 // house
	 fill(155,99,76);
	 rect(houseX,houseY,200,200);
	 // roof
	 noStroke();
	 fill(242,223,180);
	 triangle(roofX,roofY,roofX2,roofY2,roofX3 + scale/3 ,roofY3 - scale/4);
	 // door
	 noStroke();
	 fill(0,0,0);
	 rect(houseX + doorX,houseY + doorY,scale/4,scale/2);
	  
  }
}
