package Xu;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 8:45.
 */
public abstract class AbstractDao implements TDAO {
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void del() {
        System.out.println("删除");
    }

    @Override
    public void upd() {
        System.out.println("修改");
    }

    @Override
    public void sel() {
        System.out.println("查询");
    }
}
