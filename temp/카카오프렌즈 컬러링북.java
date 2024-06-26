import java.util.LinkedList;
import java.util.Queue;

class Solution {
    final static int[][] moveDirec = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] marking = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!marking[i][j] && picture[i][j] != 0) {
                    if (!marking[i][j] && picture[i][j] != 0) {
                        maxSizeOfOneArea = Math.max(maxSizeOfOneArea, markingArea(i, j, picture, marking));
                        numberOfArea += 1;
                    }
                }
            }
        }

        return new int[]{numberOfArea, maxSizeOfOneArea};
    }

    private int markingArea(int i, int j, int[][] picture, boolean[][] marking) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{picture[i][j], i, j});
        marking[i][j] = true;

        int result = 1;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int[] direc : moveDirec) {
                int x = temp[1] + direc[0];
                int y = temp[2] + direc[1];

                if (x < 0 || x >= picture.length || y < 0 || y >= picture[x].length) {
                    continue;
                }

                if (!marking[x][y] && picture[x][y] == temp[0]) {
                    marking[x][y] = true;
                    queue.offer(new int[]{picture[x][y], x, y});
                    result += 1;
                }
            }
        }

        return result;
    }
}