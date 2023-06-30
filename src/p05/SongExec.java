package p05;

public class SongExec {
	
	public static void printSongs(Song[] songs) {
		for(Song s : songs) {
			System.out.println("노래 제목 : " + s.name);
			System.out.println("아티스트 : " + s.singer);
			System.out.println("순위 : " + s.rank);
		}
	}
	
	public static void getRank(Song[] songs) {
		Song fsong = songs[0];
		Song lsong = songs[0];
		
		for(int i=1; i<songs.length; i++) {
			if(fsong.rank>songs[i].rank) {
				fsong = songs[i];
			}
			if(lsong.rank<songs[i].rank) {
				lsong = songs[i];
			}
		}
		System.out.println("1등은 " + fsong.singer + "의 " + fsong.name);
		System.out.println("꼴등은 " + lsong.singer + "의 " + lsong.name);
	}

	public static void main(String[] args) {
		//이렇게도 할 수 있음
		Song[] songs = new Song[5];
		
		songs[0] = new Song();
		songs[0].name = "부동의 첫사랑";
		songs[0].singer = "10CM";
		songs[0].rank = 14;
		
		songs[1] = new Song();
		songs[1].name = "S AM";
		songs[1].singer = "샘이브";
		songs[1].rank = 4;
		
		songs[2] = new Song();
		songs[2].name = "Hype Boy";
		songs[2].singer = "NewJeans";
		songs[2].rank = 12;
		songs[3] = new Song();
		songs[3].name = "모래 알갱이";
		songs[3].singer = "샘틀리";
		songs[3].rank = 50;
		
		songs[4] = new Song();
		songs[4].name = "Spicy";
		songs[4].singer = "aespa";
		songs[4].rank = 6;
		
//		printSongs(songs);
		getRank(songs);
	}

}
