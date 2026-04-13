package FIleHanfling;

import java.io.File;

public class DeleteEx {

	public static void main(String[] args) throws Exception{
		File obj=new File("class.txt");
		if(obj.delete()) {
			System.out.println("File Is Deleted....!!!");
		}else {
			System.out.println("File is Not Fecthing.....");
		}

	}
}
