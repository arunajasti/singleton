package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("D:\\file1.txt");
			int ch;
			System.out.println("Read the Text");
			while((ch=fis.read())!=-1)
			{
				//System.out.println(ch); the output will comes ascii code so convert ascii into char
				//System.out.println((char)ch);//the o/p will comes letter by letter so chane println into print
				System.out.print((char)ch);
			}
			System.out.println("File created...");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e){
         e.printStackTrace();
		}
		finally
		{
			try{
				fis.close();
			}catch (IOException e){
			e.printStackTrace();
			}
		}
	}
}
