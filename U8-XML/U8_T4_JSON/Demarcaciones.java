public class Demarcaciones {

    private String posic1;
    private String posic2;

    public Demarcaciones(String posic1, String posic2) {
        this.posic1 = posic1;
        this.posic2 = posic2;
    }

    public Demarcaciones(String posic1) {
        this.posic1 = posic1;
    }

    public String getPosic1() {
        return posic1;
    }

    public void setPosic1(String posic1) {
        this.posic1 = posic1;
    }

    public String getPosic2() {
        return posic2;
    }

    public void setPosic2(String posic2) {
        this.posic2 = posic2;
    }
}
