package Day12_IO;

import java.io.*;

/*
 * 2. 프로그램을 실행하면 test.txt파일의 모든 내용을 대문자로 변환해
      upper_test.txt파일에 저장되도록 만들어 보세요.

 ## test.txt
 hello!
 my name is hong gil dong.

 ==> 프로그램 실행후 upper_test.txt파일에 아래처럼 저장된다.
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
			System.out.println("파일 열기 성공!");
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
			System.out.println("파일로 저장 완료!");
		} catch (FileNotFoundException e) {
			System.out.println("오류 : "+e.getMessage());
		} catch (IOException ie) {
			System.out.println("오류 : "+ie.getMessage());
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException ioe) {
				System.out.println("파일 열기 실패! "+ioe.getMessage());
			}
		}
	}
}
