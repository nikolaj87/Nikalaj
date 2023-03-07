package practice.javapro.march_6_2023;

public class FillArraySnailStyle {

        private int[][] array = new int[5][6];
        private int horizontalStart = 0;
        private int horizontalEnd = array[0].length;
        private int verticalStart = 0;
        private int verticalEnd = array.length;

    void fillArray() {

            while (horizontalStart < horizontalEnd && verticalStart < verticalEnd) {

                if (verticalEnd - verticalStart == 1) {
                    fillLeftToRight();
                    break;
                }
                if (horizontalEnd - horizontalStart == 1) {
                    fillTopToBottom();
                    break;
                }
                fillLeftToRight();
                fillTopToBottom();
                fillRightToLeft();
                fillBottomToTop();

                horizontalStart++;
                horizontalEnd--;
                verticalStart++;
                verticalEnd--;
            }
            printArray();
    }

    void fillLeftToRight() {
        for (int i = horizontalStart; i < horizontalEnd; i++) {
            array[verticalStart][i] = (int) (Math.random() * 9 + 1);
        }
    }
    void fillTopToBottom(){
        for (int j = verticalStart + 1; j < verticalEnd; j++) {
            array[j][horizontalEnd - 1] = (int) (Math.random() * 9 + 1);
        }
    }
    void fillRightToLeft(){
        for (int i = horizontalEnd - 2; i >= horizontalStart; i--) {
            array[verticalEnd - 1][i] = (int) (Math.random() * 9 + 1);
        }
    }
    void fillBottomToTop(){
        for (int j = verticalEnd - 2; j > horizontalStart; j--) {
            array[j][horizontalStart] = (int) (Math.random() * 9 + 1);
        }
    }

    void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

}
