/*
 * Created on 2004-2-6
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package page;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


/**
 * @author vikings
 *
 */
public class PagingTag extends TagSupport{

	private static final long serialVersionUID = 1L;

	private int limit = 5; 
	private int offset=0; 
	private int itemCount = 0;
	private String href = null;
		


	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int doStartTag() throws JspException 
	{
	  return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException 
	{	

		
		int totalPages = 0;
		int currentPage=0;

        totalPages = itemCount / limit;
		if(itemCount==0||limit==0){
		  return EVAL_PAGE;
		}
		if (itemCount % limit != 0) {
		  totalPages = totalPages + 1;
		}
		if (totalPages<=1)
		{
		  return EVAL_PAGE;
		}
		currentPage = (offset) / limit;
		currentPage = currentPage+1;
		StringBuffer navigation = new StringBuffer();
		navigation.append("<li><a>第"+currentPage+"页/共"+totalPages+"页</a></li>");
		if (currentPage<=1){
		  navigation.append("<li><a>首页</a></li>");
		  navigation.append("<li><a>上一页</a></li>");
		} else {
		  navigation.append("<li><a href='"+href+"?pageInfo.offset=0&pageInfo.limit="+limit+"&pageInfo.isPage=true'>首页</a></li>");
		  navigation.append("&nbsp;");
		  navigation.append("<li><a href='"+href+"?pageInfo.offset="+(offset-limit)+"&pageInfo.limit="+limit+"&pageInfo.isPage=true'>上一页</a></li>");
		}
		navigation.append("&nbsp;");
		if (currentPage>=totalPages){
		  navigation.append("<li><a>下一页</a></li>");
		  navigation.append("&nbsp;");
		  navigation.append("<li><a>尾页</a></li>");
		}else {
		  navigation.append("<li><a href='"+href+"?pageInfo.offset="+(offset+limit)+"&pageInfo.limit="+limit+"&pageInfo.isPage=true'>下一页</a></li>");
		  navigation.append("&nbsp;");
		  navigation.append("<li><a href='"+href+"?pageInfo.offset="+((totalPages-1)*limit)+"&pageInfo.limit="+limit+"&pageInfo.isPage=true'>尾页&nbsp;</a></li>");
		}
		try {
			pageContext.getOut().print(navigation.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
	  return EVAL_PAGE;
	}
	
	public void release() 
	{		
		super.release();
		this.limit = 0; //recordsPerPage
		this.offset=0; //beginItem
		this.itemCount = 0;
		this.href = null;
	}
}
