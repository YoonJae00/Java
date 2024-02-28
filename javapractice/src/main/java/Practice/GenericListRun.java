package Practice;

import java.util.ArrayList;
import java.util.List;


public class GenericListRun {

    public static void main(String[] args) {

        // <Music> 로 제네릭 설정함
        ArrayList<Music> list = new ArrayList<Music>();

        list.add(new Music("Attention", "뉴진스"));
        list.add(new Music("새삥", "지코"));
//		list.add("가보자고");	제네릭 설정시 다른 타입 담기 불가
        System.out.println(list);

        list.add(1, new Music("진심이 담긴 노래", "케이시"));

        System.out.println(list);

        List<Music> sub = list.subList(0, 2);

        System.out.println(sub);

        list.addAll(sub);

        Music m = list.get(0);	// <Music> 으로 제네릭을 설정했기 때문에 강제형변환 필요없음, Music 클래스의 .get()메소드 사용가능
        System.out.println(m);

        System.out.println(list.get(0).getArtist());

        for(Music o : list) {	// o = list.get(0) => o = list.get(1)
            System.out.println(o);
        }

    }

}