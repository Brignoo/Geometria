package it.unibs.fp.geometria;

public class Test {
    
    public static void main(String[] args){
        
        int x1 = 1, y1 = 1;
        int x2 = 1, y2 = 1;                 //Due punti coincidenti
        
        int x3 = 1, y3 = 13;
        int x4 = 1, y4 = -11;               //Due punti verticali (stessa x)
        
        int x5 = 3, y5 = 6;
        int x6 = -20, y6 = 6;               //Due punti orizzontali (stessa y)
        
        int x7 = 0, y7 = 0;
        int x8 = 16, y8 = 5;                //Un punto è l'origine
        
        int x9 = 1, y9 = -8;
        int x10 = 13, y10 = 0;              //Due punti generici
        
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Retta r1 = new Retta(p1, p2);       //ERRORE, non essendo inseriti munalmente produce un risultato errato
        
        Punto p3 = new Punto(x3, y3);
        Punto p4 = new Punto(x4, y4);
        Retta r2 = new Retta(p3, p4);       //DEL TIPO x = j
        
        Punto p5 = new Punto(x5, y5);
        Punto p6 = new Punto(x6, y6);
        Retta r3 = new Retta(p5, p6);       //DEL TIPO y = k
        
        Punto p7 = new Punto(x7, y7);
        Punto p8 = new Punto(x8, y8);
        Retta r4 = new Retta(p7, p8);       //PER L'ORIGINE
        
        Punto p9 = new Punto(x9, y9);
        Punto p10 = new Punto(x10, y10);
        Retta r5 = new Retta(p9, p10);      //GENERICA
        
        
        System.out.println( "Dati i punti: " + p3.toString() + " " + p4.toString() );
        System.out.println( "La retta ha equazione: " + r2.toString() + "\n" );
        
        System.out.println( "Dati i punti: " + p5.toString() + " " + p6.toString() );
        System.out.println( "La retta ha equazione: " + r3.toString() + "\n" );
        
        System.out.println( "Dati i punti: " + p7.toString() + " " + p8.toString() );
        System.out.println( "La retta ha equazione: " + r4.toString() + "\n" );
        
        System.out.println( "Dati i punti: " + p9.toString() + " " + p10.toString() );
        System.out.println( "La retta ha equazione: " + r5.toString() + "\n" );
        
    }
    
}
