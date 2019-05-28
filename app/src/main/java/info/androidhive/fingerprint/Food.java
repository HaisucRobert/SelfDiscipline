package info.androidhive.fingerprint;

public class Food {

    private Integer FOOD_ID;
    private String NAME;
    private Double KCALORII, PROTEINE, LIPIDE, GLUCIDE;

    public Integer getFOOD_ID() {
        return FOOD_ID;
    }

    public void setFOOD_ID(Integer FOOD_ID) {
        this.FOOD_ID = FOOD_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Double getKCALORII() {
        return KCALORII;
    }

    public void setKCALORII(Double KCALORII) {
        this.KCALORII = KCALORII;
    }

    public Double getPROTEINE() {
        return PROTEINE;
    }

    public void setPROTEINE(Double PROTEINE) {
        this.PROTEINE = PROTEINE;
    }

    public Double getLIPIDE() {
        return LIPIDE;
    }

    public void setLIPIDE(Double LIPIDE) {
        this.LIPIDE = LIPIDE;
    }

    public Double getGLUCIDE() {
        return GLUCIDE;
    }

    public void setGLUCIDE(Double GLUCIDE) {
        this.GLUCIDE = GLUCIDE;
    }

    @Override
    public String toString() {
        return "Food{" +
                "FOOD_ID=" + FOOD_ID +
                ", NAME='" + NAME + '\'' +
                ", KCALORII=" + KCALORII +
                ", PROTEINE=" + PROTEINE +
                ", LIPIDE=" + LIPIDE +
                ", GLUCIDE=" + GLUCIDE +
                '}';
    }
}
