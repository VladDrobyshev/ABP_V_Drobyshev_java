public class Vp {
    public static void main(String[] args){
        double x=10;
        double y;
        y=(3*Math.pow(Math.sin(x),5)-Math.PI*Math.exp(x))/(2+Math.sqrt(Math.abs(x)+1));
        System.out.println("y = "+y+"x = "+x);

    }


}
