package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class italicActionListener {
    private final JFrame italic = new JFrame("Italic");

    private String getItalic(String text, String code) {
        int pos = text.indexOf(code);
        String t_text = "Error";

        if (pos != -1) {
            String t_str = text.substring(pos, (pos + code.length()));
            String t_boldText = "*" + t_str + "*";
            t_text = text.replace(code, t_boldText);
        }
        return t_text;
    }

    public italicActionListener() {
        JTextField textField = new JTextField();
        JTextField textToItalic = new JTextField();
        JButton submit = new JButton("Submit");
        JLabel textFieldLabel = new JLabel("Enter the text: ");
        JLabel textToItalicLabel = new JLabel("Enter the text that should be italic: ");

        textField.setBounds(250, 100, 200, 30);
        textToItalic.setBounds(250, 135, 200, 30);
        textFieldLabel.setBounds(165, 100, 200, 30);
        textToItalicLabel.setBounds(50, 135, 200, 30);
        submit.setBounds(300, 170, 100, 30);

        italic.add(textFieldLabel);
        italic.add(textToItalicLabel);
        italic.add(textField);
        italic.add(textToItalic);
        italic.add(submit);

        italic.setSize(800, 600);//800 width and 600 height
        italic.setLayout(null);//using no layout managers
        italic.setVisible(true);//making the frame visible
        italic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String textBoldAndItalic = textToItalic.getText();

                if (text.isEmpty() || textBoldAndItalic.isEmpty())
                {
                    JOptionPane.showMessageDialog(italic, "Error, text cannot be empty", "Error", JOptionPane.WARNING_MESSAGE);
                }
                else
                    {
                    JOptionPane.showMessageDialog(italic, getItalic(text, textBoldAndItalic));
                }
            }
        });
    }
}
