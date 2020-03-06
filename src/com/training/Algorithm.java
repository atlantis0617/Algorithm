package com.training;

import java.util.Scanner;

/**  

* <p>Title: Algorithm</p>  

* <p>Description: 算法练习</p>  

* @author huayang.yuan  

* @date 2020年3月5日  

*/  
public class Algorithm {
	
	
	public static void main(String[] args) {
		
		//算法应用之百钱买百鸡
//		calculateChicken();
		
		//算法应用之韩信点兵
//		hanXin();
		
		//算法应用之斐波那契数列
		fbola();
		
		
		
	}
	
	private static void fbola() {
		Scanner s=new Scanner(System.in);
        System.out.println("请输入你想查看的斐波那契数列个数：");
        int num=s.nextInt();
        System.out.println("你想看的斐波那契数列：");
        fbo(num);
	}

	/**  
	
	 * <p>Title: fbo</p>  
	
	 * <p>Description: 说明：斐波那契数列的定义：它的第一项和第二项均为1，以后各项都为前两项之和</p>  
	  
	
	 */  
	private static void fbo(int x) {
		
		int f1=1,f2=1,i=3;
		if(x ==1) {
			System.out.println(f1);
		}
		if(x == 2) {
			System.out.println(f1+" "+f2);
		}
		if(x >= 3) {
			System.out.print(f1+"  "+f2);
			while(x >= i) {
				f1 = f1+f2;
				System.out.println(" "+f1);
				i++;
				f2 = f2+f1;
				System.out.print(" "+f2);
			}
		}
	}

	/**  
	
	 * <p>Title: hanXin</p>  
	
	 * <p>Description: 案列说明：韩信带兵不足百人，3人一行排列多一人，7人一行排列少两人，5人一行正好，本例是计算韩信究竟点了多少兵？
		想法：对于韩信点兵算法，只需将7人少2人转换7人多5人，这样解决问题的方法就很明显了，再限定人数不多于100即可。</p>  
	
	 */  
	private static void hanXin() {
		
		int a=0,b=0,c=0,preson;      //定义总人数和各种站法的剩余人数
		
		for(preson=0;preson<100;preson++){
	            a=preson%3;              //每排三人剩余人数
	            b=preson%7;              //每排七人的剩余人数
	            c=preson%5;              //每排五人的剩余人数
	            if(a==1&&b==5&&c==0){     //都符合条件时的人数
	                System.out.println("韩信带的兵数是："+preson);
	            }
        }
		
	}

	/**
	 * 案列说明：主要内容是：公鸡5元一只，母鸡3元一只，小鸡1元三只，问100元怎样可以买100鸡？
	 * 思想：想要实现此算法，只要明白各种条件的关系即可，而且知道公鸡最多买20只，母鸡最多买33只，小鸡最多买100只，这样买各种鸡的钱总为100,元，鸡的只数也是100；
	 * */
	private static void calculateChicken() {
		//买公鸡可以买20只
		for (int i = 0; i < 20; i++) {
			//卖母鸡可以买33只
			for (int j = 0; j < 34; j++) {
				//剩下的买小鸡的数量
				int temp = 100-i-j;
				int p = temp%3;
				if((5*i+j*3+temp/3)==100 && p==0) {
					System.out.print("    可以买公鸡的只数："+i);
                    System.out.print("    可以买母鸡的只数："+j);
                    System.out.print("    可以买小鸡的只数："+temp);
                    System.out.println("\n");
				}
			}
		}
	}

}
