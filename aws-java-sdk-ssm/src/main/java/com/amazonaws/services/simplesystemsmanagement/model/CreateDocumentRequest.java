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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#createDocument(CreateDocumentRequest) CreateDocument operation}.
 * <p>
 * Creates a configuration document.
 * </p>
 * <p>
 * After you create a configuration document, you can use
 * CreateAssociation to associate it with one or more running instances.
 * </p>
 *
 * @see com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#createDocument(CreateDocumentRequest)
 */
public class CreateDocumentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A valid JSON file. For more information about the contents of this
     * file, see <a
     * href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     * Document</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String content;

    /**
     * A name for the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     */
    private String name;

    /**
     * A valid JSON file. For more information about the contents of this
     * file, see <a
     * href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     * Document</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A valid JSON file. For more information about the contents of this
     *         file, see <a
     *         href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     *         Document</a>.
     */
    public String getContent() {
        return content;
    }
    
    /**
     * A valid JSON file. For more information about the contents of this
     * file, see <a
     * href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     * Document</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content A valid JSON file. For more information about the contents of this
     *         file, see <a
     *         href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     *         Document</a>.
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
     * A valid JSON file. For more information about the contents of this
     * file, see <a
     * href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     * Document</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content A valid JSON file. For more information about the contents of this
     *         file, see <a
     *         href="http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html">Configuration
     *         Document</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDocumentRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * A name for the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @return A name for the configuration document.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A name for the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name A name for the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A name for the configuration document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name A name for the configuration document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDocumentRequest withName(String name) {
        this.name = name;
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
        if (getContent() != null) sb.append("Content: " + getContent() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDocumentRequest == false) return false;
        CreateDocumentRequest other = (CreateDocumentRequest)obj;
        
        if (other.getContent() == null ^ this.getContent() == null) return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDocumentRequest clone() {
        
            return (CreateDocumentRequest) super.clone();
    }

}
    