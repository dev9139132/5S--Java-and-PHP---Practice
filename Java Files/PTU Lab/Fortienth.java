// 14. Calculate the average value of array elements through a Java program.

public class Fortienth {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5};
        float sum = 0;
        for(int i:arr) 
        {
            sum+=i;
        }
        float avg = (sum)/(arr.length);

        System.out.println(avg);
    }
}
