/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createEventSubscription(CreateEventSubscriptionRequest) CreateEventSubscription operation}.
 * <p>
 * Creates an Amazon Redshift event notification subscription. This
 * action requires an ARN (Amazon Resource Name) of an Amazon SNS topic
 * created by either the Amazon Redshift console, the Amazon SNS console,
 * or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must
 * create a topic in Amazon SNS and subscribe to the topic. The ARN is
 * displayed in the SNS console.
 * </p>
 * <p>
 * You can specify the source type, and lists of Amazon Redshift source
 * IDs, event categories, and event severities. Notifications will be
 * sent for all events you want that match those criteria. For example,
 * you can specify source type = cluster, source ID = my-cluster-1 and
 * mycluster2, event categories = Availability, Backup, and severity =
 * ERROR. The subscription will only send notifications for those ERROR
 * events in the Availability and Backup categories for the specified
 * clusters.
 * </p>
 * <p>
 * If you specify both the source type and source IDs, such as source
 * type = cluster and source identifier = my-cluster-1, notifications
 * will be sent for all the cluster events for my-cluster-1. If you
 * specify a source type but do not specify a source identifier, you will
 * receive notice of the events for the objects of that type in your AWS
 * account. If you do not specify either the SourceType nor the
 * SourceIdentifier, you will be notified of events generated from all
 * Amazon Redshift sources belonging to your AWS account. You must
 * specify a source type if you specify a source ID.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createEventSubscription(CreateEventSubscriptionRequest)
 */
