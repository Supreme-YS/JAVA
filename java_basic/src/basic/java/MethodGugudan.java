package basic.java;
// 메서드를 사용해 반복되는 부분을 줄인다.
public class MethodGugudan {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++){
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        for(int j = 2; j < 10; j++){
            int[] result = calculate(j);
            print(result);
            System.out.println("******");
        }
    }
}
