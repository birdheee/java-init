package p08;
/* 인터페이스는 표준을 제정함
 * 다형성을 위해서 존재
 * 인터페이스는 선언만 함(바디가 존재하지 않음, 단 1.8 이후부터 static과 default는 바디를 가지고 있음)
 * 클래스는 이것들을 구현함 */
public interface Remote {
	public void on();
	public void off();
}