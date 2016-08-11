/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import processing.core.*;
/**
 *
 * @author Jared
 */
public class Pyramid {
    
    private float p1; // tip of pyramid
    private float p2, p3, p4, p5; //base of pyramid
    private float red, green, blue;
    private float rx, ry, rz;
    private boolean fill;
    private PApplet p;
    
    public Pyramid(PApplet p){
        this(p, 0, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float p1, float p2, float p3, float p4, float p5){
        this(p, p1, p2, p3, p4, p5, false, 0, 0, 0, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float p1, float p2, float p3, float p4, float p5, boolean fill, float red, float green, float blue){
        this(p, p1, p2, p3, p4, p5, fill, red, green, blue, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float p1, float p2, float p3, float p4, float p5, float rx, float ry, float rz){
        this(p, p1, p2, p3, p4, p5, false, 0, 0, 0, rx, ry, rz);
    }
    
    public Pyramid(PApplet p, float p1, float p2, float p3, float p4, float p5, boolean fill, float red, float green, float blue, float rx, float ry, float rz){
        this.p = p;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.fill = fill;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
    }

    public void setCoordinates(float p1, float p2, float p3, float p4, float p5){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
    }
    
    public void create(){
        
    }
    
    /**
     * @return the p1
     */
    public float getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(float p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public float getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(float p2) {
        this.p2 = p2;
    }

    /**
     * @return the p3
     */
    public float getP3() {
        return p3;
    }

    /**
     * @param p3 the p3 to set
     */
    public void setP3(float p3) {
        this.p3 = p3;
    }

    /**
     * @return the p4
     */
    public float getP4() {
        return p4;
    }

    /**
     * @param p4 the p4 to set
     */
    public void setP4(float p4) {
        this.p4 = p4;
    }

    /**
     * @return the p5
     */
    public float getP5() {
        return p5;
    }

    /**
     * @param p5 the p5 to set
     */
    public void setP5(float p5) {
        this.p5 = p5;
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

    /**
     * @return the rx
     */
    public float getRx() {
        return rx;
    }

    /**
     * @param rx the rx to set
     */
    public void setRx(float rx) {
        this.rx = rx;
    }

    /**
     * @return the ry
     */
    public float getRy() {
        return ry;
    }

    /**
     * @param ry the ry to set
     */
    public void setRy(float ry) {
        this.ry = ry;
    }

    /**
     * @return the rz
     */
    public float getRz() {
        return rz;
    }

    /**
     * @param rz the rz to set
     */
    public void setRz(float rz) {
        this.rz = rz;
    }

    /**
     * @return the fill
     */
    public boolean isFill() {
        return fill;
    }

    /**
     * @param fill the fill to set
     */
    public void setFill(float red, float green, float blue) {
        this.fill = true;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public void noFill(){
        this.fill = false;
    }
    
}
