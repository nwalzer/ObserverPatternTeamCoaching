import javafx.scene.control.Label;

abstract public class Observer {
    protected Subject subject;
    protected Label label;
    public abstract void update();
}
