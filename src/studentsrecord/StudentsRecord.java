package studentsrecord;

import java.util.Scanner;

public class StudentsRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int numbers = sc.nextInt();
		System.out.print("请输入课程数目：");
		int courses = sc.nextInt();
		String[] name = new String[numbers];
		String[] course = new String[courses];
		int[][] score = new int[numbers][courses];
		int[] sum = new int[numbers];
		double[] average = new double[numbers];
		String[] str = new String[numbers];
		
		// 输出所有的课程名称
		for (int i = 0; i < course.length; i++) {
			System.out.print("请输入第" + (i + 1) + "门课程的名称：");
			course[i] = sc.next();
		}
		// 每个学生名字以及所学课程
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生姓名：");
			name[i] = sc.next();
			for (int j = 0; j < course.length; j++) {
				System.out.print("请输入" + name[i] + "的" + course[j] + "成绩：");
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("学生");
		for (int i = 0; i < course.length; i++) {
			System.out.print("\t" + course[i]);
		}
		System.out.println("\t" + "总分" + "\t" + "平均分" + "\t" + "排行榜");
		// 每个学生课程成绩
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
		// 根据平均分调整位置
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
			System.out.println(str[i] + "第" + (i + 1) + "名");
		}
	}

}
