package java_study;

import java.util.Random;

public class LottoPlay {
	
	private LottoBall[] balls;
	
	public void setBalls(LottoBall[] balls)
	{
		this.balls =  balls;
	}
	
	/*
	public LottoBall[] getBalls()
	{
		return balls;
	}
	*/
	
	// 볼을 뽑는 행동
	public void selectBalls()
	{
		LottoBall [] selectedBalls = new LottoBall[6];
		// 공을 섞는 과정 -> 하나의 메소드
		this.shuffle();
		// 공을 하나 뽑는 과정 -> 하나의 메소드 (6번)
		LottoBall ball = null;
		for (int i=0;i<6;i++) 
		{
			ball = this.getBall();
			if(i==0)
			{
				selectedBalls[i] = ball;
				continue;
			}
			// 뽑은 공의 중복을 처리 -> 여기서 처리
			// 공이 중복인지는 가지고 있는 공을 모두 검사해야함
			boolean flag = false;
			for(int n=0;n<i;n++) 
			{
				if(ball.getNumber()==selectedBalls[n].getNumber())
				{
					flag = true;
					break;
				}
			}
			// 모두 검사한 결과를 가지고 공을 보관할 것인지 결정
			// flag = ball.isSelected();
			// 중복이면 인덱스를 하나 감소 ( 그렇게 해야지 해당 인덱스가 비는 것을 방지할 수 있음 )
			if(!flag)
			{
				selectedBalls[i] = ball;
			}
			else
			{
				i = i-1;
			}
			
		}
		
		
		System.out.println("selected balls : ");
		for(LottoBall temp : selectedBalls)
		{
			System.out.print(temp.getNumber()+" ");
		}
	
	}
	
	private LottoBall getBall()
	{
		LottoBall ball = null;
		Random r= new Random();
		int index = r.nextInt(45);
		ball = balls[index];
		return ball;
	}
	
	private void shuffle()
	{
		Random r = new Random();
		
		for(int i=0;i<10;i++) 
		{
			int index1 = r.nextInt(45);
			int index2 = r.nextInt(45);
			LottoBall temp = balls [index1];
			balls[index1] = balls[index2];
			balls[index2] = temp;
		}
		
	}

}
