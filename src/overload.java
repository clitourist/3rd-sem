class OverloadDemo{
        void test(){
        System.out.println("Noparameters");
        }
//Overloadtestforoneintegerparameter.
        void test(int a){
        System.out.println("a:"+a);
        }
//Overloadtestfortwointegerparameters.
        void test(int a,int b){
        System.out.println("a and b:"+a+""+b);
        }
//overloadtestforadoubleparameter
        double test(double a){
        System.out.println("double a:"+a);
        return a*a;
        }
        }
        class Overload{
        public static void main(String args[]){
        OverloadDemo ob=new OverloadDemo();
        double result;
//callallversionsoftest()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.25);
        System.out.println("Resultofob.test(123.25):"+result);
        }
        }