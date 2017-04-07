package net.dzirt.chat;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Андрей on 21.03.2017.
 */
public class UserInterface {

    JFrame mainFrame = new JFrame("Colt Chat v0.1");
    JFrame preFrame;

    UserInterface mainGUI;
    JButton sendMessage;
    JTextField messageBox;
    JTextArea chatBox;
    JTextField usernameChooser;
    String username;

//    public UserInterface() {
//        mainFrame.setSize(100,100);
//        mainFrame.setVisible(false);
//
//    }

    public void preDisplay() {
        mainFrame.setVisible(false);
        preFrame = new JFrame("Choose your username!(Colt chat v0.1");
        usernameChooser = new JTextField();
        JLabel chooseUsernameLabel = new JLabel("Pick a username:");
        JButton enterServer = new JButton("Enter Chat Server");
        JPanel prePanel = new JPanel(new GridBagLayout());

        GridBagConstraints preRight = new GridBagConstraints();
        preRight.anchor = GridBagConstraints.EAST;
        GridBagConstraints preLeft = new GridBagConstraints();
        preLeft.anchor = GridBagConstraints.WEST;
        preRight.weightx = 2.0;
        preRight.fill = GridBagConstraints.HORIZONTAL;
        preRight.gridwidth = GridBagConstraints.REMAINDER;

        prePanel.add(chooseUsernameLabel, preLeft);
        prePanel.add(usernameChooser, preRight);
        preFrame.add(BorderLayout.CENTER, prePanel);
        preFrame.add(BorderLayout.SOUTH, enterServer);
        preFrame.setVisible(true);
        preFrame.setSize(300, 300);

        enterServer.addActionListener(new enterServerButtonListener());
    }

    public void show(){
        mainFrame.setVisible(true);
    }

    class sendMessageButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (messageBox.getText().length() < 1) {
                // do nothing
            } else if (messageBox.getText().equals(".clear")) {
                chatBox.setText("Cleared all messages\n");
                messageBox.setText("");
            } else {
                chatBox.append("<" + username + ">:  " + messageBox.getText() + "\n");
                messageBox.setText("");
            }
        }
    }

    public void display() {
        mainFrame.setVisible(true);
        JPanel southPanel = new JPanel();
        mainFrame.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridBagLayout());

        messageBox = new JTextField(30);
        sendMessage = new JButton("Send Message");
        chatBox = new JTextArea();
        chatBox.setEditable(false);
        mainFrame.add(new JScrollPane(chatBox), BorderLayout.CENTER);

        chatBox.setLineWrap(true);

        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.WEST;
        GridBagConstraints right = new GridBagConstraints();
        right.anchor = GridBagConstraints.EAST;
        right.weightx = 2.0;

        southPanel.add(messageBox, left);
        southPanel.add(sendMessage, right);

        chatBox.setFont(new Font("Serif", Font.PLAIN, 15));
        sendMessage.addActionListener(new sendMessageButtonListener());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(470, 300);
    }

    class enterServerButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            username = usernameChooser.getText();
            if (username.length() < 1) {System.out.println("No!"); }
            else {
                preFrame.setVisible(false);
                display();
            }
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserInterface mainGUI = new UserInterface();
        mainGUI.preDisplay();
    }
}
