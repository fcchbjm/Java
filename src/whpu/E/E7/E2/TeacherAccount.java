package whpu.E.E7.E2;

class TeacherAccount
{
    private int[] month=new int[12];
    private int num=0;

    public synchronized void deposit(int mon)
    {
        num++;
        month[num]=mon;
        notify();
    }
    public synchronized int withdraw()
    {
        while(num==0)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.err.println(e);
            }
        }
        num--;
        return month[num+1];
    }
}

