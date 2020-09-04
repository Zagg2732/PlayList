import java.util.ArrayList;

public class Album {
    //앨범 생성자. 앨범의 제목, 발매연도, 아티스트이름은 바뀔일이 없으므로 final을 씀
    public final String title;
    public final int year;
    public final Artist artist;

    public Album(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }
    //Album의 trakList 생성
    private final ArrayList<Song> trackList = new ArrayList<>();

    //trackList에 track을 추가하는 메소드 addTrack
    public void addTrack(Song track) {
        trackList.add(track);
    }

    public Song getTrack(int trackNumber) {
        if (trackNumber < 1 || trackNumber > trackList.size()){  // 트랙리스트 범위를 벗어나면 null
            return null;
        }
        return trackList.get(trackNumber - 1); // 트랙 리스트는 1번부터 시작함
    }

    public ArrayList<String> getAllTrack(){
        ArrayList<String> allTrack = new ArrayList<>();
        for (int i = 1; i < trackList.size() +1 ; i++){
            allTrack.add(i + "번째 트랙 : " +getTrack(i) + "\n");
        }
        return allTrack;
    }

    //문자열 출력 메소드
    @Override
    public String toString() {
        return title;
    }
}
