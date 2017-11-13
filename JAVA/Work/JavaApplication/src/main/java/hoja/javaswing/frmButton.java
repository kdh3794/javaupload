package hoja.javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmButton extends JFrame {
    
    private JPanel contentPane;
    private JTextField textField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmButton frame = new frmButton();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public frmButton() {
        setTitle("테스트 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("왼쪽버튼");
        btnNewButton.setBounds(12, 30, 97, 23);
        contentPane.add(btnNewButton);
        
        JButton button = new JButton("중앙버튼");
        button.setBounds(152, 30, 97, 23);
        contentPane.add(button);
        
        JButton button_1 = new JButton("오른쪽버튼");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_1.setBounds(289, 30, 97, 23);
        contentPane.add(button_1);
        
        JButton button_2 = new JButton("창닫기");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button_2.setBounds(171, 207, 97, 23);
        contentPane.add(button_2);
        
        textField = new JTextField();
        textField.setBounds(166, 142, 116, 21);
        contentPane.add(textField);
        textField.setColumns(10);
    }
    
}
