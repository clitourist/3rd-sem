class A1 {
    int i;
}

class B1 extends A1 {
    int i;//this i hides the i in A

    B1(int a, int b) {
        super.i = a;//i in A
        i = b;//i in B
    }

    void show() {
        System.out.println("i in super class: " + super.i);
        System.out.println("i in sub class: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B1 subOb = new B1(1, 2);
        subOb.show();
    }
}