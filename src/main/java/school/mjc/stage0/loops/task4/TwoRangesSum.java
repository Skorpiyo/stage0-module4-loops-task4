package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int result = 0;
        int sum=0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            for (int count = 1; count <= lastInRow; count++) {
                if (count<=numberToSkip) {
                    sum+=count;
                    continue;
                }
                result+=count;
            }
            System.out.println("skipped sum is "+ sum + "\ncounted sum is " +result);
        }
    }
}
