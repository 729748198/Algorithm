package nowCoder;


import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class a除以b{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>(); //���ڴ洢С������
        if(a%b == 0) {
            System.out.println(a/b);
        } else {
            int res = a/b;
            a %= b;
            int pos = -1;
            while(a != 0) {
                if(map.containsKey(a)) {
                    pos = map.get(a);
                    break;
                }else {
                    list.add((a*10)/b);
                    map.put(a,list.size());
                }
                a = (a*10)%b;
            }
            String outStr = res+".";
            if(pos == -1) {
                for(Integer i:list)
                    outStr += i;
            } else {
                for(int i=0;i<pos-1;i++) {
                    outStr += list.get(i);
                }
                outStr += "(";
                for(int i=pos-1;i<list.size();i++) {
                    outStr += list.get(i);
                }
                outStr += ")";
            }
            System.out.println(outStr);
        }
    }
}