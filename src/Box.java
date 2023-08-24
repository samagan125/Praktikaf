public class Box <T>{
    private T box;

    public Box(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }
    public static <T> Box<T>array(T arr){
        return new Box<>(arr);
    }
}
