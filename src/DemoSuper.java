class Box3 {
    private double width;
    private double height;
    private double depth;

    //constructcloneofanobject
    Box3(Box3 ob) {//passobjecttoconstructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructorusedwhenalldimensionsspecified
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructorusedwhennodimensionsspecified
    Box3() {
        width = -1;//use-1toindicate
        height = -1;//anuninitialized
        depth = -1;//box
    }

    //constructorusedwhencubeiscreated
    Box3(double len) {
        width = height = depth = len;
    }

    //computeandreturnvolume
    double volume() {
        return width * height * depth;
    }
}

//BoxWeightnowfullyimplementsallconstructors.
class BoxWeight1 extends Box3 {
    double weight;//weightofbox

    //constructcloneofanobject
    BoxWeight1(BoxWeight1 ob) {//passobjecttoconstructor
        super(ob);
        weight = ob.weight;
    }

    //constructorwhenallparametersarespecified
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);//callsuperclassconstructor
        weight = m;
    }

    //defaultconstructor
    BoxWeight1() {
        super();
        weight = -1;
    }

    //constructorusedwhencubeiscreated
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1();//default
        BoxWeight1 mycube = new BoxWeight1(3, 2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}