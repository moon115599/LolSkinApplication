package lolskin;

public class C2 implements Skin {
    private String name = "제리";
    private boolean skin1 = false;

    public C2() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        if (this.skin1) {
            System.out.println("이미 스킨을 착용 중입니다.");
        } else {
            System.out.println("전투사관학교 제리 스킨을 착용했습니다.");
        }

    }

    public void off() {
        if (this.skin1) {
            System.out.println("전투사관학교 제리 스킨 착용을 해제했습니다.");
        } else {
            System.out.println("전투사관학교 제리 스킨을 착용 중이지 않습니다.");
        }

    }
}