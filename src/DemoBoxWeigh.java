class Box2 {
    double width;
    double height;
    double depth;

    //constructcloneofanobject
    Box2(Box2 ob) {//passobjecttoconstructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructorusedwhenalldimensionsspecified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructorusedwhennodimensionsspecified
    Box2() {
        width = -1;//use-1toindicate
        height = -1;//anuninitialized
        depth = -1;//box
    }

    //constructorusedwhencubeiscreated
    Box2(double len) {
        width = height = depth = len;
    }

    //computeandreturnvolume
    double volume() {
        return width * height * depth;
    }
}

//Here,Boxisextendedtoincludeweight.
class BoxWeight extends Box2 {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}
