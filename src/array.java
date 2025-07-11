public class array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]); // 1
        arr[1] = 10;
        System.out.println(arr[1]); // 10
    }



    public static void arrayTest() {
        int[] nums = {1,2,3,4,5};

        for (int i=0; i < nums.length; i++) {   // 1+2+3+4 = 10, i<5 까지만 돌리니까
            System.out.println(nums[i]);
        }
    }
}
