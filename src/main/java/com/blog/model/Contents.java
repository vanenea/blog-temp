package com.blog.model;

import java.io.Serializable;

public class Contents implements Serializable {
	
	private static final long serialVersionUID = -690346241980116516L;
	
	private Integer cid;
	private String title;
	private String slug;
	private Integer created;
	private Integer modified;
	private String content;
	private Integer authorId;
	private String type;
	private String status;
	private String tags;
	private String categories;
	private Integer hits;
	private Integer commentsNum;
	private boolean allowComment;
	private boolean allowPing;
	private boolean allowFeed;
	public Contents() {
		super();
	}
	public Contents(Integer cid, String title, String slug, Integer created, Integer modified, String content,
			Integer authorId, String type, String status, String tags, String categories, Integer hits,
			Integer commentsNum, boolean allowComment, boolean allowPing, boolean allowFeed) {
		super();
		this.cid = cid;
		this.title = title;
		this.slug = slug;
		this.created = created;
		this.modified = modified;
		this.content = content;
		this.authorId = authorId;
		this.type = type;
		this.status = status;
		this.tags = tags;
		this.categories = categories;
		this.hits = hits;
		this.commentsNum = commentsNum;
		this.allowComment = allowComment;
		this.allowPing = allowPing;
		this.allowFeed = allowFeed;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public Integer getCreated() {
		return created;
	}
	public void setCreated(Integer created) {
		this.created = created;
	}
	public Integer getModified() {
		return modified;
	}
	public void setModified(Integer modified) {
		this.modified = modified;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getCommentsNum() {
		return commentsNum;
	}
	public void setCommentsNum(Integer commentsNum) {
		this.commentsNum = commentsNum;
	}
	public boolean isAllowComment() {
		return allowComment;
	}
	public void setAllowComment(boolean allowComment) {
		this.allowComment = allowComment;
	}
	public boolean isAllowPing() {
		return allowPing;
	}
	public void setAllowPing(boolean allowPing) {
		this.allowPing = allowPing;
	}
	public boolean isAllowFeed() {
		return allowFeed;
	}
	public void setAllowFeed(boolean allowFeed) {
		this.allowFeed = allowFeed;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (allowComment ? 1231 : 1237);
		result = prime * result + (allowFeed ? 1231 : 1237);
		result = prime * result + (allowPing ? 1231 : 1237);
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((commentsNum == null) ? 0 : commentsNum.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((hits == null) ? 0 : hits.hashCode());
		result = prime * result + ((modified == null) ? 0 : modified.hashCode());
		result = prime * result + ((slug == null) ? 0 : slug.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contents other = (Contents) obj;
		if (allowComment != other.allowComment)
			return false;
		if (allowFeed != other.allowFeed)
			return false;
		if (allowPing != other.allowPing)
			return false;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		} else if (!authorId.equals(other.authorId))
			return false;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (commentsNum == null) {
			if (other.commentsNum != null)
				return false;
		} else if (!commentsNum.equals(other.commentsNum))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (hits == null) {
			if (other.hits != null)
				return false;
		} else if (!hits.equals(other.hits))
			return false;
		if (modified == null) {
			if (other.modified != null)
				return false;
		} else if (!modified.equals(other.modified))
			return false;
		if (slug == null) {
			if (other.slug != null)
				return false;
		} else if (!slug.equals(other.slug))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Contents [cid=" + cid + ", title=" + title + ", slug=" + slug + ", created=" + created + ", modified="
				+ modified + ", content=" + content + ", authorId=" + authorId + ", type=" + type + ", status=" + status
				+ ", tags=" + tags + ", categories=" + categories + ", hits=" + hits + ", commentsNum=" + commentsNum
				+ ", allowComment=" + allowComment + ", allowPing=" + allowPing + ", allowFeed=" + allowFeed + "]";
	}
	
	
}
