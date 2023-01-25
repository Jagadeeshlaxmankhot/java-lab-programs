import java.io.File;
import java.util.*;
public class FileOp {
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the file Name:");
		String fname=obj.next();
		File f=new File(fname);
		f.setWritable(true);
		System.out.println(f.exists()?"File Exists":"File does not exist");
		System.out.println(f.canWrite()?"File is Writable":"File is not Writable");
		System.out.println(f.canRead()?"File is Readable":"File is not Readable");
		String Filename=f.toString();
		int index=Filename.lastIndexOf('.');
		if(index>0){
			String type=Filename.substring(index+1);
			System.out.println("File type is:"+ type);
		}
		else
			System.out.println("File does not have type");
		System.out.println("File siz:"+f.length()+"Bytes");
		}
}
