import java.util.ArrayList;

public class Artist {
    //Artist 이름. Artist 예명이 바뀌어도 발표된 곡의 Artist예명은 바뀌지 않으므로 final을 써줌
    public final String name;

    public Artist(String name) {
        this.name = name;
    }

    //Artist가 발매한 앨범 List 작성
    private final ArrayList<Album> albumList = new ArrayList<>();

    //Artist가 발매한 앨범 List를 추가하는 메소드
    public void addAlbum(Album album){
        albumList.add(album);
    }
    //Artist가 발매한 앨범리스트 호출
    public ArrayList<Album> getAlbums(){
        return albumList;
    }

    //문자열 출력 메소드
    @Override
    public String toString() {
        return name;
    }
}
