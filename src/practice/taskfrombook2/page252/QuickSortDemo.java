package practice.taskfrombook2.page252;

class QuickSortDemo {
    public static void main(String[] args) {

        char[] a = {'a', 'd', 'x', 'z', 'r', 'p', 'j', 'i', 'z', 'a'};


        System.out.print("исходный массив  ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]);

        System.out.println();
        QuickSort.qsort(a);

        System.out.print("отсортировано  ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}
