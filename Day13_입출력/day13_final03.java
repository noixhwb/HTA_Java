package Day13_IO;

import java.io.*;
import java.util.*;
import Test.ScoreCal;

/*
 * 3. �л���ȣ,�̸�,���������Է¹޾� ��������ؼ� DataOutputStream�̿��ؼ� ���Ϸ� �����ϼ���.
	  (���Ͽ� �л���ȣ,�̸�,����,��������)
 */

public class day13_final03 {
	public static void main(String[] args) {
		int snum = 67; //�л� ��ȣ
		String name = "����"; //�л� �̸�
		int kor = 90; //���� ����
		char score=' '; //����
		if (kor >= 90) {
			score = 'A';
		} else if (kor >= 80) {
			score = 'B';
		} else if (kor < 80) {
			score ='C';
		}
		
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("����34.data"));
			dos.writeInt(snum);
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeChar(score);
			dos.close();
			System.out.println("���Ϸ� ���� �Ϸ�!");
		} catch (IOException ie) {
			System.out.println("���� : "+ie.getMessage());
		}
	}
}
