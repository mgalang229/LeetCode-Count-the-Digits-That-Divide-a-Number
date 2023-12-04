class Solution {
    public int countDigits(int num) {
        int copyNum = num, counter = 0;
        while (copyNum > 0){
            int digit = copyNum % 10;
            if (digit > 0 && num % digit == 0) {
                counter++;
            }
            copyNum /= 10;
        }
        return counter;
    }
}
