    interface anima {
        public void demo();
        public void cat2();
    }
    class dog4 implements anima
    {
        @Override
        public void demo()
        {
            System.out.println("java developer");
        }
        public void cat2()
        {
            System.out.println("cat is smiling");

        }

    }
public class intface {
    public static void main(String[] args){
        dog4 obj2=new dog4();
        obj2.demo();
        obj2.cat2();


    }
}
