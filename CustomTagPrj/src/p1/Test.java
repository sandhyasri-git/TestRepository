package p1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagAdapter;

public class Test extends SimpleTagSupport {
	public void doTag() throws JspException,IOException
	{
		JspWriter out=getJspContext().getOut();
		out.println("Custom Tag");
	}
	

}
