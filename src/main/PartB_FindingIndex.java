package main;
import java.util.Scanner;


public class PartB_FindingIndex {

    public void indexSearch(int[] inputArr, int key,int count) {
        try{
        int start = 0;
        int counter=0;
        int end = count;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                counter=mid;
            }
            if (mid < inputArr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(counter>0)
        {
            System.out.println(counter);
        }
        else
        {
            System.out.println("NOT_FOUND");
        }

    }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PartB_FindingIndex mbs = new PartB_FindingIndex();
        int count,i;
        Scanner input = new Scanner(System.in);
        count=input.nextInt();
        int key=input.nextInt();
        int inputArr[]= new int[count+1];
        for(i=1;i<=count;i++) {
            inputArr[i] = input.nextInt();
        }
        input.close();
       mbs.indexSearch(inputArr,key,count);

    }

}
