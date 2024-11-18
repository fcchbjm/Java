package whpu.E.E7.E2;

public class TeacherAccountTest
{
    public static void main(String[] args)
    {
        TeacherAccount staffaccount=new TeacherAccount();
        SchoolBank com=new SchoolBank(staffaccount);
        Teacher sta=new Teacher(staffaccount);
        Thread t1=new Thread(com);
        Thread t2=new Thread(sta);
        t1.start();
        t2.start();
    }
}

