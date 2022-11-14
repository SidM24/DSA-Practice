import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int cases = sc.nextInt();
        for (int j=0;j<cases;++j)
        {
            System.out.println("Enter the number of Bags found: ");
            int bags=sc.nextInt();
            System.out.println("Enter the number of Children: ");
            int kids=sc.nextInt();
            int candies[]=new int[bags];
//        Inputting the number of candies in each bag
            int total_candies=0;
            for(int i=0;i<bags;++i)
            {
                candies[i]=sc.nextInt();
                total_candies=total_candies+candies[i];
            }
            System.out.println("Number of candies left are: "+total_candies%kids);
        }
    }
}