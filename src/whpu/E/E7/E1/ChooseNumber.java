package whpu.E.E7.E1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseNumber extends Frame
{
    MyLabel x[]=new MyLabel[6];
    Button control;

    public ChooseNumber(String title)
    {
        super(title);
        Panel disp=new Panel();
        disp.setLayout(new FlowLayout());
        for(int i=0;i<6;i++)
        {
            x[i]=new MyLabel();
            disp.add(x[i]);
            new Thread(x[i]).start();
        }
        add("Center",disp);
        control=new Button("停止");
        add("South",control);
        //pack();
        setVisible(true);
        control.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                for(int i=0;i<6;i++)
                {
                    x[i].stop=true;
                }
            }
        });

    }
    public static void main(String[] args)
    {
        new ChooseNumber("选号程序");
    }
}

