package Term02ExamProgram;

public class SeperateZerosAndOnes {
	public static void main(String[] args) {
		int arr[]= {0,1,0,0,1,1,1,0,1};
        int left = 0, right = arr.length - 1;
		while (left<right) {
			while (arr[left] == 0 && left < right) left++;
            while (arr[right] == 1 && left < right) right--;
            if (left < right) {
                arr[left++] = 0;
                arr[right--] = 1;
            }
        }
        System.out.println("Separated array: " + java.util.Arrays.toString(arr));
    }
		}


