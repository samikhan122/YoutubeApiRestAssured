public class ForloopTriangle
{
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            {
                System.out.println(i);
                for (int j = 1; j <=4-i ; j++) {
                    System.out.print(i);
                }
            }
        }
    }
}
