package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class linkActionListener {
    private JFrame link = new JFrame("Link");
    private JTextField linkField = new JTextField();
    private JTextField textField = new JTextField();
    private JLabel linkLabel = new JLabel("Enter link: ");
    private JLabel textLabel = new JLabel("Enter the text: ");
    private JButton submit = new JButton("Submit");

    private String getLink(String text, String link)
    {
        return "[" + text + "]" + "(" + link + ")";
    }

    public linkActionListener()
    {
        linkField.setBounds(250,100, 200,30);
        textField.setBounds(250,135,200,30);
        linkLabel.setBounds(185,100,200,30);
        textLabel.setBounds(165,135,200,30);
        submit.setBounds(300,170,100,30);

        link.add(textLabel);
        link.add(linkLabel);
        link.add(textField);
        link.add(linkField);
        link.add(submit);

        link.setSize(800,600);//800 width and 600 height
        link.setLayout(null);//using no layout managers
        link.setVisible(true);//making the frame visible
        link.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String linkFieldTextLink = linkField.getText();

                if (text.isEmpty() || linkFieldTextLink.isEmpty())
                {
                    JOptionPane.showMessageDialog(link,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(link,getLink(text,linkFieldTextLink));
                }
            }
        });
    }
}
