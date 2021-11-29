package ch3;

public class Ex3_17 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x; // x 값이 음수라면 양수로 만듦
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
        signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
        signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');

        System.out.println(signX);
        System.out.println(absX);
        System.out.println(signY);
        System.out.println(absY);
        System.out.println(signZ);
        System.out.println(absZ);
    }
}
