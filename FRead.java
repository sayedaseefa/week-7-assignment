import java.io.*;
class FRead
{
public static void main(String a[])throws IOException,FileNotFoundException
{
InputStream is=new FileInputStream("FRead.java");
int size=Integer.parseInt(a[0]);
for(int i=0;i<size;i++)
System.out.println((char)is.read());
System.out.println("hi");
System.out.println("hi2");
is.close();
}
}
