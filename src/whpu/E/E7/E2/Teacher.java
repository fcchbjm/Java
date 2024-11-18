package whpu.E.E7.E2;

class Teacher implements Runnable
{
    TeacherAccount account;

    public Teacher(TeacherAccount s)
    {
        account=s;
    }
    public void run()
    {
        int temp;
        for(int i=1;i<13;i++)
        {
            temp=account.withdraw();
            System.out.println("教师提取："+temp+" 月份的工资");
            try
            {
                Thread.sleep((int)(Math.random()*30));
            }
            catch(InterruptedException e)
            {
                System.err.println(e);
            }
        }
    }
}
