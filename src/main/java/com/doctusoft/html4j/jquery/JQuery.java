package com.doctusoft.html4j.jquery;

import net.java.html.js.JavaScriptBody;

public class JQuery {
	
	public enum EventType {
		blur, focus, focusin, focusout, load, resize, scroll, unload, click, dblclick, mousedown, mouseup, mousemove, mouseover, mouseout, mouseenter, mouseleave, change, select, submit, keydown, keypress, keyup, error, dragstart, drag, dragstop, dropactivate, dropdeactivate, dropover, dropout, drop, resizestart, resizestop,tap,taphold,swipe,swipeleft,swiperight,scrollstart,scrollstop,pagebeforeshow,pagebeforehide,pageshow,pagehide,pagebeforecreate,pagecreate,vmouseover,vmousedown,vmousemove,vmouseup,vclick,vmousecancel,orientationchange,pagebeforeload,pageload,pageloadfailed,pagebeforechange,pagechange,pagechangefailed,pageinit,pageremove,updatelayout
	}

	@JavaScriptBody(args={"selector"}, body="return jQuery(selector)")
	public static native JQuery select(String selector);

	@JavaScriptBody(args={"selector"}, body="return this.find(selector)")
	public native JQuery find(String selector);
	
	@JavaScriptBody(args={"text"}, body="return this.text(text)")
	public native JQuery text(String text);
	
	@JavaScriptBody(args={"html"}, body="return this.html(html)")
	public native JQuery html(String html);

	@JavaScriptBody(args={"target"}, body="return this.appendTo(target)")
	public native JQuery appendTo(JQuery target);

	@JavaScriptBody(args={"target"}, body="return this.appendTo(target)")
	public native JQuery appendTo(String target);

	@JavaScriptBody(args={"target"}, body="return this.prependTo(target)")
	public native JQuery prependTo(JQuery target);

	@JavaScriptBody(args={"target"}, body="return this.prependTo(target)")
	public native JQuery prependTo(String target);

	@JavaScriptBody(args={"target"}, body="return this.insertAfter(target)")
	public native JQuery insertAfter(JQuery target);

	@JavaScriptBody(args={"child"}, body="return this.append(child)")
	public native JQuery append(JQuery child);

	@JavaScriptBody(args={"cls"}, body="return this.addClass(cls)")
	public native JQuery addClass(String cls);

	@JavaScriptBody(args={"cls"}, body="return this.removeClass(cls)")
	public native JQuery removeClass(String cls);
	
	@JavaScriptBody(args={"element"}, body="return this.index(element)")
	public native int index(Object element);

	@JavaScriptBody(args={"index"}, body="return this.get(index)")
	public native int get(int index);

	@JavaScriptBody(args={"attrName", "attrValue"}, body="return this.attr(attrName, attrValue)")
	public native JQuery attr(String attrName, String attrValue);

	@JavaScriptBody(args={"attrName"}, body="return this.removeAttr(attrName)")
	public native JQuery removeAttr(String attrName);

	@JavaScriptBody(args={"selector"}, body="return this.is(selector)")
	public native boolean is(String selector);

	@JavaScriptBody(args={}, body="return this.focus()")
	public native JQuery focus();

	@JavaScriptBody(args={}, body="return this.show()")
	public native JQuery show();

	@JavaScriptBody(args={}, body="return this.hide()")
	public native JQuery hide();
	
	@JavaScriptBody(args={}, body="return this.remove()")
	public native JQuery remove();

	@JavaScriptBody(args={}, body="return this.length || 0")
	public native int length();

	@JavaScriptBody(args={}, body="return this.contents()")
	public native JQuery contents();

	@JavaScriptBody(args={}, body="return this.children()")
	public native JQuery children();

	@JavaScriptBody(args={}, body="return this.val()")
	public native String val();

	@JavaScriptBody(args={"value"}, body="return this.val(value)")
	public native JQuery val(String value);

	@JavaScriptBody(args={"eventHandler"}, javacall=true, body="return this.click(function (event) {"
			+ " @com.doctusoft.html4j.jquery.EventHandler::fire(Lcom/doctusoft/html4j/jquery/EventHandler;Lcom/doctusoft/html4j/jquery/JQEvent;Lcom/doctusoft/html4j/jquery/JQuery;)(eventHandler, event, jQuery(this));})")
	public native JQuery click(EventHandler eventHandler);

	@JavaScriptBody(args={"eventHandler"}, javacall=true, body="return this.change(function (event) {"
			+ " @com.doctusoft.html4j.jquery.EventHandler::fire(Lcom/doctusoft/html4j/jquery/EventHandler;Lcom/doctusoft/html4j/jquery/JQEvent;Lcom/doctusoft/html4j/jquery/JQuery;)(eventHandler, event, jQuery(this));})")
	public native JQuery change(EventHandler eventHandler);

	@JavaScriptBody(args={"eventType", "eventHandler"}, javacall=true, body="return this.bind(eventType, function (event) {"
			+ " @com.doctusoft.html4j.jquery.EventHandler::fire(Lcom/doctusoft/html4j/jquery/EventHandler;Lcom/doctusoft/html4j/jquery/JQEvent;Lcom/doctusoft/html4j/jquery/JQuery;)(eventHandler, event, jQuery(this));})")
	public native JQuery bind(String eventType, EventHandler eventHandler);

	public JQuery bind(EventType eventType, EventHandler eventHandler) {
		return bind(eventType.name(), eventHandler);
	}
}
