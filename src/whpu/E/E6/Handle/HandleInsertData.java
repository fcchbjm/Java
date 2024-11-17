package whpu.E.E6.Handle;

import whpu.E.E6.MainWindow;
import whpu.E.E6.Model.Register;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleInsertData {
    Connection con;
    PreparedStatement preSql;
    public HandleInsertData(){
        try{  Class.forName("com.mysql.jdbc.Driver");//加载JDBC-MySQL驱动
        }
        catch(Exception e) {
            System.err.println(e);
        }
        String uri = "jdbc:mysql://localhost:3306/user?useSSL=true";
        try{
            con = DriverManager.getConnection(uri,MainWindow.usrname, MainWindow.password); //连接代码，连接密码是具体情况而定，此处是123456
        }
        catch(SQLException e) {
            System.err.println(e);
        }
    }
    public void writeRegisterModel(Register register) {
        String sqlStr ="insert into register values(?,?,?)";
        int ok = 0;
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1,register.getID());
            preSql.setString(2,register.getPassword());
            preSql.setString(3,register.getBirth());
            ok = preSql.executeUpdate();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"id不能重复","警告",
                    JOptionPane.WARNING_MESSAGE);
        }
        if(ok!=0) {
            JOptionPane.showMessageDialog(null,"注册成功",
                    "恭喜",JOptionPane.WARNING_MESSAGE);
        }
    }
}
