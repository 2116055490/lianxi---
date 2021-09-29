package Xu;

import java.util.Scanner;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 8:50.
 */
public class Client {
   public static void main(String[] args) {
      System.out.println("您要连接的数据库 1:mysql  2:oracle");
      Scanner scanner = new Scanner(System.in);
      int i = scanner.nextInt();
      TDAO td;  //在外面声明变量
      if (i == 1){
         td = new MySqlDao();
      }else{
        td = new OracleDao();
      }

      td.add();
      td.connect();
   }
}
