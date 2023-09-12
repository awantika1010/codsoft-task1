import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentmarks {
    private JTextField stdname;
    private JTextField m1;
    private JTextField m2;
    private JTextField m3;
    private JTextField tm;
    private JButton CALCULATEButton;
    private JTextField favg;
    private JTextField grade;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("studentmarks");
        frame.setContentPane(new studentmarks().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public studentmarks() {
    CALCULATEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int eng,maths,science,tot;
            double avg;

            eng=Integer.parseInt(m1.getText());
            maths=Integer.parseInt(m2.getText());
           science=Integer.parseInt(m3.getText());

           tot= eng+maths+science;
           tm.setText(String.valueOf(tot));

            avg=tot/3;
            favg.setText(String.valueOf(avg));

            if(avg>90) {
                grade.setText("A+ GRADE");
            }
            else if(avg>=80 && avg<90){
                grade.setText("A GRADE");
            }
            else if(avg>=70 && avg<80){
                grade.setText("B+ GRADE");
            }
            else if(avg>=60 && avg<70){
                grade.setText("B GRADE");
            }
            else if(avg>=50 && avg<60){
                grade.setText("C+ GRADE");
            }
            else if(avg>=40 && avg<50){
                grade.setText("C GRADE");
            }
            else if(avg>=33 && avg<40){
                grade.setText("D GRADE");
            }
            else if(avg<33){
                grade.setText("FAIL");
            }
        }
    });
}
}
