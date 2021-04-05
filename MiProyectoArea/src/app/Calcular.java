package app;


import java.util.Scanner;

public class Calcular {

    /**
     */
    private static Area o = new Area();
    private static Float base = null;
    private static Float altura = null;  
    
     public Calcular() {
       // super();
    }

    public static void main(String[] args) {
        //Calcular calcular = new Calcular();
        
         
        Scanner t = new Scanner(System.in);
        
        base = t.nextFloat();
        altura = t.nextFloat();
        
        Float r = null;
        
       r = o.areaCalcular(base, altura);
        
        System.out.println("Resultado = " + r);   
 
    }

    public static class Area {
        
        private Float resultado = null;
                
        public Area() {
            //super();
        }
        
       public  Float areaCalcular(Float base, Float altura) {
           
           resultado = base * altura;
           
         return resultado;
        
      }
        
    }
      
}
