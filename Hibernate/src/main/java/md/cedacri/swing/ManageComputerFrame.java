package md.cedacri.swing;

import md.cedacri.hibernate.CrudMethods;
import md.cedacri.pojo.Computer;
import md.cedacri.pojo.DetailParts;
import md.cedacri.pojo.Pieces;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Locale;
import java.util.Objects;

/**
 * Create UI for user can manage a computer like create computer with pieces, delete computer, update computer and get computers costs
 */
public class ManageComputerFrame extends JFrame {

    private final JTextField txtSerieComputer;
    private final JTextField txtDescription;
    private final JTextField txtAssemblyDate;
    private final JButton btnConfirm;
    private final JLabel lblPieces;

    private final CrudMethods crudMethods;
    private final JTextField txtValor;
    private final List<DetailParts> listDetailParts;
    private final JComboBox comboBoxPieces;
    private String searchSerial;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ManageComputerFrame frame = new ManageComputerFrame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public ManageComputerFrame() {
        listDetailParts = new ArrayList<>();
        List<String> selectedPieces = new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 685, 421);
        setTitle("Computer management");

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        crudMethods = new CrudMethods();

        JLabel lblSerie = new JLabel("Serie:");
        lblSerie.setBounds(99, 13, 46, 16);
        contentPane.add(lblSerie);

        JLabel lblDesription = new JLabel("Description:");
        lblDesription.setBounds(67, 42, 78, 16);
        contentPane.add(lblDesription);

        JLabel lblAssemblyDate = new JLabel("Assembly Date:");
        lblAssemblyDate.setBounds(12, 71, 133, 16);
        contentPane.add(lblAssemblyDate);

        JButton btnRead = new JButton("Read");
        btnRead.setBounds(299, 13, 97, 25);
        contentPane.add(btnRead);

        JButton btnDeposit = new JButton("Deposit");
        btnDeposit.setBounds(408, 13, 97, 25);
        contentPane.add(btnDeposit);

        JButton btnRemove = new JButton("Remove");
        btnRemove.setBounds(525, 13, 97, 25);
        contentPane.add(btnRemove);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(408, 62, 97, 25);
        contentPane.add(btnUpdate);

        JButton btnCosts = new JButton("Costs");
        btnCosts.setBounds(525, 62, 97, 25);
        contentPane.add(btnCosts);

        txtSerieComputer = new JTextField();
        txtSerieComputer.setBounds(145, 10, 116, 22);
        contentPane.add(txtSerieComputer);
        txtSerieComputer.setColumns(10);

        txtDescription = new JTextField();
        txtDescription.setBounds(145, 39, 116, 22);
        contentPane.add(txtDescription);
        txtDescription.setColumns(10);

        txtAssemblyDate = new JTextField();
        txtAssemblyDate.setBounds(145, 68, 116, 22);
        contentPane.add(txtAssemblyDate);
        txtAssemblyDate.setColumns(10);

        Panel panel = new Panel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(10, 122, 647, 242);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblEnterPieces = new JLabel("Enter the computer parts with their value:");
        lblEnterPieces.setBounds(12, 13, 334, 16);
        panel.add(lblEnterPieces);

        comboBoxPieces = new JComboBox();
        comboBoxPieces.setModel(new DefaultComboBoxModel(fillComboBox().toArray()));

        comboBoxPieces.setBounds(146, 42, 134, 22);
        panel.add(comboBoxPieces);

        txtValor = new JTextField();
        txtValor.setBounds(338, 42, 82, 22);
        panel.add(txtValor);
        txtValor.setColumns(10);

        JButton btnAddPiece = new JButton("Add Pieces");
        btnAddPiece.setBounds(432, 41, 143, 25);
        panel.add(btnAddPiece);

        JLabel lblValor = new JLabel("Value ($) :");
        lblValor.setBounds(338, 13, 70, 16);
        panel.add(lblValor);

        JButton btnDeletePiece = new JButton("Delete Pieces");
        btnDeletePiece.setBounds(432, 75, 143, 25);
        panel.add(btnDeletePiece);

        JLabel lblSelectedPieces = new JLabel("Selected pieces:");
        lblSelectedPieces.setBounds(12, 129, 134, 16);
        panel.add(lblSelectedPieces);

