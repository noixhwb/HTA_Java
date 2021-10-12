package Day13_IO;

import java.io.*;
import java.util.*;

/*
 * 4. 위의 저장된 파일 정보를 읽어와 화면에 출력해 보세요.
 */

public class day13_final04 {
	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("과제34.data"));
			int snum = dis.readInt(); //학생 번호
			String name = dis.readUTF(); //학생 이름
			int kor = dis.readInt(); //국어 점수
			char score = dis.readChar(); //학점
			System.out.println("<파일에 저장된 데이터>");
			System.out.println("학생 번호 : "+snum);
			System.out.println("학생 이름 : "+name);
			System.out.println("국어 점수 : "+kor);
			System.out.println("학점 : "+score);
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
