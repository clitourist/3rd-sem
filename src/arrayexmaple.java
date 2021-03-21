public class arrayexmaple {
        public static void  main(String []args)
        {
            int sum = 0;
            int a[] = {10,20,30};
            for(int i : a)
            {
                sum = sum +i;
            }
            System.out.println(sum);
        }
    }