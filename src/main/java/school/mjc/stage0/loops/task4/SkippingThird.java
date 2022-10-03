package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for(int count=1; count<=lastPrinted; count++){
            if(count%3==0){
                continue;
            }
            System.out.println(count);
        }

    }
}
