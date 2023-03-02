package Lectures;



import javax.swing.JOptionPane;

public class menu {
    public static void lectures(){

        int lec = Integer.parseInt(JOptionPane.showInputDialog("Оберіть завдання до лекцій\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                + "Завдання 4 = 4\n"
                + "Завдання 5 = 5\n"
                +"\n\n"

                + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                + "Вихід = 0"));


        switch (lec) {
            case 0:
                JOptionPane.showMessageDialog(null, "\uD83D\uDEAB Програму завершено \uD83D\uDEAB");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lec + "-ї лаби ↻");
                lec_4.code();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lec + "-ї лаби ↻");
                lec_5.code();
                break;


            default:
                JOptionPane.showMessageDialog(null, "⚠️ Ви ввели недопустиме значення ⚠️");
                break;

        }

    }
}
