import java.io.BufferedWriter;
import java.io.File;    // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;   // Import the IOException class to handle errors

 

public class Main
{
	public static void main(String[] args) {
	 html a = new html();
	 String tag= a.open("html")+a.open("head")+a.open("title")+"Welcome to my page"+a.close("title")+a.open("body")+a.open("h")+"THIS IS A HTML FILE USING JAVA"+a.close("h")+a.open("br")+a.close("b")+a.open("button")+"CLICL ME FOR MORE"+a.close("button")+a.close("head")+a.close("html");
	  File file= new File("/Users/User/Desktop/task/html generator/htmlfile.html");
	 
try {
     BufferedWriter wr = new BufferedWriter (new FileWriter(file));
     wr.write(tag);
     wr.close();
     System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	
	}

}
