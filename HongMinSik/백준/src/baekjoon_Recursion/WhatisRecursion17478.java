package baekjoon_Recursion;
import java.util.Scanner;

public class WhatisRecursion17478 {
	static int i = 0;
	public static void Recursion(int num) {
		if(num == 0) {
			System.out.println("_".repeat(4 * i) + "\"����Լ��� ������?\"\n" + "_".repeat(4 * i) + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			return;
		}
		System.out.println("_".repeat(4 * i) + "\"����Լ��� ������?\"");
		System.out.println("_".repeat(4 * i) + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println("_".repeat(4 * i) + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println("_".repeat(4 * i) + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		i++;
		Recursion(num - 1);
		System.out.println("_".repeat(4*i) + "��� �亯�Ͽ���.");
		i--;
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		Recursion(num);
		System.out.println("��� �亯�Ͽ���.");
	}


}
