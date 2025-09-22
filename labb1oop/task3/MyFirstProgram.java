class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(0,0); 
        System.out.println(o.XOR()); 
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.XOR());
		System.out.print("");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int a,b;
    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int XOR() {
        return a^b;
    }
}
