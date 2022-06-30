package 线性表;

import java.util.LinkedList;
import java.util.Random;

public class test {
    public static void main(String[] args) {

    }

    private static void testSqlList(){
        SqlList<Polinomial> sqlList = new SqlList<>();
        System.out.println(sqlList.isEmpty());
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            Polinomial polinomial = new Polinomial(random.nextInt(10), random.nextFloat());
            System.out.println(polinomial);
            sqlList.insert(polinomial);
        }
        sqlList.remove(5);
        System.out.println(sqlList.length());
        Polinomial polinomial = new Polinomial(0, 0);
        sqlList.insert(sqlList.length(),polinomial);
        System.out.println(sqlList.get(0));
        System.out.println(sqlList.indexOf(polinomial));
        System.out.println(sqlList.length());
        System.out.println(sqlList);
        sqlList.clear();
        System.out.println(sqlList);
    }

    private static void testLinkList(){
        LinkList<Polinomial> list = new LinkList<>();
        Polinomial polinomial = new Polinomial(0,0);
        list.addFirst(polinomial);
        for (int i = 1; i <= 10; i++) {
            Polinomial po = new Polinomial(i, i);
            list.addFirst(po);
            System.out.println(list.get(0));
        }
        list.addLast(new Polinomial(100,9));
        list.remove(0);
        Polinomial tem = new Polinomial(100, 9);
        if(list.contains(tem))
            list.remove(tem);
        list.addLast(new Polinomial(11,11));
        System.out.println(list);
    }
}
