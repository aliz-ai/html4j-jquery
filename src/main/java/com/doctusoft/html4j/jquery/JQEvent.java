package com.doctusoft.html4j.jquery;

import net.java.html.js.JavaScriptBody;

public class JQEvent {
	
	public static void forceInclude() {
		// empty
	}

	/**
	 * For key or button events, this attribute indicates the specific button or
	 * key that was pressed.
	 * 
	 * @return
	 */
	@JavaScriptBody(args = {}, body="return this.which || 0")
	public final native int which();

	@JavaScriptBody(args = {}, body="return this.keyCode || 0")
	public final native int getKeyCode();
	
}
