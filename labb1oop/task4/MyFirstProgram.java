import myfirstpackage.*;
class MyFirstClass {
    public static void main(String[] args) {
        MyFirstPackage o = new MyFirstPackage(0,0); 
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
