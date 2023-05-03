import javax.swing.*;

class Main {
  public static void main(String args[]) {
    JFrame myframe = new JFrame("Hello App");
    JLabel lblMessage = new JLabel("Hunter Wilson");
    lblMessage.setBounds(159, 94, 82, 12);
    myframe.add(lblMessage);
    myframe.setSize(400, 400);
    myframe.setLayout(null);
    myframe.setVisible(true);
  }
}