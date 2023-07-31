public class fibonacii {
        public static void main(String args[]) {
                int i=1,u=10,a=0,b=1;
                while(i<=u){
                        System.out.println(a);
                        int n=a+b;
                        a=b;
                        b=n;
                        i++;
                }
        }
}


