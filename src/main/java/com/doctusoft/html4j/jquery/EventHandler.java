package com.doctusoft.html4j.jquery;

public abstract class EventHandler {
	public abstract void eventCompleted(JQEvent event, JQuery currentJQuery);
	
	static public void fire(EventHandler handler, JQEvent event, JQuery currentJQuery) {
		handler.eventCompleted(event, currentJQuery);
	}
}
