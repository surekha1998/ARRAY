public class Merge
{
 public static void main(String args[])
 {
 int a[]={2,3};
 int b[]={4,5,8};
 int x[]=new int[a.length + b.length];
 for(int i=0;i< a.length; i=i+1)
 {
    x[i]=a[i];
 }
 for(int i=0;i< b.length;i=i+1)
 {
  x[a.length + i]= b[i];
 }
 for(int i=0;i< x.length;i=i+1)
 {
 System.out.println(x[i]);
 }
}
}

