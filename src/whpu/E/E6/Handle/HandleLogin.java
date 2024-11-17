package whpu.E.E6.Handle;

import whpu.E.E6.MainWindow;
import whpu.E.E6.Model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleLogin(){
        try{  Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e) {
            System.err.println(e);
        }
        String uri = "jdbc:mysql://localhost:3306/user?useSSL=true";
        try{
            con = DriverManager.getConnection(uri,MainWindow.usrname, MainWindow.password); //登陆密码是具体的数据库设置而定，此处是123456
        }
        catch(SQLException e) {
            System.err.println(e);
        }
    }
    public Login queryVerify(Login loginModel) {
        String id = loginModel.getID();
        String pw = loginModel.getPassword();
        String sqlStr ="select id,password from register where "+
                "id = ? and password = ?";
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1,id);
            preSql.setString(2,pw);
            rs = preSql.executeQuery();
            if(rs.next()==true) {
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登录成功",
                        "恭喜",JOptionPane.WARNING_MESSAGE);
            }
            else {
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null,"登录失败",
                        "登录失败，重新登录",JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        }
        catch(SQLException e) {
            System.err.println(e);
        }
        return loginModel;
    }
}
