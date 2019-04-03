package lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\JAVA\\programs\\java.txt");
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader is=new InputStreamReader(fi);
		BufferedReader reader=new BufferedReader(is);
		String line;
		int countWord=0;
		int countLine=0;
		int countChar=0;
		while((line=reader.readLine())!=null)
		{
			if(!(line.equals("")))
			{
				countChar+=line.length();
				String []s=line.split("\\s+");
				countWord+=s.length;
			}
			countLine++;
		}
		System.out.println("Word == "+countWord);
		System.out.println("Character == "+countChar);
		System.out.println("Line == "+countLine);
		
	}

}
