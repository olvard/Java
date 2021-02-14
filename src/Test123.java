import javax.swing.*;

public class Test123 {



    public static void main(String[] args) {
        System.out.println("Testar 123");

        JFrame window = new JFrame();

        JLabel action = new JLabel();



        action.setText("Emma är en noob");

        window.add(action);

        window.setSize(200,200);



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);


    }
}
