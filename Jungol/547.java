class Main {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6 };
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print((a[j] + i) + " ");
            }
        }
    }
}
