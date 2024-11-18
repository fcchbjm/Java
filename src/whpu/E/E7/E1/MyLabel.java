package whpu.E.E7.E1;

import java.awt.*;
import java.awt.event.*;
class MyLabel extends Label implements Runnable
{
    int value;
    boolean stop=false;
    public MyLabel()
    {
        super("number");
        value=0;
    }
    public void run()
    {
        for(;;)
        {
            value=(int)(Math.random()*10);
            setText(Integer.toString(value));
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.err.println(e);
            }
            if(stop)
            {
                break;
            }
        }
    }
}

