package lib;

public class Calculation_lib {

	private int m, n;    //フィールドを用意

	public Calculation_lib(int m, int n) {
		this.m = m;     //フィールドを初期化
		this.n = n;
	}
	
	public int getPlus(){
		return m+n;     //関数としてmain関数から呼び出す
	}
	
	public int getMinus(){
		return m-n;
	}
	
	public int getProduct(){
		return m*n;
	}
	
	public int getDivide(){
		return m/n;
	}
	
	public int getMod(){
		return m%n;
	}
}
