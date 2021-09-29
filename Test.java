package Xu;

import java.util.Scanner;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 10:58.
 */
public class Test {
   public static void main(String[] args) {
      String name = "xiaoxu";
      String password = "123";
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入用户名：");
      String s = scanner.nextLine();
      System.out.println("请输入您的密码");
      String s1 = scanner.nextLine();
      if (s.equals(name)&&s1.equals(password)){
         System.out.println("登录成功");
      }else{
         System.out.println("登录失败");
      }
   }
}
