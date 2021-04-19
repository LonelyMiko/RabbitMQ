package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boldAndItalicActionListener {
    private final JFrame boldAndItalic = new JFrame("Bold And Italic");

    private String getBoldAndItalic(String text, String bold)
    {
        // Find if text contain bold
        int pos = text.indexOf(bold);
        String t_text = "Error";

        if (pos != -1)
        {
            String t_str = text.substring(pos, (pos + bold.length()));
            String t_boldText = "***" + t_str + "***";
            t_text = text.replace(bold, t_boldText);
        }
        return t_text;
    }

    public boldAndItalicActionListener()
    {
        JTextField textField = new JTextField();
        JTextField textToBoldAndItalic = new JTextField();
        JButton submit = new JButton("Submit");
        JLabel textFieldLabel = new JLabel("Enter the text:");
        JLabel textToBoldandItalicLabel = new JLabel("Enter Bold and Italic: ");

        textField.setBounds(250,100, 200,30);
        textToBoldAndItalic.setBounds(250,135,200,30);
        textFieldLabel.setBounds(165,100,200,30);
        textToBoldandItalicLabel.setBounds(130,135,200,30);
        submit.setBounds(300,170,100,30);

        boldAndItalic.add(textFieldLabel);
        boldAndItalic.add(textToBoldandItalicLabel);
        boldAndItalic.add(textField);
        boldAndItalic.add(textToBoldAndItalic);
        boldAndItalic.add(submit);


        boldAndItalic.setSize(800,600);//800 width and 600 height
        boldAndItalic.setLayout(null);//using no layout managers
        boldAndItalic.setVisible(true);//making the frame visible
        boldAndItalic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String textBoldAndItalic = textToBoldAndItalic.getText();

                if (text.isEmpty() || textBoldAndItalic.isEmpty())
                {
                    JOptionPane.showMessageDialog(boldAndItalic,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(boldAndItalic,getBoldAndItalic(text,textBoldAndItalic));
                }
            }
        });
    }
}
