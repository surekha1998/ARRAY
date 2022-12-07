public class Nonrepeated
{
 public static void main(String args[])
 {
  int a[]={7,2,3,4,3,2};
 abc:for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a.length;j++)
   {
    if(a[i]!=a[j])
    {
        System.out.println(a[i]);
        break abc;
    }
  }
}
}
}
