package baekjoon;

import java.util.Scanner;

public class q2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재시간입력");
		int hour  = sc.nextInt();
		int minute = sc.nextInt();
		int cooktime = sc.nextInt();
		
		int time = cooktime + minute ;
		
		// 만약 현재의 분 과 소요시간을 더했을 때, 60보다 크면 '현재시간의 분+소요시간 - 60' 하고 시 값에 + 2시간 해주기 
		if(time > 60)
			time -= 60;
			hour += 
	}
}
