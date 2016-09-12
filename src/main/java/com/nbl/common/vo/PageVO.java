
package com.nbl.common.vo;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Donald
 * @createdate 2016年4月8日
 * @version 1.0 
 * @description :查询分页信息
 */
public class PageVO<T> extends BaseVO {
	
	private static final long serialVersionUID = 1L;
	
	/** 
	 * 页内容
	 */
	private List<T> list = new ArrayList<T>();
	/**
	 * 分页起始位置
	 */
	private int startSize;
	/**
	 * 分页结束位置
	 */
	private int endSize;
	/**
	 * 单页大小  如果为-1 则查询全部结果
	 */
	private int size;
	/**
	 * 总大小
	 */
	protected int allSize;
	/**
	 * 排序字符串
	 */
	private String orderBy;
	
	/**
     * @return the orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }
    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getStartSize() {
		return startSize;
	}
	public void setStartSize(int startSize) {
		this.startSize = startSize;
	}
	public int getEndSize() {
		return endSize;
	}
	public void setEndSize(int endSize) {
		this.endSize = endSize;
	}
	public int getAllSize() {
		return allSize;
	}
	public void setAllSize(int allSize) {
		this.allSize = allSize;
	}
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
	@Override
	public String toString() {
		return "PageVO [list=" + list + ", startSize=" + startSize + ", endSize=" + endSize + ", size=" + size
				+ ", allSize=" + allSize + ", orderBy=" + orderBy + "]";
	}
	
}
