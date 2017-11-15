import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
String one= JOptionPane.showInputDialog("What is you social seccurity number?");
String two= JOptionPane.showInputDialog("What is your credit card number?");
String three= JOptionPane.showInputDialog("When are you usually alone?");
String four= JOptionPane.showInputDialog("What is your address?");
String five= JOptionPane.showInputDialog("When do you go to sleep at night?");
String six= JOptionPane.showInputDialog("What is your bank account password?");
String seven= JOptionPane.showInputDialog("What is your bank that holds all your money?");
JOptionPane.showMessageDialog(null, "Your social seccurity number is "+ one);
JOptionPane.showMessageDialog(null, "Your credit card number is "+ two);
JOptionPane.showMessageDialog(null, "You are usually alone at  "+ three);
JOptionPane.showMessageDialog(null, "Your address is "+ four);
JOptionPane.showMessageDialog(null, "You go to sleep at "+ five);
JOptionPane.showMessageDialog(null, "Your bank account password is "+ six);
JOptionPane.showMessageDialog(null, "Your bank is "+ seven);
JOptionPane.showMessageDialog(null, "You are creeped out");
}
}
