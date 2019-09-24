package ch03;

/**
 * 这个例子演示的break continue用法
 * @author cjy
 *
 */
public class BreakContinue {

	public BreakContinue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//这个例子演示的break continue用法

		label1: for (int i = 0; i < 5; i++) {
			label2: for (int j = 0; j < 5; j++) {
				if(j==3){
					//尝试把continue lable2 替换为 contiue 看看结果是否有不同
					continue label2;					
				}
				if(i==3){
					//尝试把break label1替换为 break 看看结果是否有不同					
					break label1;
					
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}

	}

}