        lblPieces = new JLabel("None");
        lblPieces.setBounds(146, 129, 489, 16);
        panel.add(lblPieces);

        btnConfirm = new JButton("Confirm");
        btnConfirm.setBackground(new Color(0, 255, 0));
        btnConfirm.setEnabled(false);
        btnConfirm.setBounds(299, 62, 97, 25);
        contentPane.add(btnConfirm);


        /*Event handling for buttons*/
        btnRead.addActionListener(new ButtonClickListener());
        btnDeposit.addActionListener(new ButtonClickListener());
        btnRemove.addActionListener(new ButtonClickListener());
        btnUpdate.addActionListener(new ButtonClickListener());
        btnCosts.addActionListener(new ButtonClickListener());
        btnAddPiece.addActionListener(new ButtonClickListener());
        btnConfirm.addActionListener(new ButtonClickListener());
        btnDeletePiece.addActionListener(new ButtonClickListener());
    }

    /**
     * Fill a comboBox with DB data
     *
     * @return List<String>
     */
    public List<String> fillComboBox() {
        List<String> nameParts = new ArrayList<>();

        for (Object pieces : crudMethods.getPieces()) {
            Pieces convertedPiece = (Pieces) pieces;
            nameParts.add(convertedPiece.getName());
        }

        return nameParts;
    }

    /**
     * Clear the fields of this class
     */
    public void clearTextFields() {
        txtSerieComputer.setText("");
        txtDescription.setText("");
        txtAssemblyDate.setText("");
        txtValor.setText("");
        listDetailParts.clear();
    }

    /**
     * Verify if the <code>txtSerieComputer</code> , <code>txtDescription</code> and <code>txtAssemblyDate</code> are empty
     *
     * @return true if the text fields are empty or false if they are not
     */
    public boolean isTxtFieldsEmpty() {
        boolean empty = false;
        String computerSerial = txtSerieComputer.getText();
        String description = txtDescription.getText();
        String assemblyDate = txtAssemblyDate.getText();

        if (computerSerial.equals("") && description.equals("") && assemblyDate.equals("")) {
            if (Integer.parseInt(computerSerial) < 0 && Integer.parseInt(assemblyDate) < 0) {
                empty = true;
            }
        }

        return empty;
    }

    /**
     * Show the computer pieces selected
     */
    public void showPieces() {
        StringBuilder aux = new StringBuilder();
        for (DetailParts dp : listDetailParts)
            aux.append(dp.getPieceDetail()).append(", ");

        lblPieces.setText(aux.toString());
    }

    /**
     * Delete the computer pieces from the List listDetailParts.
     */
    public void deletePieces() {
        listDetailParts.remove(listDetailParts.size() - 1);
        showPieces();
    }

    /**
     * Implements a ActionListener interface for handle the buttons action events
     */
    private class ButtonClickListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            System.out.println("Button pressed: " + command);

            switch (command) {

                case "Read":
                    searchSerial = JOptionPane.showInputDialog("Enter the series of the computer to read", 123);
                    if (searchSerial != null && !searchSerial.equals("")) {
                        Computer searchComputer = crudMethods.searchComputer(Integer.parseInt(searchSerial));
                        if (searchComputer != null) {
                            JOptionPane.showMessageDialog(new JFrame(), searchComputer.toString(), "Computer Info", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(new Frame(), "The computer associated with this serial " + searchSerial +
                                    " does not exist", "Invalid serial", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "Please enter a valid serial", "Invalid serial", JOptionPane.WARNING_MESSAGE);
                    }

                    break;

                case "Update":

                    searchSerial = JOptionPane.showInputDialog("Enter the series of the computer to search", 123);

                    if (searchSerial != null && !searchSerial.equals("")) {
                        Computer oldComputer = crudMethods.searchComputer(Integer.parseInt(searchSerial));
                        if (oldComputer != null) {
                            txtSerieComputer.setText(String.valueOf(oldComputer.getSerieComputer()));
                            txtAssemblyDate.setText(String.valueOf(oldComputer.getAssemblyDate()));
                            txtDescription.setText(oldComputer.getDescription());
                            btnConfirm.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(new Frame(), "The computer associated with this serial " + searchSerial +
                                    " does not exist", "Invalid serial", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "Please enter a valid serial", "Invalid serial", JOptionPane.WARNING_MESSAGE);
                    }

                    break;

                case "Deposit":
                    if (listDetailParts.size() > 0) {

                        if (crudMethods.searchComputer(Integer.parseInt(txtSerieComputer.getText())) == null) {
                            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                            try {
                                Computer computer = new Computer(
                                        Integer.parseInt(txtSerieComputer.getText()),
                                        txtDescription.getText(),
                                        formatter.parse(txtAssemblyDate.getText()));

                                crudMethods.newComputer(computer);
                                clearTextFields();
                            } catch (ParseException parseException) {
                                parseException.printStackTrace();
                            }

                            JOptionPane.showMessageDialog(new Frame(), "Computer successfully entered", "Success", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(new Frame(), "The computer you are trying to enter already exists", "Computer cannot be entered", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "Choose at least one piece", "No parts selected", JOptionPane.WARNING_MESSAGE);
                    }

                    break;

                case "Costs":
                    StringBuilder computerCosts;

                    if (crudMethods.getCosts() == null) {
                        Objects.requireNonNull(crudMethods.getCosts());
                    }
                    computerCosts = new StringBuilder("Computers: \n");
                    for (DetailParts detailParts : crudMethods.getCosts()) {
                        computerCosts.
                                append("Computer: ").
                                append(detailParts.getPieceDetail()).
                                append("\n").append("Cost: ").
                                append(detailParts.getCost()).
                                append("\n");

                    }
                    JOptionPane.showMessageDialog(new JFrame(), computerCosts.toString(),
                            "Computer costs", JOptionPane.INFORMATION_MESSAGE);

                    break;

                case "Remove":
                    searchSerial = JOptionPane.showInputDialog("Enter the series of the computer to remove", 123);

                    if (searchSerial.equals("")) {
                        JOptionPane.showMessageDialog(new Frame(), "The computer cannot be deleted because the entered serial number is empty",
                                "Information", JOptionPane.ERROR_MESSAGE);
                    } else if (Integer.parseInt(searchSerial) >= 0) {

                        if (crudMethods.deleteComputer(crudMethods.searchComputer(Integer.parseInt(searchSerial)))) {
                            JOptionPane.showMessageDialog(new JFrame(), "Computer successfully removed", "Deleted computer", JOptionPane.INFORMATION_MESSAGE);
                            clearTextFields();
                        } else {
                            JOptionPane.showMessageDialog(new Frame(), "Computer cannot be removed because the serial number entered does not exist", "Information", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "Enter numbers greater than 0", "Information", JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case "Add Pieces":
                    if (txtValor.getText().equals("")) {
                        JOptionPane.showMessageDialog(new Frame(), "The part cannot be added because the price is empty", "Information", JOptionPane.ERROR_MESSAGE);

                    } else if (Integer.parseInt(txtValor.getText()) > 0) {
                        int valor = Integer.parseInt(txtValor.getText());
                        listDetailParts.add(new DetailParts((String) comboBoxPieces.getSelectedItem(), valor));
                        showPieces();
                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "Enter numbers greater than 0", "Information", JOptionPane.ERROR_MESSAGE);
                    }


                    break;

                case "Confirm":
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                    Computer newComputer = null;
                    try {
                        newComputer = new Computer(
                                Integer.parseInt(txtSerieComputer.getText()),
                                txtDescription.getText(),
                                formatter.parse(txtAssemblyDate.getText()));
                    } catch (ParseException parseException) {
                        parseException.printStackTrace();
                    }

                    if (crudMethods.updateComputer(newComputer, Integer.parseInt(searchSerial))) {
                        JOptionPane.showMessageDialog(new Frame(), "Updated computer", "Information", JOptionPane.INFORMATION_MESSAGE);
                        clearTextFields();
                        btnConfirm.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(new Frame(), "The computer could not be updated", "Information", JOptionPane.ERROR_MESSAGE);
                        clearTextFields();
                    }

                    break;
                case "Delete Pieces":
                    if (listDetailParts.size() > 0) {
                        deletePieces();
                    } else {
                        lblPieces.setText("None");
                    }

                    break;
            }

        }

    }
}
