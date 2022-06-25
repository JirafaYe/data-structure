package 线性表;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        SqlList sqlList = new SqlList();
        System.out.println(sqlList.isEmpty());
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            Polinomial polinomial = new Polinomial(random.nextInt(10), random.nextFloat());
            System.out.println(polinomial);
            sqlList.insert(polinomial);
        }
        sqlList.remove(5);
        Polinomial polinomial = new Polinomial(0, 0);
        sqlList.insert(5,polinomial);
        System.out.println(sqlList.get(0));
        System.out.println(sqlList.indexOf(polinomial));
        System.out.println(sqlList.length());
        System.out.println(sqlList);
        sqlList.clear();
        System.out.println(sqlList);
    }
}
