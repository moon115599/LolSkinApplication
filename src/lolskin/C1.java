package lolskin;

public class C1 implements Skin {
    private String name = "가렌";
    private boolean skin1 = false;
    private boolean skin2 = false;

    public C1() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        if (!this.skin1 && !this.skin2) {
            System.out.println("전투사관학교 가렌 스킨을 착용했습니다.");
            this.skin1 = true;
        } else {
            System.out.println("이미 스킨을 착용 중입니다.");
        }

    }

    public void on2() {
        if (!this.skin1 && !this.skin2) {
            System.out.println("데마시아 강력반 가렌 스킨을 착용했습니다.");
            this.skin2 = true;
        } else {
            System.out.println("이미 스킨을 착용 중입니다.");
        }

    }

    public void off() {
        if (this.skin1) {
            System.out.println("전투사관학교 가렌 스킨 착용을 해제했습니다.");
            this.skin1 = false;
        } else {
            System.out.println("전투사관학교 가렌 스킨을 착용 중이지 않습니다.");
        }

    }

    public void off2() {
        if (this.skin2) {
            System.out.println("데마시아 강력반 가렌 스킨 착용을 해제했습니다.");
            this.skin2 = false;
        } else {
            System.out.println("데마시아 강력반 가렌 스킨을 착용 중이지 않습니다.");
        }

    }
}