import java.io.*;
import java.net.*;
public class Client
{
public static void main(String r[]) throws Exception
{
int a,b,sum;
Socket s = new Socket("localhost",80);
DataInputStream i = new DataInputStream(s.getInputStream());
DataOutputStreamo = new DataOutputStream(s.getOutputStream());
a= Integer.parseInt(r[0]);
b=Integer.parseInt(r[1]);
o.write(a);
o.write(b);
sum=i.read();
System.out.println("Addition " +a+"+"+b+" = "+sum);
i.close();
o.close();
s.close();
}
}
