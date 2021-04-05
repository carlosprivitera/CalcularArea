package app;
    public class Area {
        private Float resultado = null;
        private Float base = null;
        private Float altura = null;
                
        public Area() {
            //super();
        }
        
       public  Float areaCalcular(Float base, Float altura) {
         this.base = base;
         this.altura = base;
         resultado = base * altura;
         return resultado;
      }

    public  Float areaCalcular() {
      resultado = base * altura;
      return resultado;
    }

    public Float getResultado() {
        return resultado;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public boolean esMayor(Float x) {
        if(resultado.compareTo(x) > 0) {
            return true;
        }
        return false;
    }
}
