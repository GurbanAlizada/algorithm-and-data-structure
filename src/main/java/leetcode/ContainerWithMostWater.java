package leetcode;


public class ContainerWithMostWater {

    public static void main(String[] args) {

        int arr[] = new int[]{
                3,4,9,6,1,2,4,8,2
        };
        System.out.println(foo2(arr));

    }


    public static int foo(int[] height){

        int maximumArea = 0;
        int left = 0;
        int right = height.length-1;
        int shorterLine = 0;
        int distance = 0;

        while (left < right){
            shorterLine = Math.min(height[left], height[right]);
            distance = right - left;
            maximumArea = Math.max(maximumArea , shorterLine * distance);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }

        return maximumArea;


    }


    public static int foo2(int [] height){

        int area;
        int max  = 0;

        for (int i = 0 ; i < height.length ; i++){
            for (int j = i+1 ; j < height.length ; j++){

                if (height[i]< height[j]){
                    area = height[i] * Math.abs((j-i));
                }else{
                    area = height[j] * Math.abs((j-i));
                }


                if (area > max){
                    max = area;
                }



            }
        }

        return max;

    }


}
