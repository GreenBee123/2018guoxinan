package page;

import java.io.Serializable;


public class PageInfo implements Serializable {

	private static final long serialVersionUID = 1878154374135400744L;

    private int offset = 0;//��ǰҳ��һ����� 

    private int limit = 3;//ÿҳ��С

    private int pageCount = 0;//��ҳ��

    private transient int itemCount = 0;//�ܼ�¼��
    
    public boolean isPage = false;

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
		this.pageCount = (itemCount + limit - 1) / limit;
	}

	

 
}
