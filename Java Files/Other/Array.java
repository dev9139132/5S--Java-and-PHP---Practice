class Array {
    public static void main(String[] args) {
        int x[] = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = i*2;
            
        }
        System.out.println(x[2]);
        System.out.println(x[4]);
    }
}