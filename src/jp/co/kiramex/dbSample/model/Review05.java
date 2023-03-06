package jp.co.kiramex.dbSample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Review05 {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null; 
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/kadaidb?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "Riechan26");

            String selectSql = "SELECT * FROM person where id = ?";

            pstmt = con.prepareStatement(selectSql);

            System.out.print("検索キーワードを入力してください > ");
            int input = keyInNum();

            pstmt.setInt(1, input);

            rs = pstmt.executeQuery();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBCドライバのロードに失敗しました。");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static int keyInNum() {
        int result = 0;
        try {
            result = Integer.parseInt(keyIn());
        } catch (NumberFormatException e) {
        }
        return result;
    }
    private static String keyIn() {
        return null;
    }
}