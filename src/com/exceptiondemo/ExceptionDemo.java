package com.exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[] = {100, 200, 300, 400, 500, 600};
		String index;
		int position;
		
		/*
		 * System.in��InputStream�������ֽ�����
		 * InputStreamReader����System.in��Ϊ�ײ���������ַ�����
		 * BufferedReader����InputStreamReader��Ϊǰ����������ַ�������
		 */
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("������ţ�����end��������");
			try {
				
				/*
				 * BufferReader���ӵ��ӷ�����public String readLine() throws IOException
				 * ��ȡһ���ı��У������С��س���ֱ�Ӹ��Ż�����Ϊĳ������ֹ
				 * ����ѵ�����ĩβ���򷵻�null
				 */
				index = inputReader.readLine();		//���ܲ����쳣
				if(index.equals("end"))
					break;	//ǿ����ֹѭ����䣬����ѭ����
				position = Integer.parseInt(index);		//���ܲ����쳣
				System.out.println("Ԫ��ֵΪ��" + arr[position]); //���ܲ����쳣
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�����±�Խ��\n");
			} catch(NumberFormatException e) {
				System.out.println("������һ������\n");
			} catch(IOException e) {
			}
		}
		System.out.println("�������н���");

	}

}
