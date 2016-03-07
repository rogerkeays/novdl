package jamaica.jsf.novdl.fluent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIMessage<T extends FluentUIMessage> extends 
            FluentUIComponent<T> {

    public void setFor(String newFor);
    public default T forr(String newFor) {
        setFor(newFor); return (T) this;
    }

    public void setRedisplay(boolean redisplay);
    public default T redisplay(boolean redisplay) {
        setRedisplay(redisplay); return (T) this;
    }

    public void setShowDetail(boolean showDetail);
    public default T showDetail(boolean showDetail) {
        setShowDetail(showDetail); return (T) this;
    }

    public void setShowSummary(boolean showSummary);
    public default T showSummary(boolean showSummary) {
        setShowSummary(showSummary); return (T) this;
    }
}
