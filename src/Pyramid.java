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
    
    private float x0, y0, z0; // center of base of pyramid
    private float x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4, x5, y5, z5; //base of pyramid
    private float length, width, height; //dimensions of the pyramid
    private float red, green, blue;
    private float rx, ry, rz;
    private boolean fill;
    private PApplet p;
    
    public Pyramid(PApplet p){
        this(p, 0, 0, 0, 10, 10, 10, false, 0, 0, 0, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float length, float width, float height){
        this(p, 0, 0, 0, length, width, height, false, 0, 0, 0, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float x0, float y0, float z0, float length, float width, float height){
        this(p, x0, y0, z0, length, width, height, false, 0, 0, 0, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float x0, float y0, float z0, float length, float width, float height, boolean fill, float red, float green, float blue){
        this(p, x0, y0, z0, length, width, height, fill, red, green, blue, 0, 0, 0);
    }
    
    public Pyramid(PApplet p, float x0, float y0, float z0, float length, float width, float height, float rx, float ry, float rz){
        this(p, x0, y0, z0, length, width, height, false, 0, 0, 0, rx, ry, rz);
    }
    
    public Pyramid(PApplet p, float x0, float y0, float z0, float length, float width, float height, boolean fill, float red, float green, float blue, float rx, float ry, float rz){
        this.p = p;
        this.x0 = x0;
        this.y0 = y0;
        this.z0 = z0;
        this.length = length;
        this.width = width;
        this.height = height;
        this.fill = fill;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
    }

    public void setCoordinates(float x0, float y0, float z0){
        this.x0 = x0;
        this.y0 = y0;
        this.z0 = z0;
    }
    
    public void setDimensions(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public void create(){
        if (x0 == 0 && y0 == 0 && z0 == 0){
            
        }
    }
    
    /**
     * @return the x0
     */
    public float getX0() {
        return x0;
    }

    /**
     * @param x0 the x0 to set
     */
    public void setX0(float x0) {
        this.x0 = x0;
    }

    /**
     * @return the x2
     */
    public float getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(float x2) {
        this.x2 = x2;
    }

    /**
     * @return the x3
     */
    public float getX3() {
        return x3;
    }

    /**
     * @param x3 the x3 to set
     */
    public void setX3(float x3) {
        this.x3 = x3;
    }

    /**
     * @return the x4
     */
    public float getX4() {
        return x4;
    }

    /**
     * @param x4 the x4 to set
     */
    public void setX4(float x4) {
        this.x4 = x4;
    }

    /**
     * @return the x5
     */
    public float getX5() {
        return x5;
    }

    /**
     * @param x5 the x5 to set
     */
    public void setX5(float x5) {
        this.x5 = x5;
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

    /**
     * @return the y0
     */
    public float getY0() {
        return y0;
    }

    /**
     * @param y0 the y0 to set
     */
    public void setY0(float y0) {
        this.y0 = y0;
    }

    /**
     * @return the y2
     */
    public float getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(float y2) {
        this.y2 = y2;
    }

    /**
     * @return the y3
     */
    public float getY3() {
        return y3;
    }

    /**
     * @param y3 the y3 to set
     */
    public void setY3(float y3) {
        this.y3 = y3;
    }

    /**
     * @return the y4
     */
    public float getY4() {
        return y4;
    }

    /**
     * @param y4 the y4 to set
     */
    public void setY4(float y4) {
        this.y4 = y4;
    }

    /**
     * @return the y5
     */
    public float getY5() {
        return y5;
    }

    /**
     * @param y5 the y5 to set
     */
    public void setY5(float y5) {
        this.y5 = y5;
    }
    
}
