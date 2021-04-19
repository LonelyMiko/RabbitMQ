import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.markdown.assets.actionlistener.*;

public class  Main_Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Markdown by Miko");//creating instance of JFrame
        JButton blockquotes = new JButton("Blockquotes"); //creating instance of JButton
        JButton bold = new JButton("Bold");
        JButton boldAndItalic = new JButton("Bold and Italic");
        JButton code = new JButton("Code");
        JButton headings = new JButton("Headings");
        JButton italic = new JButton("Italic");
        JButton link = new JButton("Link");
        JButton list = new JButton("List");


        blockquotes.setBounds(300,100,150, 40);
        bold.setBounds(300,150,150,40);
        boldAndItalic.setBounds(300,200,150,40);
        code.setBounds(300,250,150,40);
        headings.setBounds(300,300,150,40);
        italic.setBounds(300,350,150,40);
        link.setBounds(300,400,150,40);
        list.setBounds(300,450,150,40);

        blockquotes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blockquotesActionListener blockquotesActionListener = new blockquotesActionListener();
            }
        });

        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boldActionListener boldActionListener = new boldActionListener();
                //frame.dispose();
            }
        });

        boldAndItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boldAndItalicActionListener boldAndItalicActionListener = new boldAndItalicActionListener();
                //frame.dispose();
            }
        });

        code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeActionListener codeActionListener = new codeActionListener();
                //frame.dispose();
            }
        });

        headings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                headingsActionListener headingsActionListener = new headingsActionListener();
                //frame.dispose();
            }
        });

        italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                italicActionListener italicActionListener = new italicActionListener();
                //frame.dispose();
            }
        });

        link.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkActionListener linkActionListener = new linkActionListener();
                //frame.dispose();
            }
        });

        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listActionListener listActionListener = new listActionListener();
                //frame.dispose();
            }
        });


        frame.add(blockquotes);
        frame.add(bold);
        frame.add(boldAndItalic);
        frame.add(code);
        frame.add(headings);
        frame.add(italic);
        frame.add(link);
        frame.add(list);


        frame.setSize(800,600);//800 width and 600 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
