package Day13_IO;

import java.io.*;
import java.util.*;

/*
 * 4. ���� ����� ���� ������ �о�� ȭ�鿡 ����� ������.
 */

public class day13_final04 {
	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("����34.data"));
			int snum = dis.readInt(); //�л� ��ȣ
			String name = dis.readUTF(); //�л� �̸�
			int kor = dis.readInt(); //���� ����
			char score = dis.readChar(); //����
			System.out.println("<���Ͽ� ����� ������>");
			System.out.println("�л� ��ȣ : "+snum);
			System.out.println("�л� �̸� : "+name);
			System.out.println("���� ���� : "+kor);
			System.out.println("���� : "+score);
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
