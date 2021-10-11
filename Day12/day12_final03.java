package Day12_IO;

import java.io.*;

/*
 * 3. ���Ϻ��� ���α׷��� ����� ������. (FileReader/FileWriter���) 
 */

public class day12_final03 {
	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("upper_test.txt");
			fw=new FileWriter("upper_test_copy.txt");
			System.out.println("���� ���� ����!");
			while (true) {
				int a = fr.read();
				if (a == -1) break;
				fw.write(a);
				fw.flush();
			}
			fw.close();
			fr.close();
			System.out.println("���� ���Ϸ� ���� �Ϸ�!");
		} catch (FileNotFoundException e) {
			System.out.println("����! : "+e.getMessage());
		} catch (IOException ie) {
			System.out.println("����!! : "+ie.getMessage()) ;
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException ioe) {
				System.out.println("���� ���� ����! : "+ioe.getMessage());
			}
		}
	}
}
