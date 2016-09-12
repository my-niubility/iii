package com.nbl.service.business.dto.res;

import java.io.Serializable;
import java.util.Date;

public class MessageResDto implements Serializable{

	private static final long serialVersionUID = -5870161433132818690L;

	//消息id
    private String id;
    
    //消息创建者custId
    private String custId;
    
    /*//消息接受者userId
    List<String> userIds;
    //消息接受者custId
    List<String> custIds;*/
    
	//消息标题
    private String title;
    
    //消息内容
    private String content;
    
    //消息创建时间
    private String createTime;
    
    //消息状态(0：初始 1：删除 2:预删除)
    private String status;
    
    //消息类型(0:系统消息 1：业务消息)
    private String messageType;
    
    //消息是否已读状态（0：未读 1：已读）
    private String isreadstatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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

	public String getIsreadstatus() {
		return isreadstatus;
	}

	public void setIsreadstatus(String isreadstatus) {
		this.isreadstatus = isreadstatus;
	}

	@Override
	public String toString() {
		return "MessageResDto [id=" + id + ", custId=" + custId + ", title=" + title + ", content=" + content
				+ ", createTime=" + createTime + ", status=" + status + ", messageType=" + messageType
				+ ", isreadstatus=" + isreadstatus + "]";
	}


	
	
    
 	
 	
    
    
}