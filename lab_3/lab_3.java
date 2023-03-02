package lab_3;
import javax.swing.JOptionPane;
public class lab_3 {

    public static void lab_3() {
        onTracks trac1 = new onTracks("Holt", 50, 5000, 10);
        onWheels trac2 = new onWheels("Kubota", 80, 6, 100);

        JOptionPane.showMessageDialog(null, trac1.getName() +" " +trac2.getName());
        JOptionPane.showMessageDialog(null, trac1.getSpeed() +" "+ trac2.getSpeed());
        JOptionPane.showMessageDialog(null, trac1.get_max_Passengers() +" "+trac2.get_max_Passengers());

        JOptionPane.showMessageDialog(null, trac1.getMass() +"\n"+ trac1.getLength() +"\n"+trac1.getDiameter());
        JOptionPane.showMessageDialog(null, trac2.getWheels() +"\n"+ trac2.getDiameter() +"\n"+trac2.getLength());

        trac1.outAll();
        trac2.outAll();





        }

}



