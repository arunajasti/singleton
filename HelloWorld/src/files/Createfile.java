package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) 
	{
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("D:\\file2.txt");
			int ch;
			System.out.println("Type the Text");
			while((ch=System.in.read())!=-1)
			{
				fos.write(ch);
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
				fos.close();
			}catch (IOException e){
			e.printStackTrace();
			}
		}
	}
}