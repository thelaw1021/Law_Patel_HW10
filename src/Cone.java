/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jared
 */
public class Cone {
    private float x0, y0, z0; //center of the cone
    private float rx, ry, rz;  //rotation for each axis
    private float radius, height; //radius and height of the cone
    private float red, green, blue; //fill colors for the cone
    private boolean fill, bottom;
    
    public Cone(){
        this(0, 0, 0, true, 0, 0, 0, 0, 0, 0, false);
    }
    
    public Cone(float x, float y, float z){
        this(x, y, z, true, 0, 0, 0, 0, 0, 0, false);
    }
    
    public Cone (float x, float y, float z, boolean bottom){
        this(x, y, z, bottom, 0, 0, 0, 0, 0, 0, false);
    }
    
    public Cone (float x, float y, float z, boolean bottom, float rx, float ry, float rz){
        this(x, y, z, bottom, rx, ry, rz, 0, 0, 0, false);
    }
    
    public Cone(float x, float y, float z, boolean bottom, float red, float green, float blue, boolean fill){
        this(x, y, z, bottom, 0, 0, 0, red, green, blue, fill);
    }
    
    public Cone(float x, float y, float z, boolean bottom, float rx, float ry, float rz, float red, float green, float blue, boolean fill){
        this.x0 = x;
        this.y0 = y;
        this.z0 = z;
        this.bottom = bottom;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.fill = fill;
    }
    
    public void create(){
        //create each side
        
        //create base (if bottom == true)
    }
    
    public void setCoordinates(float x, float y, float z){
        this.x0 = x;
        this.y0 = y;
        this.z0 = z;
    }
    
    public void fill(float red, float green, float blue){
        this.fill = true;
        this.red = red;
        this.green = green;
        this.blue = blue;
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
     * @return the z0
     */
    public float getZ0() {
        return z0;
    }

    /**
     * @param z0 the z0 to set
     */
    public void setZ0(float z0) {
        this.z0 = z0;
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
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
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
     * @return the fill
     */
    public boolean isFill() {
        return fill;
    }

    /**
     * @param fill the fill to set
     */
    public void setFill(boolean fill) {
        this.fill = fill;
    }

    /**
     * @return the bottom
     */
    public boolean hasBottom() {
        return bottom;
    }

    /**
     * @param bottom the bottom to set
     */
    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }
}
