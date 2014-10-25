package com.doctusoft.html4j.jquery;

import net.java.html.js.JavaScriptBody;

public class JQuery {

	@JavaScriptBody(args={"selector"}, body="return jQuery(selector)")
	public static native JQuery select(String selector);
	
	@JavaScriptBody(args={"text"}, body="return this.text(text)")
	public native JQuery text(String text);
	
	@JavaScriptBody(args={"html"}, body="return this.html(html)")
	public native JQuery html(String html);

	@JavaScriptBody(args={"eventHandler"}, javacall=true, body="return this.click(function (event) {"
			+ " @com.doctusoft.html4j.jquery.EventHandler::fire(Lcom/doctusoft/html4j/jquery/EventHandler;Lcom/doctusoft/html4j/jquery/JQEvent;Lcom/doctusoft/html4j/jquery/JQuery;)(eventHandler, event, jQuery(this));})")
	public native JQuery click(EventHandler eventHandler);

}
