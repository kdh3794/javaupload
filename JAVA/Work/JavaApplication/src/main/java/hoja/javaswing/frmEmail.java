package hoja.javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEmail extends JFrame {
    
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmEmail frame = new frmEmail();
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
    public frmEmail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 502);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(86, 33, 116, 21);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(86, 74, 116, 21);
        contentPane.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(287, 74, 116, 21);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(108, 210, 203, 21);
        contentPane.add(textField_3);
        System.out.print(textField_3);
        
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("HTML");
        rdbtnNewRadioButton.setBounds(29, 391, 71, 23);
        contentPane.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnPlainText = new JRadioButton("Plain Text");
        rdbtnPlainText.setBounds(108, 391, 94, 23);
        contentPane.add(rdbtnPlainText);
        
        JRadioButton rdbtnCustom = new JRadioButton("Custom");
        rdbtnCustom.setBounds(226, 391, 71, 23);
        contentPane.add(rdbtnCustom);
        
        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String add = textField_3.getText()+textField_4.getText();
                textField_4.setText(add);
                              
            }
            
            
        });
        btnNewButton.setBounds(323, 209, 97, 23);
        contentPane.add(btnNewButton);
        
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(323, 244, 97, 23);
        contentPane.add(btnEdit);
        
        JButton btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnRemove.setBounds(323, 277, 97, 23);
        contentPane.add(btnRemove);
        
        JButton btnDefault = new JButton("Default");
        btnDefault.setBounds(323, 316, 97, 23);
        contentPane.add(btnDefault);
        
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String print = "이름:  "+textField.getText()+"\n직책:  "+textField_1.getText()+"\n아이디:  "+textField_2.getText()+"\n이메일:  "+textField_4.getText();
                
                JOptionPane.showMessageDialog(null, print);
                
            }
        });
        btnOk.setBounds(226, 420, 77, 23);
        contentPane.add(btnOk);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnCancel.setBounds(323, 420, 97, 23);
        contentPane.add(btnCancel);
        
        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setBounds(17, 36, 57, 15);
        contentPane.add(lblNewLabel);
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(12, 10, 57, 15);
        contentPane.add(lblName);
        
        JLabel label_1 = new JLabel("직책");
        label_1.setBounds(17, 77, 57, 18);
        contentPane.add(label_1);
        
        JLabel label_2 = new JLabel("아이디");
        label_2.setBounds(218, 77, 57, 15);
        contentPane.add(label_2);
        
        JLabel lblMailFormat = new JLabel("Mail Format");
        lblMailFormat.setBounds(32, 370, 97, 15);
        contentPane.add(lblMailFormat);
         
         JPanel panel = new JPanel();
         panel.setBounds(10, 180, 412, 274);
         contentPane.add(panel);
         panel.setLayout(null);
         
         JLabel lblEmail = new JLabel("E-mail");
         lblEmail.setBounds(22, 10, 38, 15);
         panel.add(lblEmail);
         
         JLabel label_4 = new JLabel("이메일주소");
         label_4.setBounds(12, 35, 64, 15);
         panel.add(label_4);
         
         textField_4 = new JTextField();
         textField_4.setBounds(12, 66, 287, 119);
         panel.add(textField_4);
         textField_4.setColumns(10);
    }
}
