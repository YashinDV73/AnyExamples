package collection.obj;

public class Box {

    int id;
    String nameBox;
    TypeBox typeBox;

    public Box(int id, String nameBox, TypeBox typeBox) {
        this.id = id;
        this.nameBox = nameBox;
        this.typeBox = typeBox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBox() {
        return nameBox;
    }

    public void setNameBox(String nameBox) {
        this.nameBox = nameBox;
    }

    public TypeBox getTypeBox() {
        return typeBox;
    }

    public void setTypeBox(TypeBox typeBox) {
        this.typeBox = typeBox;
    }

    @Override
    public String toString() {
        return "Box{" + "id=" + id + ", nameBox='" + nameBox + '\'' + ", typeBox='" + typeBox + '\'' + '}';
    }

    public static boolean isPlastic(Box box) {
        return box.typeBox.equals(TypeBox.plastic);
    }

    public static boolean isPaper(Box box) {
        return box.typeBox.equals(TypeBox.paper);
    }

    public enum TypeBox {
        plastic,
        paper,
        iron,
        plastic_1
    }

}
