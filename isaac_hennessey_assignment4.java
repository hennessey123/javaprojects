import java.awt.*; //import awt toolkit
import java.awt.event.*;
import javax.swing.*;

public class isaac_hennessey_assignment4 extends Frame implements KeyListener { // begins listening for event to be
                                                                                // specified
    TextArea ta; // initializes a text area
    Button Q;
    JLabel lable;

    isaac_hennessey_assignment4() { // defines the new object
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        ta = new TextArea(); // calls instance of new text area
        ta.setBounds(100, 250, 120, 100);
        ta.setBackground(Color.red);

        Q = new Button();
        Q.setBounds(4, 400, 100, 100);
        Q.setBackground(Color.red);

        add(ta);
        add(Q);
        setSize(500, 500); // defines the size of the frame
        setLayout(null); // doesnt define a set layout
        setVisible(true); // makes the window visible

    }

    public void keyTyped(KeyEvent e) { // method for what to do when button is clicked
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case 'q':

        }
    }

    public void keyPressed(KeyEvent e) {
        // Handle key press events if needed
    }

    public void keyReleased(KeyEvent e) {
        // Handle key release events if needed
    }

    public static void main(String[] args) {
        new isaac_hennessey_assignment4(); // calls a new instance of object

    }
}
