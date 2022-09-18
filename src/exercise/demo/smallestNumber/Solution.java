package exercise.demo.smallestNumber;

public class Solution {
    public String smallestNumber(String pattern) {
    char[] pc = pattern.toCharArray();
    StringBuffer sb = new StringBuffer();
    int left = 0;
    int right = left;
    while(left < pc.length){
        StringBuffer tmp = new StringBuffer();
        while(right < pc.length && pc[right] == 'D'){
            right++;
            tmp.append(right);
        }
        sb.append(tmp.reverse());
        left = right;
        while(left < pc.length && pc[right]== 'I'){
            right++;
            sb.append(right);
        }
        left = right;
    }
    return sb.toString();
}
}
