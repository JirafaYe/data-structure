package String;

public class KMP {

    public int[] getNext(String str){
        int j=0;
        int[] next = new int[str.length()];
        next[0]=j;
        for (int i = 1; i < str.length(); i++) {
            while (j>0&&str.charAt(i)!=str.charAt(j)){
                j=next[j-1];
            }
            if(str.charAt(i)==str.charAt(j))
                j++;
            next[i]=j;
        }
        return next;
    }

    public int strStr(String haystack, String needle){
        if(needle.length()==0)
            return 0;

        int[] next = getNext(needle);
        int j=0;
        for (int i = 0; i < haystack.length(); i++) {
            while (needle.charAt(j)!=haystack.charAt(i)&&j>0 ){
                j=next[j-1];
            }
            if(haystack.charAt(i)==needle.charAt(j))
                j++;
            if(j==needle.length())
                return (i-needle.length()+1);
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "aabaaf";
        KMP kmp = new KMP();
        int[] next = kmp.getNext(str);
        for (int i:next){
            System.out.println(i);
        }
    }
}
