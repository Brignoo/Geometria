package it.unibs.fp.geometria;

public class Retta {
    
    private double coefficienteAngolare;
    private double q;
    private boolean verticale;
    
    public Retta( Punto p1, Punto p2 ){
        
        if( p1.getX() == p2.getX() ){
            
            this.verticale = true;
            this.coefficienteAngolare = 0;
            this.q = p1.getX();
        }
        else{
            
            verticale = false;
            this.coefficienteAngolare = ( p2.getY()-p1.getY() )/( p2.getX()-p1.getX() );
            this.q = p2.getY() - this.coefficienteAngolare * p2.getX();
        }
        
    }

    public double getCoefficienteAngolare() {
        return coefficienteAngolare;
    }
    public void setCoefficienteAngolare(double coefficienteAngolare) {
        this.coefficienteAngolare = coefficienteAngolare;
    }

    public double getQ() {
        return q;
    }
    public void setQ(double q) {
        this.q = q;
    }

    public boolean isVerticale() {
        return verticale;
    }
    public void setVerticale(boolean verticale) {
        this.verticale = verticale;
    }
    
    @Override
    public String toString(){
        
        if( this.verticale ){
            
            return "x = " + this.q;
        }
        else {
            
            if ( this.q == 0 ){
                
                return "y = " + this.coefficienteAngolare + "x ";
            }
            else if ( this.coefficienteAngolare != 0 ){
                
                return "y = " + this.coefficienteAngolare + "x + " + this.q;
            }
            else{
                
                return "y = " + this.q;
            }
        }
    }
    
    public boolean appartiene(Punto p){
        
        if( this.verticale ){
            
            if( this.q == p.getX() ){
                
                return true;
            }
        }
        else {
            
            double controllo = p.getX() * this.coefficienteAngolare + this.q;

            if ( controllo == p.getY() ){

                return true;
            }
        }
        
        return false;
    }
    
}
