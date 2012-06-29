package net.sf.xplanner.domain;

// Generated 16-Nov-2009 23:34:52 by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttributeId generated by hbm2java
 */
@Embeddable
public class AttributeId implements java.io.Serializable {

	private int targetId;
	private String name;

	public AttributeId() {
	}

	public AttributeId(int targetId, String name) {
		this.targetId = targetId;
		this.name = name;
	}

	@Column(name = "targetId", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AttributeId))
			return false;
		AttributeId castOther = (AttributeId) other;

		return (this.getTargetId() == castOther.getTargetId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTargetId();
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
