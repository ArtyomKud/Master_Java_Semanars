public class Main {
    public static void main(String[] args) {
        int [] unsortedArray = {3,1,5,2,33,-5,78};
        for (int item: unsortedArray) {
            System.out.print(item+" ");
        }
        mergeSorted(unsortedArray);
        System.out.println();
        for (int item: unsortedArray) {
            System.out.print(item+" ");
        }

    }

    private static void mergeSorted(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int[n-mid];

        for(int i = 0; i < mid; i++){
            left[i]=arr[i];
        }
        for(int i = mid; i < n; i++){
            right[i-mid]=arr[i];
        }
        mergeSorted(left);
        mergeSorted(right);
        merge(arr, left, right);

    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int iArr = 0;

        while (i < l && j < r) {
            if (left[i] < right[j]) {
                arr[iArr] = left[i];
                i++;
                iArr++;
            } else {
                arr[iArr] = right[j];
                j++;
                iArr++;
            }
        }

            for (int ii = i; ii < l; ii++){
                arr[iArr] = left[ii];
            }
            for (int jj = j; jj < r; jj++){
                arr[iArr] = right[jj];
                iArr++;
            }

    }
}
