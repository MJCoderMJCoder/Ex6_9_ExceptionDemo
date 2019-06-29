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
		 * System.in是InputStream流，是字节流；
		 * InputStreamReader是由System.in作为底层流构造的字符流；
		 * BufferedReader是由InputStreamReader作为前端流构造的字符缓冲流
		 */
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("输入序号（输入end结束）：");
			try {
				
				/*
				 * BufferReader增加的子方法：public String readLine() throws IOException
				 * 读取一个文本行，遇换行、回车后直接跟着换行认为某行已终止
				 * 如果已到达流末尾，则返回null
				 */
				index = inputReader.readLine();		//可能产生异常
				if(index.equals("end"))
					break;	//强行终止循环语句，结束循环；
				position = Integer.parseInt(index);		//可能产生异常
				System.out.println("元素值为：" + arr[position]); //可能产生异常
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界\n");
			} catch(NumberFormatException e) {
				System.out.println("请输入一个整数\n");
			} catch(IOException e) {
			}
		}
		System.out.println("程序运行结束");

	}

}
