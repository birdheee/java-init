package p07;

class Song{
	public int rank;
	public String title;
	public static int a;
	
	public void printTitle() {
		System.out.println("노래 제목 : " + title);
		System.out.println(a);
	}
	
	public static void printSomething() {
//		System.out.println("노래 제목 : " + title); 에러, static은 static만 사용할 수 있음
		System.out.println(a);
	}
	
	public static void main(String avgs[]) {
		Song song = new Song();
		song.title = "SAM이 부르는 애상";
		song.printTitle();
	}
}