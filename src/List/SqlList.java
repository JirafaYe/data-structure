package List;

/**
 * 线性表的顺序表示
 * @author jirafa
 */
public class SqlList<T> {
    /**
     * 线性表长度
     */
    private int length;
    /**
     * 数据域
     */
    private Object[] data;
    /**
     * 最大容量
     */
    private int maxSize;

    public SqlList() {
        this.maxSize=100;
        this.length=0;
        this.data= new Object[maxSize];
    }

    public SqlList(int size) {
        this.length = 0;
        this.maxSize=size;
        this.data= new Object[maxSize];
    }

    public void clear(){
        length=0;
    }

    public int length(){
        return length;
    }

    public Boolean isEmpty(){
        return length == 0;
    }

    public T get(int index){
        if(index>=length||index<0){
            throw new RuntimeException("该索引不存在");
        }
        return (T) data[index];
    }

    public int indexOf(T elem){
        for (int i = 0; i < length; i++) {
            if(data[i].equals(elem))
                return i;
        }
        return -1;
    }

    public void insert(int index, T elem){
        if(length==maxSize){
            throw new RuntimeException("顺序表已满");
        }
        if(index<0||index>length){
            throw new RuntimeException("索引不合法");
        }

        for (int i = length; i > index; i--) {
            data[i]=data[i-1];
        }
        data[index]=elem;
        length++;
    }

    /**
     * 默认从尾部插入
     * @param elem 多项式类型
     */
    public void insert(T elem){
        if(length==maxSize){
            throw new RuntimeException("线性表已满");
        }
        data[length]= elem;
        length++;
    }

    public void remove(int index){
        if(length==0) {
            throw new RuntimeException("线性表为空");
        }
        if(index<0||index>length-1){
            throw new RuntimeException("索引错误");
        }

        for (int i = index;i <length-1; i++) {
            data[i]=data[i+1];
        }
        length--;
    }

    @Override
    public String toString() {
        if(length==0){
            return "线性表为空";
        }
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(data[i].toString());
        }
        return result.toString();
    }
}
