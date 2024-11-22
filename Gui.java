import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("enter you name");
        JOptionPane.showMessageDialog(null,"Hello"+name);
        int age =  Integer.parseInt(JOptionPane.showInputDialog("enter you age "));
        JOptionPane.showMessageDialog(null,"you are"+age+"years old");
       
    }
}
