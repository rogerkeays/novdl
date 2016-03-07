package jamaica.jsf.novdl.fluent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIViewAction<T extends FluentUIViewAction> extends 
            FluentUIComponent<T>, FluentActionSource2<T> {

    public void setOnPostback(boolean onPostback);
    public default T onPostback(boolean onPostback) {
        setOnPostback(onPostback); return (T) this;
    }

    public void setPhase(String phase);
    public default T phase(String phase) {
        setPhase(phase); return (T) this;
    }
}
