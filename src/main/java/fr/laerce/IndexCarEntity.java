package fr.laerce;

public class IndexCarEntity {
    int index;
    String carentity;

    public IndexCarEntity(int index, String carentity) {
        this.index = index;
        this.carentity = carentity;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCarentity() {
        return carentity;
    }

    public void setCarentity(String carentity) {
        this.carentity = carentity;
    }
}
