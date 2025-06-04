class Solution {
    public long solution(long n) {
        // n이 어떤 양의 정수x의 제곱인지 아닌지 판별
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
        return (long) Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}