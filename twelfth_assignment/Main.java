import javax.swing.*;

class Main {
  public static void main(String args[]) {
    JFrame myframe = new JFrame("Hello App");
    JLabel lblMessage = new JLabel("Jill Hill");
    JButton btnSubmit = new JButton("Submit");
    btnSubmit.setBounds(90, 170, 92, 30);

    JButton btnReset = new JButton("Reset");
    btnReset.setBounds(240, 170, 92, 30);

    lblMessage.setBounds(168, 92, 63, 12);
    myframe.add(lblMessage);
    myframe.add(btnSubmit);
    myframe.add(btnReset);
    myframe.setSize(400, 400);
    myframe.setLayout(null);
    myframe.setVisible(true);
  }
}