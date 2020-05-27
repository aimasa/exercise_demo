package exercise.demo.hasgroupssizex;

public class HasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for(int i = 0; i < deck.length; i++){
            count[deck[i]] ++;
        }
        int g = -1;
        for(int i = 0; i < 10000; i++){
            if(count[i] > 0){
                if(g == -1){
                g = count[i];}
                else{
                    g = gcd(g , count[i]);
                }
            }
            
        }
        return g >= 2;
    }
    public int gcd(int a, int b){
        return a == 0? b : gcd(b % a, a);
    }
}
