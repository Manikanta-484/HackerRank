import java.util.Scanner;

public class NegativeSubarrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count the number of negative subarrays
        int count = 0;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<0){
                    count++;
                }
            }
        }

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}
