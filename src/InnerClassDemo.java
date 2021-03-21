class Outer {
    int outer_x = 100;

    void test() {
        Inner b = new Inner();
        b.display();
    }

    class Inner {
        void display() {
            System.out.println("display:outer_x=" + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer a = new Outer();
        a.test();
    }
}