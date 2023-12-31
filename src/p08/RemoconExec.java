package p08;

public class RemoconExec {
	public static void main(String[] args) {
		/* TVRemocon, AirconRemocon 클래스는 Remocon을 상속받고 있고,
		 * Remocon은 Remote를 구현한 클래스
		 * 따라서 데이터 타입이 상위인 Remote 배열로 선언 가능
		 * */
		Remote[] remotes = new Remote[2];
		remotes[0] = new AirconRemocon(); // 업캐스팅
		remotes[1] = new TVRemocon();
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].on();
			remotes[i].off();
			if(remotes[i] instanceof AirconRemocon) {
				AirconRemocon ar = (AirconRemocon)remotes[i]; // 다운캐스팅
				ar.tempUp(); // 호출 가능
				ar.tempDown();
			}else if(remotes[i] instanceof TVRemocon){
				TVRemocon tr = (TVRemocon)remotes[i]; // 다운캐스팅
				tr.chUp();
				tr.chDown();
			}
		}
	}

}