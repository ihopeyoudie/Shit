package net.dzirt.chat;

import javax.swing.*;
import java.awt.*;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Андрей on 22.03.2017.
 */
public class ServerUI {
    JFrame serverFrame = new JFrame("Chat Server");
    JTextField usersCountField;
    JTextArea socketsField;

    ArrayList<Socket> usersList = new ArrayList<Socket>();
    int usersCount = 0;

    public ServerUI() {

    }

    public void fieldsRefresh(){
        socketsField.setText(null);
        usersCountField.setText(String.valueOf(usersCount));
        for (Socket s : usersList) {
            socketsField.append(String.valueOf(s));
            socketsField.append("\n");
        }
    }

    public void addUser(Socket s) {
        usersList.add(s);
        usersCount++;
        fieldsRefresh();
    }
    public void deleteUser(Socket s) {
        usersList.remove(s);
        usersCount--;
        fieldsRefresh();
    }

    public void display(){
        serverFrame.setVisible(true);
        JPanel southPanel = new JPanel();
        serverFrame.add(BorderLayout.SOUTH, southPanel);
        southPanel.setLayout(new GridBagLayout());

        usersCountField = new JTextField("0");
        socketsField = new JTextArea("none");
        socketsField.setEditable(false);

        serverFrame.add(new JScrollPane(socketsField), BorderLayout.CENTER);
        socketsField.setLineWrap(true);

        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.SOUTH;
        left.weightx = 5.0;

        //southPanel.add(socketsField, left);
        southPanel.add(usersCountField, left);

        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverFrame.setSize(470, 300);
    }




    public static void main(String[] args) {
        ServerUI serverUI = new ServerUI();
        serverUI.display();
    }
}
