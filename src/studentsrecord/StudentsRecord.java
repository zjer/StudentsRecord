package studentsrecord;

import java.util.Scanner;

public class StudentsRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ��������");
		int numbers = sc.nextInt();
		System.out.print("������γ���Ŀ��");
		int courses = sc.nextInt();
		String[] name = new String[numbers];
		String[] course = new String[courses];
		int[][] score = new int[numbers][courses];
		int[] sum = new int[numbers];
		double[] average = new double[numbers];
		String[] str = new String[numbers];
		
		// ������еĿγ�����
		for (int i = 0; i < course.length; i++) {
			System.out.print("�������" + (i + 1) + "�ſγ̵����ƣ�");
			course[i] = sc.next();
		}
		// ÿ��ѧ�������Լ���ѧ�γ�
		for (int i = 0; i < name.length; i++) {
			System.out.print("�������" + (i + 1) + "��ѧ��������");
			name[i] = sc.next();
			for (int j = 0; j < course.length; j++) {
				System.out.print("������" + name[i] + "��" + course[j] + "�ɼ���");
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("ѧ��");
		for (int i = 0; i < course.length; i++) {
			System.out.print("\t" + course[i]);
		}
		System.out.println("\t" + "�ܷ�" + "\t" + "ƽ����" + "\t" + "���а�");
		// ÿ��ѧ���γ̳ɼ�
		for (int i = 0; i < name.length; i++) {
			int total = 0;
			String st1 = "";
			for (int j = 0; j < course.length; j++) {
				total += score[i][j];
				st1 += score[i][j] + "\t";
			}
			sum[i] = total;
			average[i] = total / numbers;
			str[i] = name[i] + "\t" + st1 + sum[i] + "\t" + average[i] +"\t";
			// System.out.println(str[i]);
		}
		// ����ƽ���ֵ���λ��
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length - 1; j++) {
				if (sum[j] < sum[j + 1]) {
					int temp = sum[j];
					sum[j] = sum[j + 1];
					sum[j + 1] = temp;
					String st2 = str[j];
					str[j] = str[j + 1];
					str[j + 1] = st2;
				}
			}
			System.out.println(str[i] + "��" + (i + 1) + "��");
		}
	}

}
