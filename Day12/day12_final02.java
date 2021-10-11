package Day12_IO;

import java.io.*;

/*
 * 2. ���α׷��� �����ϸ� test.txt������ ��� ������ �빮�ڷ� ��ȯ��
      upper_test.txt���Ͽ� ����ǵ��� ����� ������.

 ## test.txt
 hello!
 my name is hong gil dong.

 ==> ���α׷� ������ upper_test.txt���Ͽ� �Ʒ�ó�� ����ȴ�.
 HELLO!
 MY NAME IS HONG GIL DONG.

 */

public class day12_final02 {
	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("test.txt");
			fw=new FileWriter("upper_test.txt");
			System.out.println("���� ���� ����!");
			while (true) {
				int a = fr.read();
				if (a == -1) break;
				//System.out.print((char)a);
				String aa = String.valueOf((char)a);
				//System.out.print(aa.toUpperCase());
				fw.write(aa.toUpperCase());
				fw.flush();
			}
			fw.close();
			fr.close();
			System.out.println("���Ϸ� ���� �Ϸ�!");
		} catch (FileNotFoundException e) {
			System.out.println("���� : "+e.getMessage());
		} catch (IOException ie) {
			System.out.println("���� : "+ie.getMessage());
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException ioe) {
				System.out.println("���� ���� ����! "+ioe.getMessage());
			}
		}
	}
}
