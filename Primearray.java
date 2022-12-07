public class Primearray
{
 public static void main(String args[])
 {
  int a[]={3,5,2,6,13,24,82,15,11};
  for(int i=0;i<a.length;i++)
  {
 boolean flag=false;
      for(int j=2;j<a[i];j++)
      {
      if(a[i]%j==0)
      {
        flag=true;
      }
}
if(flag)
{
    System.out.println(a[i] + " is not a primeNumber");
}
else
{
    System.out.println(a[i] + " is primeNumber");
}
}
}
}
