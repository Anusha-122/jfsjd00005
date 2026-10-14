class parent
{
    void p1() {
        System.out.println("parent class");

    }
        }
        class child extends parent
        {
            void p2()
            {
                System.out.println("child class");

            }
        }
        public class inheritance {
    public static void main(String[] args) {
        parent obj = new parent();
        obj.p1();


    }
}

