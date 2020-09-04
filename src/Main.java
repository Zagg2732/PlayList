public class Main {

    public static void main(String[] args) {

        //아티스트 생성
        Artist IU = new Artist("IU");

        //앨범 생성
        Album LovePoem = new Album("LovePoem", 2019, IU);

        //앨범에 트랙 리스트 추가
        LovePoem.addTrack(new Song("unlucky", IU, LovePoem));
        LovePoem.addTrack(new Song("그 사람", IU, LovePoem));
        LovePoem.addTrack(new Song("Blueming", IU, LovePoem));
        LovePoem.addTrack(new Song("시간의 바깥", IU, LovePoem));
        LovePoem.addTrack(new Song("자장가", IU, LovePoem));
        LovePoem.addTrack(new Song("Love poem", IU, LovePoem));

        Album chatShire  = new Album("CHAT-SHIRE", 2015, IU);

        chatShire.addTrack(new Song("새 신발", IU, chatShire));
        chatShire.addTrack(new Song("Zeze", IU, chatShire));
        chatShire.addTrack(new Song("스물셋", IU, chatShire));
        chatShire.addTrack(new Song("푸르던", IU, chatShire));
        chatShire.addTrack(new Song("Red Queen (Fear. Zion.T)", IU, chatShire));
        chatShire.addTrack(new Song("무릎", IU, chatShire));
        chatShire.addTrack(new Song("안경", IU, chatShire));

        //Artist에 Album 추가. albumList 형태로 추가됨
        IU.addAlbum(LovePoem);
        IU.addAlbum(chatShire);

        //다른 아티스트도 추가
        Artist bts = new Artist("방탄소년단");

        Album darkAndWild = new Album("DARK & WILD", 2014, bts);
        darkAndWild.addTrack(new Song("Intro: What am I to You", bts, darkAndWild));
        darkAndWild.addTrack(new Song("Danger", bts, darkAndWild));

        Album wings = new Album("WINGS", 2016, bts);
        wings.addTrack(new Song("Intro: Boy Meets Evil", bts, wings));
        wings.addTrack(new Song("피 땀 눈물", bts, wings));
        wings.addTrack(new Song("Begin", bts, wings));
        wings.addTrack(new Song("Lie", bts, wings));

        //앨범 추가
        bts.addAlbum(darkAndWild);
        bts.addAlbum(wings);

        //IU에 등록된 첫 번째 앨범의 3번 트랙 정보
        System.out.println(IU.getAlbums().get(0).getTrack(3).toString());
        System.out.println();
        //bts에 등록된 두 번째 앨범의 4번 트랙 정보
        System.out.println(bts.getAlbums().get(1).getTrack(4).toString());
        System.out.println();

        //Artist = IU로 저장된 모든 앨범 정보
        System.out.println(IU.getAlbums());
        System.out.println();

        //Artist = IU의 2번째 앨범 트랙리스트
        System.out.println(IU.getAlbums().get(1).getAllTrack());
    }
}