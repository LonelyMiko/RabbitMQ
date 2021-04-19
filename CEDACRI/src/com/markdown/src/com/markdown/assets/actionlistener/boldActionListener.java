package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boldActionListener {
    private final JFrame bold = new JFrame("Bold");

    private String getBold(String text, String bold)
    {
        // Find if text contain bold
        int pos = text.indexOf(bold);
        String t_text = "Error";

        if (pos != -1)
        {
            String t_str = text.substring(pos, (pos + bold.length()));
            String t_boldText = "**" + t_str + "**";
            t_text = text.replace(bold, t_boldText);
        }
        return t_text;
    }

    public boldActionListener()
    {
        JTextField textField = new JTextField();
        JTextField textToBold = new JTextField();
        JButton submit = new JButton("Submit");
        JLabel textFieldLabel = new JLabel("Enter the text:");
        JLabel textToBoldLabel = new JLabel("Enter the text that should be bold: ");

        textField.setBounds(250,100, 200,30);
        textToBold.setBounds(250,135,200,30);
        textFieldLabel.setBounds(165,100,200,30);
        textToBoldLabel.setBounds(55,135,200,30);
        submit.setBounds(300,170,100,30);

        bold.add(textFieldLabel);
        bold.add(textToBoldLabel);
        bold.add(textField);
        bold.add(textToBold);
        bold.add(submit);

        bold.setSize(800,600);//800 width and 600 height
        bold.setLayout(null);//using no layout managers
        bold.setVisible(true);//making the frame visible
        bold.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String textBold = textToBold.getText();

                if (text.isEmpty() || textBold.isEmpty())
                {
                    JOptionPane.showMessageDialog(bold,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                }
                else
                    {
                        JOptionPane.showMessageDialog(bold,getBold(text,textBold));
                    }
            }
        });

    }
}
