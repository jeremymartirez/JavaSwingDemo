import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {

        JFrame frame = new JFrame("My UI Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,2,1,1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Click Me!");


        panelTitle.setBounds(10,10,360,50);
        panelOne.setBounds(10,50,360,70);
        panelTwo.setBounds(10,200,360,50);


        panelTitle.setBackground(Color.cyan);
        panelOne.setBackground(Color.yellow);
        panelTwo.setBackground(Color.blue);

        JLabel labelOne, labelTwo, labelTitle;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(90,20));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(90,20));

        labelTitle = new JLabel("Enter required:", JLabel.CENTER);
        labelOne = new JLabel("First Value");
        labelTwo = new JLabel("Second Value");


        labelTitle.setBounds(10,10,100,30);
        labelOne.setBounds(10,10,100,30);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10,10,100,30);
        tFieldTwo.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(10,10,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button Clicked");
                //System.out.println(tFieldOne.getText());
                //System.out.println(tFieldTwo.getText());
                int result = computeValue(tFieldOne.getText(),tFieldTwo.getText());
                //System.out.println(result);
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        // set size to half of screen
        //frame.setSize(width/2, height/2);

        frame.setSize(500,400);
        frame.setResizable(false);
        frame.setLayout(null);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static int computeValue(String value1, String value2){
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int sum = val1 + val2;
        return sum;
    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
}