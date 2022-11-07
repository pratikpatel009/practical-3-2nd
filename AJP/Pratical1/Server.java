import java.io.*;
import java.net.*;
public class Server
{
public static void main(String r[]) throws Exception
{
ServerSocket s1 = new ServerSocket(80);
Socket s = s1.accept();
DataInputStream i = new DataInputStream(s.getInputStream());
DataOutputStreamo = new DataOutputStream(s.getOutputStream());
int a= i.read();
int b= i.read();
int sum=a+b;
o.write(sum);
System.out.println("Endof Program");
i.close();
o.close();
s1.close();
}
}