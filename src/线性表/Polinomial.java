package 线性表;

/**
 * @author jj
 * 多项式实体类
 */
public class Polinomial {
    /**
     * 指数
     */
    private int e;
    /**
     * 系数
     */
    private float p;

    public Polinomial() {
    }

    public Polinomial(int e, float p) {
        this.e = e;
        this.p = p;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "{" +
                "e=" + e +
                ", p=" + p +
                '}';
    }
}
