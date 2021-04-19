package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class listActionListener {
    private JFrame list = new JFrame("List");

    private String type[] = {"Ordered List", "Unordered Lists"};
    JComboBox listType = new JComboBox(type);
    private JTextField items = new JTextField();
    private JLabel itemsLabel = new JLabel("How many items will be on the list?");
    private  JButton submit = new JButton("Submit");


    public listActionListener()
    {

        items.setBounds(250,100, 200,30);
        submit.setBounds(450,100,100,30);
        itemsLabel.setBounds(45,100,200,30);
        listType.setBounds(250,140,200,30);

        list.add(items);
        list.add(submit);
        list.add(itemsLabel);
        list.add(items);
        list.add(listType);

        list.setSize(800,600);//800 width and 600 height
        list.setLayout(null);//using no layout managers
        list.setVisible(true);//making the frame visible
        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new JFrame("List");
                // converting the string to an int value //
                int itemsCount = Integer.parseInt(items.getText());
                ArrayList<String> list=new ArrayList<String>();
                JTextField items = new JTextField();
                JLabel itemsLabel = new JLabel("Enter items");
                JButton submit = new JButton("Submit");

                items.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                itemsLabel.setBounds(170,100,200,30);

                newFrame.add(items);
                newFrame.add(itemsLabel);
                newFrame.add(submit);

                newFrame.setSize(800,600);//800 width and 600 height
                newFrame.setLayout(null);//using no layout managers
                newFrame.setVisible(true);//making the frame visible
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = items.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(newFrame,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            if (list.size() < itemsCount) {
                                list.add(text);
                            }
                            else
                                {
                                    // Check if the Lists is Unordered and print list with delimiter "-"
                                    if (listType.getSelectedItem().equals("Unordered Lists")) {
                                        JFrame newFrame = new JFrame("Print Unordered Lists");
                                        JLabel printInfo = new JLabel("Your Unordered Lists: ");
                                        newFrame.setSize(800, 600);//800 width and 600 height
                                        newFrame.setLayout(null);//using no layout managers
                                        newFrame.setVisible(true);//making the frame visible
                                        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        printInfo.setBounds(140,100,200,30);
                                        newFrame.add(printInfo);
                                        for (int i = 0; i < list.size(); i++) {
                                            JLabel label = new JLabel("- " + list.get(i));
                                            label.setBounds(250, 100 + ((i+1) * 20), 200, 30);
                                            newFrame.add(label);
                                        }
                                    }
                                    // If the lists isn't Unordered, then we print list with index (i+1)
                                    else
                                        {
                                            JFrame newFrame = new JFrame("Print Ordered Lists");
                                            JLabel printInfo = new JLabel("Your Ordered Lists: ");
                                            newFrame.setSize(800,600);//800 width and 600 height
                                            newFrame.setLayout(null);//using no layout managers
                                            newFrame.setVisible(true);//making the frame visible
                                            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            printInfo.setBounds(140,100,200,30);
                                            newFrame.add(printInfo);
                                            for (int i = 0; i < list.size(); i++) {
                                                 JLabel label = new JLabel((i+1) + ". " + list.get(i));
                                                 label.setBounds(250, 100 + ((i+1) * 20), 200, 30);
                                                 newFrame.add(label);
                                            }
                                    }

                                }
                        }
                    }
                });
            }
        });
    }
}
