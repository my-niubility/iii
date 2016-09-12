package com.nbl.service.business.dto.req;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MessageReqDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -957859249967197223L;

	//消息id
    private String id;
    //消息创建者userId
    private String userId;
    //消息接收者userId集合
    List<String> userIds;
    
    //消息接收者custId集合
    //List<String> custIds;
    
    //Message id集合
    private List<String> messageIds;
	//消息标题
    private String title;
    //消息内容
    private String content;
    //消息创建时间
    private Date createTime;
    //消息状态(0：初始 1：删除 2:预删除)
    private String status;
    //消息类型(0:系统消息 1：业务消息)
    private String messageType;
    //第一条记录下标（从0开始）
	private int startIndex;
	//记录条数
	private int recordNum;
	 //排序标识1-升序，0-降序
	//private String orderFlag;
	
	

    public int getStartIndex() {
		return startIndex;
	}

	public List<String> getMessageIds() {
		return messageIds;
	}

	public void setMessageIds(List<String> messageIds) {
		this.messageIds = messageIds;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    
    public List<String> getUserIds() {
 		return userIds;
 	}

 	public void setUserIds(List<String> userIds) {
 		this.userIds = userIds;
 	}

 	/*public List<String> getCustIds() {
 		return custIds;
 	}

 	public void setCustIds(List<String> custIds) {
 		this.custIds = custIds;
 	}*/

	@Override
	public String toString() {
		return "MessageReqDto [id=" + id + ", userId=" + userId + ", userIds=" + userIds + 
				", messageIds=" + messageIds + ", title=" + title + ", content=" + content + ", createTime="
				+ createTime + ", status=" + status + ", messageType=" + messageType + ", startIndex=" + startIndex
				+ ", recordNum=" + recordNum + "]";
	}




 	
 	
    
    
}