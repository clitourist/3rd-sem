public class BoxDemo         {
    public static void main(String []args){
        Box b1 = new Box();
        b1.width = 10;
        b1.height = 10;
        b1.depth = 10;
        Double volume = b1.width * b1.height * b1.depth;
        System.out.println("The volume is : "+volume);
    }
}

