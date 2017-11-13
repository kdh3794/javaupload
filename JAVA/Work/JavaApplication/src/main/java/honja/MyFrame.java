package honja;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
    private JTextField textField;
    public MyFrame() {
        setTitle("테스트 프레임");
        getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("왼쪽버튼");
        btnNewButton.setBounds(12, 10, 124, 71);
        getContentPane().add(btnNewButton);
        
        JButton button = new JButton("중앙버튼");
        button.setBounds(179, 10, 124, 71);
        getContentPane().add(button);
        
        JButton btnDhfmswhrqjxms = new JButton("오른쪽버튼");
        btnDhfmswhrqjxms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnDhfmswhrqjxms.setBounds(325, 10, 124, 71);
        getContentPane().add(btnDhfmswhrqjxms);
        
        JButton button_2 = new JButton("창닫기");
        button_2.setBounds(195, 181, 124, 71);
        getContentPane().add(button_2);
        
        textField = new JTextField();
        textField.setBounds(139, 135, 231, 21);
        getContentPane().add(textField);
        textField.setColumns(10);
    }
}
