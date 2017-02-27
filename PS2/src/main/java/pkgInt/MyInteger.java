package pkgInt;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven(){
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if (iValue % 2 == 0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime(){
		for(int i=2;i < iValue;i++){
			if (iValue % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int x){
		if (x % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int x){
		if (x % 2 == 0)
			return false;
		else
			return true;		
	}
	
	public static boolean isPrime(int x){
		for(int i=2;i < x;i++){
			if (x % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger mi){
		if (mi.getiValue() % 2 == 0)
			return true;
		else
			return false;		
	}
	
	public static boolean isOdd(MyInteger mi){
		if (mi.getiValue() % 2 == 0)
			return false;
		else
			return true;			
	}
	
	public static boolean isPrime(MyInteger mi){
		for(int i=2;i < mi.getiValue();i++){
			if (mi.getiValue() % i == 0)
				return false;
		}
		return true;		
	}
	
	public boolean equals(int x){
		if (x == iValue)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger mi){
		if (mi.getiValue() == iValue)
			return true;
		else
			return false;
	}
	
}
