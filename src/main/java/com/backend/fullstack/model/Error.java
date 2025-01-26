package com.backend.fullstack.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(name = "Errors")
public class Error {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ErrorID")
    private Long errorId;

    @Column(name = "ContextType", length = 50, nullable = false)
    private String contextType;

    @Column(name = "ContextID", nullable = false)
    private Long contextId;

    @Column(name = "Code", length = 50)
    private String code;

    @Column(name = "Message", length = 500)
    private String message;

    @Column(name = "ResourceKey", length = 100)
    private String resourceKey;

    @Column(name = "PropertyName", length = 100)
    private String propertyName;

    public Long getErrorId() {
        return errorId;
    }

    public void setErrorId(Long errorId) {
        this.errorId = errorId;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Long getContextId() {
        return contextId;
    }

    public void setContextId(Long contextId) {
        this.contextId = contextId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResourceKey() {
        return resourceKey;
    }

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
