package whpu.E.E6;

import whpu.E.E6.View.RegisterAndLoginView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class MainWindow extends JFrame implements ActionListener{
    JButton computerButton;
    RegisterAndLoginView view;
    public static String password;
    public static String usrname;
    MainWindow() {
        setBounds(100,100,800,260);
        view = new RegisterAndLoginView();
        computerButton = new JButton("玩华容道");
        computerButton.addActionListener(this);
        add(view,BorderLayout.CENTER);
        add(computerButton,BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(view.isLoginSuccess()==false){
            JOptionPane.showMessageDialog(null,"请登录","登录提示",
                    JOptionPane.WARNING_MESSAGE);
        }
        else {
            Hua_Rong_Road win=new Hua_Rong_Road();//华容道
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数据库用户名:");
        usrname = scan.nextLine();
        System.out.print("请输入数据库密码:");
        password = scan.nextLine();
        MainWindow window = new MainWindow();
        window.setTitle("登录后可玩华容道");
    }
}

