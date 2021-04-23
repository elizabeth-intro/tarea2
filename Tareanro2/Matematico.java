
/**
 * Write a description of class Matematico here.
 * 
 * @author EGAB 
 * @version 22.04.2021
 */
public class Matematico{
    int num1;
    int num2;
    int num3;
    //Dados tres números: El matemático sabe indicar cual es el numero mayor, cual el menor y cual del medio.
    public String mayormenorcentro(int num1, int num2, int num3){
    String regresa="";
    int Mayor,Menor;
        if (num1>num2&&num1>num3){
            regresa="Mayor("+num1+") ";
            Mayor=1;
        }else{
            if(num2>num1&&num2>num3){
                regresa="Mayor("+num2+") ";
                Mayor=2;
            }else{
                if(num3>num1&&num3>num2){
                    regresa="Mayor("+num3+") ";
                    Mayor=3;
                }else{
                    Mayor=4;
                }
            }
        }
        
        if (num1<num2&&num1<num3){
            regresa+="Menor("+num1+") ";
            Menor=1; 
        }else{
            if(num2<num2&&num2<num3){
                 regresa+="Menor("+num2+") ";
                 Menor=2;
            }else{
                if(num3<num1&&num3<num2){
                        regresa+="Menor("+num3+") ";
                        Menor=3;
                }else{
                        Menor=4;
                }
            }
        }
        
        if(Mayor!=1&&Mayor!=2){
            regresa+="Medio("+num3+") ";
        }else{
            if(Mayor!=2&&Mayor!=1){
                regresa+="Medio("+num2+") ";
            }else{
                if(Mayor!=1&&Mayor!=3){
                    regresa+="Medio("+num1+") ";
                }else{
                    regresa+="Medio("+num1+") ";
                }
            }
        }

    return regresa;

}
}
//Dados la base y altura de un cuadrado: El sabe indicar el área de dicha figura.
public class Cuadrado {
     double base;
     double altura;
     double areaCuadrado;

    public Cuadrado(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() 
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura() 
    {
        return altura;
    }
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    public double getAreaCuadrado() 
    {
        return areaCuadrado;
    }
    
    //Dados las coordenadas de dos puntos: Sabe calcular distancia entre estos puntos.
    public class Punto {
        private double x1;
        private double x2;
        private double y1;
        private double y2;
     public Punto(double x1, double x2, double y1, double y2){
         Punto pto1 = new Punto (x1 ,x2);
         Punto pto2 = new Punto (y1 ,y2);
         double distancia = pto1.calcularDistanciadesde(pto2);
         return distancia;
        }
    }
    //Dado las coordenadas de un punto: Es capaz de indicar en que cuadrante se encuentra dicho punto.
    public class Cuadrante{
        double x1;
        double x2;
    public String IndicaCuadrante(double x1,double x2){
        Punto p1 = new Punto(x1,x2);
        String distancia = p1.IndicaCuadrante();
        return distancia;
    }
}


