package lab_2;
import javax.swing.JOptionPane;


public class lab_2 {
    public static void lab_2() {
        JOptionPane.showMessageDialog(null, "Введіть a,b,c\n(значення квадратного рівняння)");
        double a = Double.parseDouble(JOptionPane.showInputDialog("Значення a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Значення b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Значення c:"));
        JOptionPane.showMessageDialog(null, "Кількість коренів рівняння = " +num_s(a,b,c));
        double[] solutions = answer(a, b, c);
        if (solutions == null) {
            JOptionPane.showMessageDialog(null, "Нуль коренів: \n" +solutions[0]);
        }
        else if (solutions.length == 1) {
            JOptionPane.showMessageDialog(null, "Один корінь: \n" + solutions[0]);
        }
        else {
            JOptionPane.showMessageDialog(null, "Два корені: \n" + solutions[0] + "\n" + solutions[1]);
        }






    }
    static double num_s(double a, double b, double c){
        double discrim = b * b - 4 * a * c;
        double num = 0;
        if (discrim > 0) {
            num = 2;
        } else if (discrim == 0) {
            num = 1;
        } else {
            num = 0;
        }


        return num;
    }
    public static double[] answer(double a, double b, double c) {
        double discrim = b * b - 4 * a * c;
        double[] solutions;

        if (discrim > 0) {
            solutions = new double[2];
            solutions[0] =(-b + Math.sqrt(discrim))/2*a;
            solutions[1] =(-b - Math.sqrt(discrim))/2*a;
        }
        else if (discrim == 0) {
            solutions = new double[1];
            solutions[0] =(-b)/2*a;
        }
        else {
            solutions = new double[0];
            solutions[0] = 0;
        }

        return solutions;
    }




}
