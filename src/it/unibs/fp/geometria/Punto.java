package it.unibs.fp.geometria;

public class Punto {
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    
    public double distanza( Punto p ){
        
        double distanza = 0;
        
        distanza = Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2);
        distanza = Math.sqrt(distanza);
        
        return distanza;
    }

    @Override
    public String toString() {
        
        return "(" + this.x + ", " + this.y + ")";
    }
    
    
    
}