package beforech6;

import java.util.Arrays;

// Arrays Class
public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] arr2D = { {1,2,3},
                        {4,5,6}};

        System.out.println(Arrays.toString(arr));       // 1차원 배열 리스트
        System.out.println(Arrays.deepToString(arr2D)); // 다차원 배열 리스트

        // 배열의 비교 equals, deepEquals
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));     // 2차원 문자열 배열이기 때문에 false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        // 배열의 복사 copyOf, copyOfRange
        int [] intArr = {0,1,2,3,4};
        int [] intArr2 = Arrays.copyOf(intArr, intArr.length);      // [0,1,2,3,4]
        int [] intArr3 = Arrays.copyOf(intArr,3 );        // [0,1,2]
        int [] intArr4 = Arrays.copyOf(intArr, 7);        // [0,1,2,3,4,0,0]
        int [] intArr5 = Arrays.copyOfRange(intArr, 2, 4); // [2,3]
        int [] intArr6 = Arrays.copyOfRange(intArr, 0, 7); // [0,1,2,3,4,0,0]

        // 배열의 정렬 sort
        int[] sortArr = { 3, 2, 0, 4, 7};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr)); // [0, 2, 3, 4, 7] 오름차순정렬
    }
}
