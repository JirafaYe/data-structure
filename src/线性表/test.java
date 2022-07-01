package 线性表;

import 线性表.Entity.Polinomial;

import java.util.Random;

public class test {
    public static void main(String[] args) {

    }

    private static void testLinkedList(){
        LinkedList<Polinomial> list = new LinkedList<>();
        LinkedList<Polinomial> list2 = new LinkedList<>();
        Polinomial polinomial = new Polinomial(0,0);
        list.addFirst(polinomial);
        for (int i = 1; i <= 10; i++) {
            Polinomial po = new Polinomial(i, i);
            list.addFirst(po);
            System.out.println(list.get(0));
        }
        for (int i = 1; i <= 10; i++) {
            Polinomial po = new Polinomial(i, i);
            list2.addFirst(po);
            System.out.println(list2.get(0));
        }
        list.addLast(new Polinomial(100,9));
        list.remove(0);
        Polinomial tem = new Polinomial(100, 9);
        if(list.contains(tem))
            list.remove(tem);
        System.out.println("l1Size:"+list.getSize());
        list.addLast(new Polinomial(11,11));
        System.out.println("l1:"+list);
        System.out.println("l2:"+list2);
        list2.addLast(new Polinomial(0,50));
        list.connect(list2);
        System.out.println(list);
        list.remove(new Polinomial(0,50));
        System.out.println("aft:"+list);
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
