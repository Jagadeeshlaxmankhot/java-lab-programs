import java.util.*;
import java.io.File;
public class exp11{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String fname=in.next();
		File f=new File(true);
		f.setWritable(true);
		System.out.println(f.exists()?"File Exists" : "File doesn't Exists");
		System.out.println(f.canwrite()?"File is Writable":"File isn't writable");
		System.out.println(f.canread()?"File is Readable":"File is not readable");
		String filename=f.toString();
		int index=filename.lastIndexof('.');
		if(index>0){
			String type=filename.substring(index+1);
			SYstem.out.println("File type is : " type);
		}
		else
			System.out.println("File doesnt have type ");
		System.out.println("File size : "+f.length()+" Bytes.");
	}
}