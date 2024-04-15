class PrintNumbers{
	public static void printNumber(int start, int end) {
		if (start <= end) {
		System.out.println(start);
		printNumber(start + 1, end);
	}
	}
		public static void main(String[] args) {
		int i=1;
		int n=10;
		printNumber(i,n);
	}
	}
