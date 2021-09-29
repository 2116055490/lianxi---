package Xu;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 10:27.
 */
public class xiao {
   String name;
   String color;
   public xiao(String name,String color){
      this.color = color;
      this.name = name;
   }
//   public boolean equals(xiao x2){
//      if (this.color == x2.color){
//         return true;
//      }else{
//         return false;
//      }
//   }
   int w = 1;
   int e = 1;
   public static void main(String[] args) {
      xiao x = new xiao("小花","红色");
      xiao x1 = new xiao("小花","红色");
      System.out.println(x==x1);
      System.out.println(x.equals(x1));

      System.out.println(x.w == x.e);


   }
}
