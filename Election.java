import java.util.Scanner;
public class Election
{
  
public int partition(int start,int end,int[] A)
{
int x=A[end];
int i=start-1;
 for(int j=start;j<end;j++)
 {
 if(A[j]<=x)
 {
 i=i+1;
  int temp=A[j];
   A[j]=A[i];
   A[i]=temp;
 }
 }
 A[end]=A[i+1];
 A[i+1]=x;
  return (i+1);
}
public void Quicksort(int beg,int end,int[] A)
{ int q;
if(beg<end)
{
q=partition(beg,end,A);
  Quicksort(beg,q-1,A);
  Quicksort(q+1,end,A);
}

}
  
public static void main(String args[])
{
Election obj=new Election(); 
  
int an,bn,cn,dn,en;
Scanner sc=new Scanner(System.in);
an=sc.nextInt();
bn=sc.nextInt();
cn=sc.nextInt();
dn=sc.nextInt();
en=sc.nextInt();
int[] a=new int[an];
int[] b=new int[bn];
int[] c=new int[cn];
int[] d=new int[dn];
int[] e=new int[en];

for(int i=0;i<an;i++)
{
a[i]=sc.nextInt();
}
  for(int i=0;i<bn;i++)
{
b[i]=sc.nextInt();
}
  for(int i=0;i<cn;i++)
{
c[i]=sc.nextInt();
}
  for(int i=0;i<dn;i++)
{
d[i]=sc.nextInt();
}
  for(int i=0;i<en;i++)
{
e[i]=sc.nextInt();
}

obj.Quicksort(0,an-1,a);
obj.Quicksort(0,bn-1,b);
obj.Quicksort(0,cn-1,c);
obj.Quicksort(0,dn-1,d);
obj.Quicksort(0,en-1,e);
  
  
  int[] kn=new int[an+bn];
  int[] jn=new int[cn+dn];
  
kn=obj.Merge(a,b);

jn=obj.Merge(c,d);
  
int[] ln=new int[kn.length+jn.length];

ln=obj.Merge(kn,jn);
  
int[] last=new int[ln.length+en];
last=obj.Merge(ln,e);  
  int x=last.length;
int[] count=new int[x];
  int o=0;
  for(int i=0;i<count.length;i++)
  {
  count[i]=0;
  }
for(int i=0;i<x-1;i++)
{ 
 
  
  if(last[i]==last[i+1])
{
    count[o]=count[o]+1;
}
 else
 {
   
   o++;
 
 }
}
  
  
int my=0;
for(int i=0;i<o;i++)
{ 
if(count[i]>=2)
{
 
 my=my+1;
}

}
  
System.out.println(my); 
  
  
}
  public int[] Merge(int a[],int[] b)
  { int al=a.length;
    int bl=b.length;
    int[] Arr=new int[al+bl];
    int i=0,j=0,k=0;
   
    while(i<al&&j<bl)
    {
      
    if(a[i]<b[j])
    {
    Arr[k]=a[i];
      i++;
    }
      else
      {
       Arr[k]=b[j];
        j++;
      
      }
      k++;
    }
   if(i>=al)
   {
   for(int p=j;p<bl;p++)
   {
   Arr[k]=b[p];
   k++;
   }
   
   }
   else
   {
    for(int p=i;p<al;p++)
   {
   Arr[k]=a[p];
   k++;
   }
   
   }
     
   return Arr; 
  }
  
}
