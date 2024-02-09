package java_study;

public class Studio {

	private LottoPlay machine;
	
	public static void main(String[] args) {
		
		Studio mbc = new Studio();
		mbc.readyOnAir();
		mbc.onAir();
		
		

	}
	
	public void readyOnAir()
	{
		// 기계 준비 ( 볼을 가진 )
		
		machine = new LottoPlay();
		LottoBall[] balls = this.readyBall();
		machine.setBalls(balls);
	}
	
	public void onAir()
	{
		// 방송시작
		this.startMachine();
	}
	
	public void startMachine()
	{
		// 로또 추첨 시작
		
		machine.selectBalls();
	}
	
	public LottoBall[] readyBall()
	{
		// LottoBall 준비
		
		LottoBall[] ballBox = new LottoBall[45];
		for (int i = 0; i<45; i++)
		{
			ballBox[i] = new LottoBall(i+1);
		}
		
		return ballBox;
	}

}
