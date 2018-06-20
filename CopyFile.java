import java.io.*;
import java.util.*;

class CopyFile{
 public static void main(String[] args) throws IOException{

 FileReader fr=new FileReader("C:\\Users\\student\\Desktop\\filecopy\\abc.txt");
 FileWriter fw=new FileWriter("C:\\Users\\student\\Desktop\\filecopy\\xyz.txt");
 int a;
 
 
 while((a=fr.read())!=-1){
 fw.write(a);
 System.out.print((char)a);
}
 fw.flush();
}
}