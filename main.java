import javax.swing.JOptionPane;

import lab_1.lab_1;
import lab_2.lab_2;//підключення Лабараторних робіт
import develop.develop_1;
import develop.learn;

public class main {




    public static void main(String args[]) {
        //develop_1.code();
        //learn.code();


        JOptionPane.showMessageDialog(null, "Дробишев Владислав\nВаріант-8");
        int lab = Integer.parseInt(JOptionPane.showInputDialog("Оберіть лабараторну роботу\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                + "Lab_1 = 1\n"
                + "Lab_2 = 2\n"
                + "Вихід = 0"));


        switch (lab) {
            case 0:
                JOptionPane.showMessageDialog(null, "\uD83D\uDEAB Програму завершено \uD83D\uDEAB");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lab + "-ї лаби ↻");
                lab_1.lab_1();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lab + "-ї лаби ↻");
                lab_2.lab_2();
                break;

            default:
                JOptionPane.showMessageDialog(null, "⚠️ Ви ввели недопустиме значення ⚠️");
                break;

        }



    }


}
