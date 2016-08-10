/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thelaw1021
 */
import processing.core.*;

public class Hw10Main extends PApplet{
    public float x, y, z;
    public float w, h, d;
    
    public Cube c = new Cube(this);
    
    public void setup(){
      background(255, 255, 255);
      noFill();
      c.setDimensions(100, 100, 100);
      c.setFill(false);
    }
    
    public void settings(){
      size(800, 800, P3D);  
    }
    
    public void draw(){
      beginCamera();
      camera();      
      rotate(-PI/6);
      pushMatrix();
      translate(400, 400, 0);
      rotate(PI/6);
      noFill();
      box(100, 100, 100);
      popMatrix();
      endCamera();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PApplet.main( new String [] {"Hw10Main"});
    }
    
}
