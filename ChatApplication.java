import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class ChatApplication {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField messageField;
    private PrintWriter out;
    
    public ChatApplication() {
        frame = new JFrame("AI Chat Application");
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        messageField = new JTextField(50);
        JButton sendButton = new JButton("Send");
        
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                out.println(message);
                messageField.setText("");
            }
        });
        
        frame.getContentPane().add(new JScrollPane(chatArea), BorderLayout.CENTER);
        JPanel panel = new JPanel();
        panel.add(messageField);
        panel.add(sendButton);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        try {
            Socket socket = new Socket("localhost", 5000);
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String response;
            while ((response = in.readLine()) != null) {
                chatArea.append(response + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new ChatApplication();
    }
}
