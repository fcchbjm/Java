package whpu.E.E5.E1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    Window window;
    public void setWindow(Window window){
        this.window = window;
    }

    //程序运算和结果输出部分
    private void compute(String str) {
        String num1 = window.jtnum1.getText();
        String num2 = window.jtnum2.getText();
        try {
            if (str == "Add") {
                String ret = Double.toString(Double.valueOf(num1) + Double.valueOf(num2));
                window.jtres.setText(ret);
            } else if (str == "Subtract") {
                String ret = Double.toString(Double.valueOf(num1) - Double.valueOf(num2));
                window.jtres.setText(ret);
            } else if (str == "Multiply") {
                String ret = Double.toString(Double.valueOf(num1) * Double.valueOf(num2));
                window.jtres.setText(ret);
            } else if (str == "Devide") {
                String ret = Double.toString(Double.valueOf(num1) / Double.valueOf(num2));
                window.jtres.setText(ret);
            } else {
                System.out.println("Illegal parameters");//非法参数
            }
        } catch (NumberFormatException  e) {
            System.err.println(e);//错误处理
        }
    }

    //事件监听部分
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == window.B_Add || e.getSource() == window.M_Add) {
            compute("Add");
        } else if (e.getSource() == window.B_Subtract || e.getSource() == window.M_Subtract) {
            compute("Subtract");
        } else if (e.getSource() == window.B_Multiply || e.getSource() == window.M_Multiply) {
            compute("Multiply");
        } else if (e.getSource() == window.B_Devide || e.getSource() == window.M_Devide) {
            compute("Devide");
        } else {
            System.out.println("Unknown Error");
        }
    }
}
