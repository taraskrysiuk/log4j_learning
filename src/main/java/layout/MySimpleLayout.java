package layout;


import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

public class MySimpleLayout extends Layout {

    @Override
    public String format(LoggingEvent event) {
        StringBuilder builder = new StringBuilder();
        builder.append(event.getLevel().toString() + " message - ");
        builder.append(event.getRenderedMessage() + " ");
        builder.append("(Create by MySimpleLayout).");
        builder.append(LINE_SEP);
        return builder.toString();
    }

    @Override
    public boolean ignoresThrowable() {
        return true;
    }

    @Override
    public void activateOptions() {

    }
}
