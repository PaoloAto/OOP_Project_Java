package net.codejava.swing;

	import net.codejava.swing.*;
	import java.awt.TextArea;
import java.io.IOException;
	import java.io.OutputStream;
	 
	import javax.swing.JTextArea;

	public class CustomOutputStream extends OutputStream {
	    private TextArea text;
	     
	    public CustomOutputStream(TextArea text) {
	        this.text = text;
	    }
	     
	    
	    public void write(int b) throws IOException {
	        
	        text.append(String.valueOf((char)b));
	   
	        text.setCaretPosition(text.getSelectionEnd());
	    }
	}


