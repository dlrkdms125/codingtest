class Solution {
    public int solution(int[] mats, String[][] park) {
        int maxMat = -1;

        for (int mat : mats) {
            if (canFindSquare(mat, park)) {
                maxMat = Math.max(maxMat, mat);
            }
        }
        return maxMat;
    }

    private boolean canFindSquare(int mat, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        // 범위를 벗어나면 false 반환
        if (mat > rows || mat > cols) return false;

        for (int i = 0; i <= rows - mat; i++) {
            for (int j = 0; j <= cols - mat; j++) {
                if (isSquareValid(i, j, mat, park)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSquareValid(int startX, int startY, int size, String[][] park) {
        for (int i = startX; i < startX + size; i++) {
            for (int j = startY; j < startY + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
