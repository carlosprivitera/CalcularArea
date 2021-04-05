package app;
import java.util.Scanner;

public class CalcularArea {
    /**
     */
    private static int n = 3;
    private static Area[] o = null; //Mi relación
    private static Float base = null;
    private static Float altura = null;  
    private static Float r = null;     
    public CalcularArea() {
       // super();
    }

    public static void main(String[] args) {
        //Calcular calcular = new Calcular();
        o = new Area[n];
        Scanner t = new Scanner(System.in);
        
        for(int i=0; i < n; i ++) {
          o[i] = new Area();
          System.out.println("Entrar la base para el rectangulo " + i);  
          base = t.nextFloat();
          System.out.println("Entrar la altura para el rectangulo " + i);   
          altura = t.nextFloat(); 
          o[i].setAltura(altura);
          o[i].setBase(base);
        }
       
        for(int i=0; i < n; i ++) {
          System.out.println("Rectángulo " + i); 
          r = o[i].areaCalcular();
          if(o[i].esMayor(789.5f)==true) {
            System.out.println("  Área = " + r + " ha superado el valor permitido");    
          }else{
            System.out.println("  Área = " + r);    
          }
        }    
    }
}
