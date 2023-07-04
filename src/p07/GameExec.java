package p07;

public class GameExec {
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.exit();
	}
	
	public static void main(String[] args) {
		Game leageOfLegend = new LeageOfLegend();
		leageOfLegend.name = "리그 오브 레전드";
		leageOfLegend.price = 5000;
		leageOfLegend.genre = "AOS";
		runGame(leageOfLegend);
		
		Game mapleStory = new MapleStory();
		mapleStory.name = "메이플 스토리";
		mapleStory.price = 10000;
		mapleStory.genre = "MMORPG";
		runGame(mapleStory);
		
		Game[] games = new Game[2];
		games[0] = leageOfLegend;
		games[1] = mapleStory;
		
		for(int i=0; i<games.length; i++) {
			if(games[i] instanceof LeageOfLegend) {
				LeageOfLegend lol = (LeageOfLegend)games[i];
				lol.company = "라이엇게임즈";
				System.out.println(lol.company);
			}else if(games[i] instanceof MapleStory) {
				MapleStory ms = (MapleStory)games[i];
				ms.company = "넥슨";
				System.out.println(ms.company);
			}
		}
		
	}

}
