/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Rejected Log Events Info
 */
public class RejectedLogEventsInfo implements Serializable, Cloneable {

    private Integer tooNewLogEventStartIndex;

    private Integer tooOldLogEventEndIndex;

    private Integer expiredLogEventEndIndex;

    /**
     * Returns the value of the TooNewLogEventStartIndex property for this
     * object.
     *
     * @return The value of the TooNewLogEventStartIndex property for this object.
     */
    public Integer getTooNewLogEventStartIndex() {
        return tooNewLogEventStartIndex;
    }
    
    /**
     * Sets the value of the TooNewLogEventStartIndex property for this
     * object.
     *
     * @param tooNewLogEventStartIndex The new value for the TooNewLogEventStartIndex property for this
     *         object.
     */
    public void setTooNewLogEventStartIndex(Integer tooNewLogEventStartIndex) {
        this.tooNewLogEventStartIndex = tooNewLogEventStartIndex;
    }
    
    /**
     * Sets the value of the TooNewLogEventStartIndex property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tooNewLogEventStartIndex The new value for the TooNewLogEventStartIndex property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RejectedLogEventsInfo withTooNewLogEventStartIndex(Integer tooNewLogEventStartIndex) {
        this.tooNewLogEventStartIndex = tooNewLogEventStartIndex;
        return this;
    }

    /**
     * Returns the value of the TooOldLogEventEndIndex property for this
     * object.
     *
     * @return The value of the TooOldLogEventEndIndex property for this object.
     */
    public Integer getTooOldLogEventEndIndex() {
        return tooOldLogEventEndIndex;
    }
    
    /**
     * Sets the value of the TooOldLogEventEndIndex property for this object.
     *
     * @param tooOldLogEventEndIndex The new value for the TooOldLogEventEndIndex property for this object.
     */
    public void setTooOldLogEventEndIndex(Integer tooOldLogEventEndIndex) {
        this.tooOldLogEventEndIndex = tooOldLogEventEndIndex;
    }
    
    /**
     * Sets the value of the TooOldLogEventEndIndex property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tooOldLogEventEndIndex The new value for the TooOldLogEventEndIndex property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RejectedLogEventsInfo withTooOldLogEventEndIndex(Integer tooOldLogEventEndIndex) {
        this.tooOldLogEventEndIndex = tooOldLogEventEndIndex;
        return this;
    }

    /**
     * Returns the value of the ExpiredLogEventEndIndex property for this
     * object.
     *
     * @return The value of the ExpiredLogEventEndIndex property for this object.
     */
    public Integer getExpiredLogEventEndIndex() {
        return expiredLogEventEndIndex;
    }
    
    /**
     * Sets the value of the ExpiredLogEventEndIndex property for this
     * object.
     *
     * @param expiredLogEventEndIndex The new value for the ExpiredLogEventEndIndex property for this
     *         object.
     */
    public void setExpiredLogEventEndIndex(Integer expiredLogEventEndIndex) {
        this.expiredLogEventEndIndex = expiredLogEventEndIndex;
    }
    
    /**
     * Sets the value of the ExpiredLogEventEndIndex property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiredLogEventEndIndex The new value for the ExpiredLogEventEndIndex property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RejectedLogEventsInfo withExpiredLogEventEndIndex(Integer expiredLogEventEndIndex) {
        this.expiredLogEventEndIndex = expiredLogEventEndIndex;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTooNewLogEventStartIndex() != null) sb.append("TooNewLogEventStartIndex: " + getTooNewLogEventStartIndex() + ",");
        if (getTooOldLogEventEndIndex() != null) sb.append("TooOldLogEventEndIndex: " + getTooOldLogEventEndIndex() + ",");
        if (getExpiredLogEventEndIndex() != null) sb.append("ExpiredLogEventEndIndex: " + getExpiredLogEventEndIndex() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTooNewLogEventStartIndex() == null) ? 0 : getTooNewLogEventStartIndex().hashCode()); 
        hashCode = prime * hashCode + ((getTooOldLogEventEndIndex() == null) ? 0 : getTooOldLogEventEndIndex().hashCode()); 
        hashCode = prime * hashCode + ((getExpiredLogEventEndIndex() == null) ? 0 : getExpiredLogEventEndIndex().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RejectedLogEventsInfo == false) return false;
        RejectedLogEventsInfo other = (RejectedLogEventsInfo)obj;
        
        if (other.getTooNewLogEventStartIndex() == null ^ this.getTooNewLogEventStartIndex() == null) return false;
        if (other.getTooNewLogEventStartIndex() != null && other.getTooNewLogEventStartIndex().equals(this.getTooNewLogEventStartIndex()) == false) return false; 
        if (other.getTooOldLogEventEndIndex() == null ^ this.getTooOldLogEventEndIndex() == null) return false;
        if (other.getTooOldLogEventEndIndex() != null && other.getTooOldLogEventEndIndex().equals(this.getTooOldLogEventEndIndex()) == false) return false; 
        if (other.getExpiredLogEventEndIndex() == null ^ this.getExpiredLogEventEndIndex() == null) return false;
        if (other.getExpiredLogEventEndIndex() != null && other.getExpiredLogEventEndIndex().equals(this.getExpiredLogEventEndIndex()) == false) return false; 
        return true;
    }
    
    @Override
    public RejectedLogEventsInfo clone() {
        try {
            return (RejectedLogEventsInfo) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    