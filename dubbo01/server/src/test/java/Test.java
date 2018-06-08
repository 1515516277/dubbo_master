public class Test {
    public static void main(String[] args) {
        test();
    }
    static  int c=1;
    public static int test(){
        c++;
        System.out.println(c);
        if(c<6){
            return test();
        }
        return c;
    }
}
