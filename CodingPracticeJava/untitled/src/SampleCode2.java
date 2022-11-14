import java.util.Scanner;

public class SampleCode2
{
    Scanner sc=new Scanner(System.in);
    int n;
    int[][][] arr;
    SampleCode2(int size)
    {
        n=size;
        arr=new int[n][n][n];
    }
    void input()
    {
        for (int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                for(int k=0;k<n;++k)
                {
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
    }

    //Function to print the 3D array in Row-Major Format
    void print()
    {
        for (int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                for(int k=0;k<n;++k)
                {
                    if (i+j+k==(3*(n-1)))
                    {
                        System.out.print(arr[i][j][k]+" ");
                    }
                    else
                        System.out.print(arr[i][j][k]+" ");
                }
            }
        }
    }

    void rotate_backward()
    {
        int temp = arr[n - 1][n - 1][n - 1];
        int lastrep=arr[0][0][0];
        int flag = 0;
        int i = 0, j = 0, k = 0;
        int whilebreaker=0;
        while(whilebreaker!=1)
        {
            if(j==(n-1)&&i==(n-1)&&k==(n-1))
            {
                arr[i][j][k]=temp;
                whilebreaker=1;
                continue;
            }
            if(i==(n)&&k==(n))
            {
                ++j;
                flag=1;
                --i;
                --k;
            }
            else if(i==-1&&k==-1&&flag==1)
            {
                flag=0;
                ++j;
                ++i;
                ++k;
            }
            int temp2=arr[i][j][k];
            arr[i][j][k]=temp;
            temp=temp2;
            if(flag==0)
            {
                ++i;
                ++k;
            }
            else
            {
                i--;
                k--;
            }
        }
    }

    void rotate_forward()
    {
        int temp = arr[0][n - 1][n - 1];
        int flag = 0;
        int i = (n-1), j = 0, k = 0;
        int whilechecker=0;
        while(whilechecker!=1)
        {
            if(j==(n-1)&&i==0&&k==(n-1))
            {
                arr[i][j][k]=temp;
                whilechecker=1;
                continue;
            }
            if(i==-1&&k==n)
            {
                ++j;
                flag=1;
                ++i;
                --k;
            }
            else if(i==n&&k==-1&&flag==1)
            {
                flag=0;
                ++j;
                --i;
                ++k;
            }
            int temp2=arr[i][j][k];
            arr[i][j][k]=temp;
            temp=temp2;
            if(flag==0)
            {
                --i;
                ++k;
            }
            else
            {
                i++;
                k--;
            }
        }
    }


    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("");
//        System.out.print("Enter the size of the array: ");
        int n=sc1.nextInt();
//        System.out.print("Enter the number of rotations: ");
        int rotate= sc1.nextInt();
        SampleCode2 obj=new SampleCode2(n);
        obj.input();
        for (int i=0;i<rotate;++i)
        {
            obj.rotate_backward();
            obj.rotate_forward();
        }
        obj.print();
//        System.out.print("\n");
//        obj.rotate_backward();
//        obj.print();
//        obj.rotate_forward();
//        obj.print();
    }
}

