public class Song {
    // 발표된 곡의 이름, 아티스트, 앨범이름은 바뀌지 않으므로 final을씀
    public final String songName;
    public final Artist artistName;
    public final Album albumName;

    public Song(String songName, Artist artistName, Album albumName) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    //문자열 출력 메소드
    @Override
    public String toString() {
        return songName + " - " + artistName + "\n" + albumName + "(" + albumName.year + ")" ;
    }
}
