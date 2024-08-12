import java.util.*;
class colllection {
    public ArrayList<Integer
    > grayCode(int n) {
        ArrayList<Integer> l =  grayCode(n-1);
        ArrayList<Integer> m = new ArrayList<>();
        for(int i = 0;i<l.size();i++){
            int r = l.get(i);
            m.add(0 + r);
        }
        for(int i = l.size()-1;i>0;i--){
            int r = l.get(i);
            m.add(1 + r);
        }
        return m;
    }
}