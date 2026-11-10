package challenges.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x > 0 && x % 10 == 0) {
            return false;
        }

        int xCopy = x / 10;
        int xReverse = x % 10;

        while (xCopy > xReverse) {
            System.out.println("xCopy: " + xCopy);
            System.out.println("xReverse: " + xReverse);

            System.out.println("xCopy % 10 = " + xCopy % 10);
            xReverse = (xReverse * 10) + (xCopy % 10);

            System.out.println("xCopy / 10 = " + xCopy / 10);
            xCopy = xCopy / 10;

            System.out.println("-------------");
        }

        System.out.println("xCopy: " + xCopy);
        System.out.println("xReverse: " + xReverse);
        System.out.println("xReverse / 10: " + xReverse / 10);
        return xCopy == xReverse || xCopy == xReverse / 10;
    }
}
