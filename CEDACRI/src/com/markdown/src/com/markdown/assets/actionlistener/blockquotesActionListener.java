package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.*;

public class blockquotesActionListener {
    private final JFrame blockqoutesFrame = new JFrame("BlockQuotes");

    public blockquotesActionListener()
    {
        JTextField textField = new JTextField();
        JButton submit = new JButton("Submit");
        JLabel label = new JLabel("Enter the text:");

        textField.setBounds(250,100, 200,30);
        submit.setBounds(450,100,100,30);
        label.setBounds(170,100,200,30);

        blockqoutesFrame.add(textField);
        blockqoutesFrame.add(submit);
        blockqoutesFrame.add(label);

        blockqoutesFrame.setSize(800,600);//800 width and 600 height
        blockqoutesFrame.setLayout(null);//using no layout managers
        blockqoutesFrame.setVisible(true);//making the frame visible
        blockqoutesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (text.isEmpty())
                {
                    JOptionPane.showMessageDialog(blockqoutesFrame,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                }
                else
                    {
                        JOptionPane.showMessageDialog(blockqoutesFrame,">> " + text);
                    }
            }
        });
    }
}
