package com.markdown.assets.actionlistener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class headingsActionListener {
    private final JFrame headings = new JFrame("Headings");
    private JButton h1 = new JButton("Heading 1");
    private JButton h2 = new JButton("Heading 2");
    private JButton h3 = new JButton("Heading 3");
    private JButton h4 = new JButton("Heading 4");
    private JButton h5 = new JButton("Heading 5");
    private JButton h6 = new JButton("Heading 6");
    private String getHeading(int type, String text) {
        StringBuilder headingType = new StringBuilder();
        for (int i = 0; i < type; i++)
        {
            headingType.append("#");
        }
        return  headingType + " " + text;
    }

    public headingsActionListener()
    {
        h1.setBounds(300, 100,150,40);
        h2.setBounds(300, 150,150,40);
        h3.setBounds(300, 200,150,40);
        h4.setBounds(300, 250,150,40);
        h5.setBounds(300, 300,150,40);
        h6.setBounds(300, 350,150,40);

        headings.add(h1);
        headings.add(h2);
        headings.add(h3);
        headings.add(h4);
        headings.add(h5);
        headings.add(h6);
        headings.setSize(800,600);//800 width and 600 height
        headings.setLayout(null);//using no layout managers
        headings.setVisible(true);//making the frame visible
        headings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new Frame for Heading 1
        h1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 1;
                JFrame h1 = new JFrame("Heading 1");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h1.add(textField);
                h1.add(textFieldLabel);
                h1.add(submit);

                h1.setSize(800,600);//800 width and 600 height
                h1.setLayout(null);//using no layout managers
                h1.setVisible(true);//making the frame visible
                h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });

            }
        });
        h2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 2;
                JFrame h2 = new JFrame("Heading 2");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h2.add(textField);
                h2.add(textFieldLabel);
                h2.add(submit);

                h2.setSize(800,600);//800 width and 600 height
                h2.setLayout(null);//using no layout managers
                h2.setVisible(true);//making the frame visible
                h2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });
            }
        });
        h3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 3;
                JFrame h3 = new JFrame("Heading 3");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h3.add(textField);
                h3.add(textFieldLabel);
                h3.add(submit);

                h3.setSize(800,600);//800 width and 600 height
                h3.setLayout(null);//using no layout managers
                h3.setVisible(true);//making the frame visible
                h3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });
            }
        });
        h4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 4;
                JFrame h4 = new JFrame("Heading 4");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h4.add(textField);
                h4.add(textFieldLabel);
                h4.add(submit);

                h4.setSize(800,600);//800 width and 600 height
                h4.setLayout(null);//using no layout managers
                h4.setVisible(true);//making the frame visible
                h4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });
            }
        });
        h5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 5;
                JFrame h5 = new JFrame("Heading 5");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h5.add(textField);
                h5.add(textFieldLabel);
                h5.add(submit);

                h5.setSize(800,600);//800 width and 600 height
                h5.setLayout(null);//using no layout managers
                h5.setVisible(true);//making the frame visible
                h5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });
            }
        });
        h6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = 6;
                JFrame h6 = new JFrame("Heading 6");

                JTextField textField = new JTextField();
                JButton submit = new JButton("Submit");
                JLabel textFieldLabel = new JLabel("Enter the text:");

                textField.setBounds(250,100, 200,30);
                submit.setBounds(450,100,100,30);
                textFieldLabel.setBounds(170,100,200,30);

                h6.add(textField);
                h6.add(textFieldLabel);
                h6.add(submit);

                h6.setSize(800,600);//800 width and 600 height
                h6.setLayout(null);//using no layout managers
                h6.setVisible(true);//making the frame visible
                h6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String text = textField.getText();
                        if (text.isEmpty())
                        {
                            JOptionPane.showMessageDialog(h1,"Error, text cannot be empty","Error",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(h1, getHeading(type, text));
                        }
                    }
                });
            }
        });

    }
}
