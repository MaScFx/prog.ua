package L5.Lesson;

/**
 * Created by Admin on 12.08.2017.
 */
public class SomeClass<T extends Number> {
    private T field;

    public SomeClass(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "field=" + field +
                '}';
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
