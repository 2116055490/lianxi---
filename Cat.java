package Xu;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 11:20.
 */
public class Cat {
    String name;
    String color;
    public Cat(String name,String color){
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat c = new Cat("小花","黄色");
        System.out.println(c);
        System.out.println(c.toString());
    }
}
