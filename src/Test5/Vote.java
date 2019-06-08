package Test5;

/**
 * .写一个统计投票程序。设有3个候选人，有10人参加选举，每个选举人输入两个候选人的编号，要求输出各个候选人的得票数。
输入描述：输入10个选举人提交的候选人编号
输出描述：输出候选人编号及对应的得票。*
要求，用map来表示投票结果。

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<10;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("输入两个候选人编号");
			for(int j=0;j<2;j++) {
				int num = input.nextInt();
				if(map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
                    map.put(num, 1);
                }
			}	
		}
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
