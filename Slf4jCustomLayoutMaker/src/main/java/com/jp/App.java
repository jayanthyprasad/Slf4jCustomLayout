package com.jp;

import org.perf4j.LoggingStopWatch;
import org.perf4j.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	 private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws InterruptedException
    {
    	StopWatch stopWatch = new LoggingStopWatch();

    	String confidentialMarkerText = "CONFIDENTIAL";
		Marker confidentialMarker = MarkerFactory.getMarker(confidentialMarkerText);
       logger.debug("Hello world from slf4j");
       logger.debug("This logger supports confidentail messages....");
       logger.debug(confidentialMarker,"This is a confidential message....");
       logger.debug("Just logged a confidential message"); 
    	stopWatch.stop("example1", "custom message text");
    	
       StopWatch stopWatc = new LoggingStopWatch();
       try{
    	   for(int i=1;i<3;i++){
        	   Thread.sleep(1000);
        	   throw new NullPointerException();        	   
           } 
       }catch(Exception e){
    	   logger.error("Hello ",e.toString());
       }
       
       
       stopWatc.stop("example2", "custom message text");
    }
}
