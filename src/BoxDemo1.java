class box2 {
    float width, height, depth;

    box2() {
        System.out.println("Constructing box");
        width = 2;
        height = 3;
        depth = 2;
    }

    box2(int i, int j, int k) {
        System.out.println("Constructor with Three parameters");
        width = i;
        height = j;
        depth = k;

    }

    float volume() {
        return width * height * depth;
    }
}

public class BoxDemo1 {
    public static void main(String args[]) {
        box2 b1 = new box2();
        float vol;
        b1.width = 10;
        b1.height = 10;
        b1.depth = 10;
        vol = b1.volume();
        System.out.println("The volume1 is- " + vol);
        box2 b2 = new box2();
        vol = b2.volume();
        System.out.println("The volume2 is- " + vol);
        box2 b3 = new box2(10, 10, 10);
        vol = b3.volume();
        System.out.println("The volume3 is- " + vol);
    }

}