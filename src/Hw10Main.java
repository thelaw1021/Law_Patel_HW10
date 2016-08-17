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
    public float degrees;
    
    public Cube c = new Cube(this);
    public Pyramid pyramid = new Pyramid(this);
    
    public void setup(){
      background(255, 255, 255);
      noFill();
      pyramid.setDimensions(100, 100, 100);
      pyramid.setCoordinates(width/2, height/2+50, 0);
      pyramid.setFill(150, 150, 150);
      c.setDimensions(100, 100, 100);
      c.noFill();
      degrees = 0;
    }
    
    public void settings(){
      size(800, 800, P3D);  
    }
    
    public void draw(){
      background(255, 255, 255);
      beginCamera();
      camera(width/2, height/2, (float)(height/2.0) / tan(PI*30 / 180), width/2, height/2, 0, 0, 1, 0); 
      //rotateX(radians(degrees));
      //c.create();
//      pushMatrix();
//      translate((float) (width*.25), height/4, -100);
//      sphere(100);
//      popMatrix();
      //c.setFill(true);
      c.create(100, 100, -400);
      c.create(-100, -100, -400, radians(degrees), radians(degrees), radians(degrees));
      pyramid.create();
      //pyramid.rotateX(radians(degrees));
      pyramid.rotateY(radians(degrees));
      //pyramid.rotateZ(radians(degrees));
      endCamera();
      //c.setFill(false);
      degrees += 1;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PApplet.main( new String [] {"Hw10Main"});
    }
    
}
