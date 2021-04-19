package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class codeActionListener {
    private JFrame code = new JFrame("Code");
    private String getCode(String text, String code)
    {
        int pos = text.indexOf(code);
        String t_text = "Error";

        if (pos != -1)
        {
            String t_str = text.substring(pos, (pos + code.length()));
            String t_boldText = "`" + t_str + "`";
            t_text = text.replace(code, t_boldText);
        }
        return t_text;
    }

    public codeActionListener()
    {
        JTextField textField = new JTextField();
        JTextField textToCode = new JTextField();
        JButton submit = new JButton("Submit");
        JLabel textFieldLabel = new JLabel("Enter the text: ");
        JLabel textToCodeLabel = new JLabel("Enter the text that should be code: ");

        textField.setBounds(250,100, 200,30);
        textToCode.setBounds(250,135,200,30);
        textFieldLabel.setBounds(165,100,200,30);
        textToCodeLabel.setBounds(50,135,200,30);
        submit.setBounds(300,170,100,30);

        code.add(textFieldLabel);
        code.add(textToCodeLabel);
        code.add(textField);
        code.add(textToCode);
        code.add(submit);

        code.setSize(800,600);//800 width and 600 height
        code.setLayout(null);//using no layout managers
        code.setVisible(true);//making the frame visible
        code.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String textBoldAndItalic = textToCode.getText();

                if (text.isEmpty() || textBoldAndItalic.isEmpty())
                {
                    JOptionPane.showMessageDialog(code,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(code,getCode(text,textBoldAndItalic));
                }
            }
        });
    }
}
