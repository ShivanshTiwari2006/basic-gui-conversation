import javax.swing.JOptionPane;


public class learning {
    public static void main (String[]arg ){

        String name= JOptionPane.showInputDialog("Enter Your Name :");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age :"));
        JOptionPane.showMessageDialog(null, "You Are "+ age+" Years Old");

        Double height= Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height :"));
        JOptionPane.showMessageDialog(null, "You Are "+ height+" cm tall");

        String hobby= JOptionPane.showInputDialog("What is your Hobby :");
        JOptionPane.showMessageDialog(null, "Wow!! You love  "+ hobby+" It is A Great Hobby To Opt...");

    }
}
