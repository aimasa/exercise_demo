package exercise.demo.rsa.encode;

import java.util.Random;

public class RSAEncode {
    public void rsaEncryption(Long p, Long q) {
        Long n = p * q;
        Random  random = new Random();
        random.nextLong();


    }
    
    public Boolean[] isPrime(int a) {
        Boolean[] isPrimeNum = new Boolean[a];
        for(int i = 0; i<= a; i++) {
            isPrimeNum[i] = true;
        }
        isPrimeNum[1] = false;
        isPrimeNum[0] = false;
        for (int i = 2; i <= a; i++) {
            if (isPrimeNum[i]) {
                for (int j = i * 2; j < isPrimeNum.length; j = j + i) {
                    isPrimeNum[j] = false;
                }
            }
        }
        return isPrimeNum;
    }
    
    public Boolean isCorPrime(int e,int n) {
        if(e == 1 && n == 1) {return true;}
        else if(e == n){
            return false;
        } else if (e == 1 || n == 1) {
            return true;
        } else {
            int temp = 0;
            while (true) {
                temp = n % e;
                if (temp == 0) {
                    break;
                } else {
                    n = e;
                    e = temp;
                }
            }
        }
        if (e == 1) // 最大公约数为1,所以互质
            return true;
        else // 最大公约数大于1，所以不互质
            return false;
    }
}