public class CreateEventSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the event subscription to be created. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     */
    private String subscriptionName;

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     * transmit the event notifications. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     */
    private String snsTopicArn;

    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a cluster, you would
     * set this parameter to cluster. If this value is not specified, events
     * are returned for all Amazon Redshift objects in your AWS account. You
     * must specify a source type in order to specify source IDs. <p>Valid
     * values: cluster, cluster-parameter-group, cluster-security-group, and
     * cluster-snapshot.
     */
    private String sourceType;

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the
     * source type parameter. The event subscription will return only events
     * generated by the specified objects. If not specified, then events are
     * returned for all objects within the source type specified. <p>Example:
     * my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIds;

    /**
     * Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. <p>Values: Configuration, Management,
     * Monitoring, Security
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * Specifies the Amazon Redshift event severity to be published by the
     * event notification subscription. <p>Values: ERROR, INFO
     */
    private String severity;

    /**
     * A Boolean value; set to <code>true</code> to activate the
     * subscription, set to <code>false</code> to create the subscription but
     * not active it.
     */
    private Boolean enabled;

    /**
     * A list of tag instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the event subscription to be created. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @return The name of the event subscription to be created. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    /**
     * The name of the event subscription to be created. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @param subscriptionName The name of the event subscription to be created. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    /**
     * The name of the event subscription to be created. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionName The name of the event subscription to be created. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     * transmit the event notifications. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     *         transmit the event notifications. The ARN is created by Amazon SNS
     *         when you create a topic and subscribe to it.
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     * transmit the event notifications. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     *         transmit the event notifications. The ARN is created by Amazon SNS
     *         when you create a topic and subscribe to it.
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     * transmit the event notifications. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to
     *         transmit the event notifications. The ARN is created by Amazon SNS
     *         when you create a topic and subscribe to it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a cluster, you would
     * set this parameter to cluster. If this value is not specified, events
     * are returned for all Amazon Redshift objects in your AWS account. You
     * must specify a source type in order to specify source IDs. <p>Valid
     * values: cluster, cluster-parameter-group, cluster-security-group, and
     * cluster-snapshot.
     *
     * @return The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a cluster, you would
     *         set this parameter to cluster. If this value is not specified, events
     *         are returned for all Amazon Redshift objects in your AWS account. You
     *         must specify a source type in order to specify source IDs. <p>Valid
     *         values: cluster, cluster-parameter-group, cluster-security-group, and
     *         cluster-snapshot.
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a cluster, you would
     * set this parameter to cluster. If this value is not specified, events
     * are returned for all Amazon Redshift objects in your AWS account. You
     * must specify a source type in order to specify source IDs. <p>Valid
     * values: cluster, cluster-parameter-group, cluster-security-group, and
     * cluster-snapshot.
     *
     * @param sourceType The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a cluster, you would
     *         set this parameter to cluster. If this value is not specified, events
     *         are returned for all Amazon Redshift objects in your AWS account. You
     *         must specify a source type in order to specify source IDs. <p>Valid
     *         values: cluster, cluster-parameter-group, cluster-security-group, and
     *         cluster-snapshot.
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a cluster, you would
     * set this parameter to cluster. If this value is not specified, events
     * are returned for all Amazon Redshift objects in your AWS account. You
     * must specify a source type in order to specify source IDs. <p>Valid
     * values: cluster, cluster-parameter-group, cluster-security-group, and
     * cluster-snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a cluster, you would
     *         set this parameter to cluster. If this value is not specified, events
     *         are returned for all Amazon Redshift objects in your AWS account. You
     *         must specify a source type in order to specify source IDs. <p>Valid
     *         values: cluster, cluster-parameter-group, cluster-security-group, and
     *         cluster-snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the
     * source type parameter. The event subscription will return only events
     * generated by the specified objects. If not specified, then events are
     * returned for all objects within the source type specified. <p>Example:
     * my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     *
     * @return A list of one or more identifiers of Amazon Redshift source objects.
     *         All of the objects must be of the same type as was specified in the
     *         source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are
     *         returned for all objects within the source type specified. <p>Example:
     *         my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     */
    public java.util.List<String> getSourceIds() {
        if (sourceIds == null) {
              sourceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              sourceIds.setAutoConstruct(true);
        }
        return sourceIds;
    }
    
    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the
     * source type parameter. The event subscription will return only events
     * generated by the specified objects. If not specified, then events are
     * returned for all objects within the source type specified. <p>Example:
     * my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     *
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     *         All of the objects must be of the same type as was specified in the
     *         source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are
     *         returned for all objects within the source type specified. <p>Example:
     *         my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     */
    public void setSourceIds(java.util.Collection<String> sourceIds) {
        if (sourceIds == null) {
            this.sourceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sourceIds.size());
        sourceIdsCopy.addAll(sourceIds);
        this.sourceIds = sourceIdsCopy;
    }
    
    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the
     * source type parameter. The event subscription will return only events
     * generated by the specified objects. If not specified, then events are
     * returned for all objects within the source type specified. <p>Example:
     * my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     *         All of the objects must be of the same type as was specified in the
     *         source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are
     *         returned for all objects within the source type specified. <p>Example:
     *         my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSourceIds(String... sourceIds) {
        if (getSourceIds() == null) setSourceIds(new java.util.ArrayList<String>(sourceIds.length));
        for (String value : sourceIds) {
            getSourceIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the
     * source type parameter. The event subscription will return only events
     * generated by the specified objects. If not specified, then events are
     * returned for all objects within the source type specified. <p>Example:
     * my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     *         All of the objects must be of the same type as was specified in the
     *         source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are
     *         returned for all objects within the source type specified. <p>Example:
     *         my-cluster-1, my-cluster-2 <p>Example: my-snapshot-20131010
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSourceIds(java.util.Collection<String> sourceIds) {
        if (sourceIds == null) {
            this.sourceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sourceIds.size());
            sourceIdsCopy.addAll(sourceIds);
            this.sourceIds = sourceIdsCopy;
        }

        return this;
    }

    /**
     * Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. <p>Values: Configuration, Management,
     * Monitoring, Security
     *
     * @return Specifies the Amazon Redshift event categories to be published by the
     *         event notification subscription. <p>Values: Configuration, Management,
     *         Monitoring, Security
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. <p>Values: Configuration, Management,
     * Monitoring, Security
     *
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     *         event notification subscription. <p>Values: Configuration, Management,
     *         Monitoring, Security
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
        eventCategoriesCopy.addAll(eventCategories);
        this.eventCategories = eventCategoriesCopy;
    }
    
    /**
     * Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. <p>Values: Configuration, Management,
     * Monitoring, Security
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     *         event notification subscription. <p>Values: Configuration, Management,
     *         Monitoring, Security
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription. <p>Values: Configuration, Management,
     * Monitoring, Security
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     *         event notification subscription. <p>Values: Configuration, Management,
     *         Monitoring, Security
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
            eventCategoriesCopy.addAll(eventCategories);
            this.eventCategories = eventCategoriesCopy;
        }

        return this;
    }

    /**
     * Specifies the Amazon Redshift event severity to be published by the
     * event notification subscription. <p>Values: ERROR, INFO
     *
     * @return Specifies the Amazon Redshift event severity to be published by the
     *         event notification subscription. <p>Values: ERROR, INFO
     */
    public String getSeverity() {
        return severity;
    }
    
    /**
     * Specifies the Amazon Redshift event severity to be published by the
     * event notification subscription. <p>Values: ERROR, INFO
     *
     * @param severity Specifies the Amazon Redshift event severity to be published by the
     *         event notification subscription. <p>Values: ERROR, INFO
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    /**
     * Specifies the Amazon Redshift event severity to be published by the
     * event notification subscription. <p>Values: ERROR, INFO
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severity Specifies the Amazon Redshift event severity to be published by the
     *         event notification subscription. <p>Values: ERROR, INFO
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * A Boolean value; set to <code>true</code> to activate the
     * subscription, set to <code>false</code> to create the subscription but
     * not active it.
     *
     * @return A Boolean value; set to <code>true</code> to activate the
     *         subscription, set to <code>false</code> to create the subscription but
     *         not active it.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * A Boolean value; set to <code>true</code> to activate the
     * subscription, set to <code>false</code> to create the subscription but
     * not active it.
     *
     * @param enabled A Boolean value; set to <code>true</code> to activate the
     *         subscription, set to <code>false</code> to create the subscription but
     *         not active it.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * A Boolean value; set to <code>true</code> to activate the
     * subscription, set to <code>false</code> to create the subscription but
     * not active it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled A Boolean value; set to <code>true</code> to activate the
     *         subscription, set to <code>false</code> to create the subscription but
     *         not active it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * A Boolean value; set to <code>true</code> to activate the
     * subscription, set to <code>false</code> to create the subscription but
     * not active it.
     *
     * @return A Boolean value; set to <code>true</code> to activate the
     *         subscription, set to <code>false</code> to create the subscription but
     *         not active it.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * A list of tag instances.
     *
     * @return A list of tag instances.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tag instances.
     *
     * @param tags A list of tag instances.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tag instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tag instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tag instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSubscriptionRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getSubscriptionName() != null) sb.append("SubscriptionName: " + getSubscriptionName() + ",");
        if (getSnsTopicArn() != null) sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getSourceIds() != null) sb.append("SourceIds: " + getSourceIds() + ",");
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode()); 
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        hashCode = prime * hashCode + ((getSourceIds() == null) ? 0 : getSourceIds().hashCode()); 
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode()); 
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateEventSubscriptionRequest == false) return false;
        CreateEventSubscriptionRequest other = (CreateEventSubscriptionRequest)obj;
        
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null) return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false) return false; 
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null) return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getSourceIds() == null ^ this.getSourceIds() == null) return false;
        if (other.getSourceIds() != null && other.getSourceIds().equals(this.getSourceIds()) == false) return false; 
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    