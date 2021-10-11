package Day12_IO;

import java.io.*;

/*
 * 3. 파일복사 프로그램을 만들어 보세요. (FileReader/FileWriter사용) 
 */

public class day12_final03 {
	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("upper_test.txt");
			fw=new FileWriter("upper_test_copy.txt");
			System.out.println("파일 열기 성공!");
			while (true) {
				int a = fr.read();
				if (a == -1) break;
				fw.write(a);
				fw.flush();
			}
			fw.close();
			fr.close();
			System.out.println("복사 파일로 저장 완료!");
		} catch (FileNotFoundException e) {
			System.out.println("오류! : "+e.getMessage());
		} catch (IOException ie) {
			System.out.println("오류!! : "+ie.getMessage()) ;
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException ioe) {
				System.out.println("파일 열기 실패! : "+ioe.getMessage());
			}
		}
	}
}
