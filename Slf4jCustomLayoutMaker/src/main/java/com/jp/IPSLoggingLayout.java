package com.jp;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

public class IPSLoggingLayout extends LayoutBase<ILoggingEvent> {

	public String doLayout(ILoggingEvent event) {
		StringBuffer sbuf = new StringBuffer(128);
	    sbuf.append(event.getLoggerContextVO().getPropertyMap());
	    sbuf.append(" ===");
	    sbuf.append(event.getLevel());
//	    sbuf.append(" [");
	    sbuf.append(event.getThreadName());
//	    sbuf.append("] ");
	    sbuf.append(event.getLoggerName());
//	    sbuf.append(" - ");
	    sbuf.append(event.getFormattedMessage());
	    sbuf.append(CoreConstants.LINE_SEPARATOR);
	    return sbuf.toString();		
	}

}
