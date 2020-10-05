package main;
import java.util.Scanner;


public class PartA_FindingEqualtoIndex {
    public void FindingEqualtoIndex(int[] inputArr) {

        int start = 0;
        int end = inputArr.length;
        int counter=0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == inputArr[mid]) {
                counter=mid;

            }
            if (mid <= inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(counter!= 0)
        {
            System.out.println(counter);
        }
        else
        {
            System.out.println("NOT_FOUND");
        }
    }

    public static void main(String[] args) {

        PartA_FindingEqualtoIndex mbs = new PartA_FindingEqualtoIndex();
        int count,i;
        Scanner input = new Scanner(System.in);
        count=input.nextInt();

        int inputArr[]= new int[count+1];
        for(i=1;i<=count;i++) {
            inputArr[i] = input.nextInt();
        }
        input.close();
        mbs.FindingEqualtoIndex(inputArr);

    }
}
