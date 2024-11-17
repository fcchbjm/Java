package whpu.E.E5;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    Listener listener;

    public JMenuItem M_Add;//菜单部分
    public JMenuItem M_Subtract;
    public JMenuItem M_Multiply;
    public JMenuItem M_Devide;

    public JButton B_Add;//按钮部分
    public JButton B_Subtract;
    public JButton B_Multiply;
    public JButton B_Devide;

    public JTextField jtnum1;//文本框部分
    public JTextField jtnum2;
    public JTextField jtres;

    public void SetPanel(JPanel jPanel, Listener listener) {
        //listener = new Listener();

        JLabel jlnum1 = new JLabel("Number 1");//文本提示
        JLabel jlnum2 = new JLabel("Number 2");
        JLabel jlres = new JLabel("Result");

        listener.setWindow(this);

        jtnum1 = new JTextField(10);
        jtnum1.addActionListener(listener);
        jtnum2 = new JTextField(10);
        jtnum2.addActionListener(listener);
        jtres = new JTextField(10);
        jtres.setEditable(false);//将结果框设置为只读
        jtres.addActionListener(listener);

        B_Add = new JButton("Add");
        B_Add.addActionListener(listener);//注册监听器
        B_Subtract = new JButton("Subtract");
        B_Subtract.addActionListener(listener);
        B_Multiply = new JButton("Multiply");
        B_Multiply.addActionListener(listener);
        B_Devide = new JButton("Devide");
        B_Devide.addActionListener(listener);

        jPanel.add(jlnum1);
        jPanel.add(jtnum1);
        jPanel.add(jlnum2);
        jPanel.add(jtnum2);
        jPanel.add(jlres);
        jPanel.add(jtres);
        jPanel.add(B_Add);
        jPanel.add(B_Subtract);
        jPanel.add(B_Multiply);
        jPanel.add(B_Devide);
    }

    public void SetWindow() {
        JFrame frame = new JFrame("computer");//窗口大小和关闭方式设置
        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listener = new Listener();//监听器设置
        listener.setWindow(this);

        JMenuBar jMenuBar = new JMenuBar();//菜单栏和菜单设置
        JMenu Oper = new JMenu("Operation");
        M_Add = new JMenuItem("Add");
        M_Add.addActionListener(listener);//注册监听器
        M_Subtract = new JMenuItem("Subtract");
        M_Subtract.addActionListener(listener);
        M_Multiply = new JMenuItem("Multiply");
        M_Multiply.addActionListener(listener);
        M_Devide = new JMenuItem("Devide");
        M_Devide.addActionListener(listener);
        Oper.add(M_Add);
        Oper.add(M_Subtract);
        Oper.add(M_Multiply);
        Oper.add(M_Devide);
        JMenu Exit = new JMenu("Exit");
        jMenuBar.add(Oper);
        jMenuBar.add(Exit);
        frame.setJMenuBar(jMenuBar);

        JPanel jPanel = new JPanel(new FlowLayout());//布局设置
        SetPanel(jPanel, listener);
        frame.add(jPanel);

        // 设置界面可见
        frame.setVisible(true);
    }
}
