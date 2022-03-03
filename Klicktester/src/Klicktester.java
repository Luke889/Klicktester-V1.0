import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Klicktester {
    public static class Gui extends JFrame implements ActionListener{
        JLabel label;
        JButton button1;
        JButton button2;
        JPanel panel;
        int x;
        public Gui(){
            this.setTitle("Klicktester V1.0");
            this.setSize(400,250);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            panel = new JPanel();
            panel.setBackground(Color.LIGHT_GRAY);
            label = new JLabel("Button wurde " + x + "-mal gedrückt!");

            button1 = new JButton("Press");
            button1.addActionListener(this);


            button2 = new JButton("Close");
            button2.addActionListener(this);


            panel.add(label);
            panel.add(button1);
            panel.add(button2);

            this.add(panel);

        }

        public static void main(String[] args){
            Gui g = new Gui();
            g.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button1){
                label.setText("Button wurde " + x + "-mal gedrückt!");
                x++;
            }else if(e.getSource() == button2){
                System.exit(0);
            }
        }
    }
}
