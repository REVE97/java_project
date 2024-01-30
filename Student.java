package class04;

public class Student {
	
	private int StdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	public Student(int stdNo2, String temp2, int kor2, int eng2, int math2, int sci2, int hist2, int total2,
			String temp9, String temp10, String temp11) 
	{
		// TODO Auto-generated constructor stub
	}
	public int getStdNo() {
		return StdNo;
	}
	public void setStdNo(int stdNo) {
		StdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHist() {
		return hist;
	}
	public void setHist(int hist) {
		this.hist = hist;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	
	@Override
	public String toString() {
		return "Student [StdNo=" + StdNo + ", email=" + email + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sci=" + sci + ", hist=" + hist + ", total=" + total + ", mgrCode=" + mgrCode + ", accCode="
				+ accCode + ", locCode=" + locCode + "]";
	}


}
