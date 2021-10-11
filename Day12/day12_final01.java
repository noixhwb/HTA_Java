package Day12_IO;

import java.io.*;
import java.util.Scanner;

/*
 * 1. 영문으로 키보드로 문자열을 입력받아 test.txt파일로 저장하는 프로그램을 작성
 */

public class day12_final01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FileWriter fw=null;
		try {
			fw=new FileWriter("test.txt");
			System.out.println("영문으로 문자를 입력하세요");
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			fw.write(str1+"\n"+str2);
			fw.flush();
			fw.close();
			System.out.println("파일로 저장 완료!");
		} catch (IOException ie){
			System.out.println("파일로 저장 오류! "+ie.getMessage());
		}
		
		scan.close();
	}
}
