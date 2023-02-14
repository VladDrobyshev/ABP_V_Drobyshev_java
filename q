import javax.swing.JOptionPane;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //ввід данних
        //int num = Integer.parseInt(JOptionPane.showInputDialog("Введіть число в діапазоні від -999 до 999"));

        System.out.println("Введіть число в діапазоні від -999 до 999");
        int num = scanner.nextInt();
        if(num >= -999 && num <= 999){
            double abs = Math.abs(num);

            String p_m;
            String q = "Hello";
            System.out.print(q);

            if(abs == num){

                p_m = "додатнє";
            }
            if(abs == 0){

                p_m = "";
            }
            else{
                p_m = "від'ємне";

            }


            if(num >= 100){
                q = "трицифрове число";
            }
            else if(num >= 10 && num <= 99){
                q = "двоцифрове число";
            }
            else if(num >= 1 && num <= 10){
                q = "одноцифрове число";
            }
            else if(num == 0){
                q = "нуль";
            }


        }

        else {
            System.out.print("Ви ввели невірне значення");
        }

        System.out.println(q);


        JOptionPane.showMessageDialog(null, "Віповідь:\n");
    }
}
