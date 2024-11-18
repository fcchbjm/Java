package whpu.E.E7.E2;

class SchoolBank implements Runnable
{
    TeacherAccount account;
    public SchoolBank(TeacherAccount s)
    {
        account=s;
    }
    public void run()
    {
        for(int i=1;i<13;i++)
        {
            account.deposit(i);
            System.out.println("学校发放："+i+" 月份的工资");
            try
            {
                Thread.sleep((int)(Math.random()*10));
            }
            catch(InterruptedException e)
            {
                System.err.println(e);
            }
        }
    }
}
