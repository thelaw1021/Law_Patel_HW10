/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import processing.core.*;
/**
 *
 * @author thelaw1021
 */
public class Cube {
    private float x, y, z;
    private float w, h, d;
    private float rotation;
    private float red, green, blue;
    private PApplet p;
    
    public Cube(PApplet p){
        this(p, 0, 0, 0, 0, 0, 0, 0);
    }
    
    public Cube(PApplet p, float w, float h, float d){
        this(p, w, h, d, 0, 0, 0, 0);
    }
    
    public Cube(PApplet p, float w, float h, float d, float rotation){
        this(p, w, h, d, rotation, 0, 0, 0);
    }
    
    public Cube(PApplet p, float w, float h, float d, float red, float green, float blue){
        this(p, w, h, d, 0, red, green, blue);
    }
    
    public Cube(PApplet p, float w, float h, float d, float rotation, float red, float green, float blue){
        this.p = p;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rotation = rotation;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public void create(){
        x = p.width/2;
        y = p.height/2;
        p.pushMatrix();
        p.translate(x, y, z);
        p.rotateY(rotation);
        p.fill(red, green, blue);
        p.box(w, h, d);
        p.popMatrix();
    }
    
    public void create(float x, float y, float z){
        p.pushMatrix();
        p.translate(x, y, z);
        p.rotateY(rotation);
        p.fill(red, green, blue);
        p.box(w, h, d);
        p.popMatrix();
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the red
     */
    public float getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(float red) {
        this.red = red;
    }

    /**
     * @return the green
     */
    public float getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(float green) {
        this.green = green;
    }

    /**
     * @return the blue
     */
    public float getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(float blue) {
        this.blue = blue;
    }
    
    
}
