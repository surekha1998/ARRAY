public class Perfectarray
{
  public static void main(String args[])
  {
   
    int a[]={6,22,28,65,14};
    for(int i=0;i<a.length;i++)
    {
      int sum=0;
      for(int j=1;j<=a[i]/2;j++)
      {
        if(a[i]%j==0)
        {
             sum = sum+j;
        }
      }

if(a[i]==sum)
{
    System.out.println(a[i]+ "perfect number");
}
else
{
    System.out.println(a[i]+ "not perfect number");
}
}
}
}
