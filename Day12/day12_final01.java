package Day12_IO;

import java.io.*;
import java.util.Scanner;

/*
 * 1. �������� Ű����� ���ڿ��� �Է¹޾� test.txt���Ϸ� �����ϴ� ���α׷��� �ۼ�
 */

public class day12_final01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FileWriter fw=null;
		try {
			fw=new FileWriter("test.txt");
			System.out.println("�������� ���ڸ� �Է��ϼ���");
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			fw.write(str1+"\n"+str2);
			fw.flush();
			fw.close();
			System.out.println("���Ϸ� ���� �Ϸ�!");
		} catch (IOException ie){
			System.out.println("���Ϸ� ���� ����! "+ie.getMessage());
		}
		
		scan.close();
	}
}
