package org.mnr.leet;

public class Search2DMatrix {
    public static void main(String[] args) {
        //https://leetcode.com/problems/search-a-2d-matrix/
        int[][] arr1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] arr2 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr1, 3));
        System.out.println(searchMatrix(arr1, 13));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = (rows * columns - 1);

        while(low <= high) {
            int mid = (low + (high - low) / 2);
            int div = mid / columns;
            int mod = mid % columns;
            int value = matrix[div][mod];

            if (value == target) {
                return true;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    private static boolean findElement(int[] arr, int target){

        int left=0,right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }
            return false;
        }
        return false;
    }

}
