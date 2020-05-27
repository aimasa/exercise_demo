package exercise.demo.canthreepartsequalsum;

public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        if(A.length == 0){
            return false;
        }
        for(int i = 0; i < A.length; i++){
            sum += A[i];
        }
        if(sum%3 != 0){
            return false;
        }
        int lastSum = sum / 3;
        int headPoint = 0;
        int tailPoint = A.length - 1;
        int sumHead = A[headPoint];
        int sumTail = A[tailPoint];
        while(headPoint < tailPoint){
            if(sumTail != lastSum){
                tailPoint--;
                sumTail += A[tailPoint];
            }
            else if(sumHead != lastSum){
                headPoint++;
                sumHead += A[headPoint];
            }
            else if(sumHead == lastSum && sumHead == sumTail){
                return true;
            }
            
        }
        return false;

    }
}
