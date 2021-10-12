package Day13_IO;

import java.io.*;
import java.util.*;
import Test.ScoreCal;

/*
 * 3. 학생번호,이름,국어점수입력받아 학점계산해서 DataOutputStream이용해서 파일로 저장하세요.
	  (파일에 학생번호,이름,국어,학점저장)
 */

public class day13_final03 {
	public static void main(String[] args) {
		int snum = 67; //학생 번호
		String name = "하지"; //학생 이름
		int kor = 90; //국어 점수
		char score=' '; //학점
		if (kor >= 90) {
			score = 'A';
		} else if (kor >= 80) {
			score = 'B';
		} else if (kor < 80) {
			score ='C';
		}
		
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("과제34.data"));
			dos.writeInt(snum);
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeChar(score);
			dos.close();
			System.out.println("파일로 저장 완료!");
		} catch (IOException ie) {
			System.out.println("오류 : "+ie.getMessage());
		}
	}
}
