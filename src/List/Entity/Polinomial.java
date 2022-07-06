package List.Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polinomial that = (Polinomial) o;
        return e == that.e && Float.compare(that.p, p) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(e, p);
    }
}
