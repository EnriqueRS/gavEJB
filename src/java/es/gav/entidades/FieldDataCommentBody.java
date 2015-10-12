/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kike
 */
@Entity
@Table(name = "field_data_comment_body")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataCommentBody.findAll", query = "SELECT f FROM FieldDataCommentBody f"),
    @NamedQuery(name = "FieldDataCommentBody.findByEntityType", query = "SELECT f FROM FieldDataCommentBody f WHERE f.fieldDataCommentBodyPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataCommentBody.findByBundle", query = "SELECT f FROM FieldDataCommentBody f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataCommentBody.findByDeleted", query = "SELECT f FROM FieldDataCommentBody f WHERE f.fieldDataCommentBodyPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataCommentBody.findByEntityId", query = "SELECT f FROM FieldDataCommentBody f WHERE f.fieldDataCommentBodyPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataCommentBody.findByRevisionId", query = "SELECT f FROM FieldDataCommentBody f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataCommentBody.findByLanguage", query = "SELECT f FROM FieldDataCommentBody f WHERE f.fieldDataCommentBodyPK.language = :language"),
    @NamedQuery(name = "FieldDataCommentBody.findByDelta", query = "SELECT f FROM FieldDataCommentBody f WHERE f.fieldDataCommentBodyPK.delta = :delta"),
    @NamedQuery(name = "FieldDataCommentBody.findByCommentBodyFormat", query = "SELECT f FROM FieldDataCommentBody f WHERE f.commentBodyFormat = :commentBodyFormat")})
public class FieldDataCommentBody implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataCommentBodyPK fieldDataCommentBodyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "comment_body_value")
    private String commentBodyValue;
    @Size(max = 255)
    @Column(name = "comment_body_format")
    private String commentBodyFormat;

    public FieldDataCommentBody() {
    }

    public FieldDataCommentBody(FieldDataCommentBodyPK fieldDataCommentBodyPK) {
        this.fieldDataCommentBodyPK = fieldDataCommentBodyPK;
    }

    public FieldDataCommentBody(FieldDataCommentBodyPK fieldDataCommentBodyPK, String bundle) {
        this.fieldDataCommentBodyPK = fieldDataCommentBodyPK;
        this.bundle = bundle;
    }

    public FieldDataCommentBody(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataCommentBodyPK = new FieldDataCommentBodyPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataCommentBodyPK getFieldDataCommentBodyPK() {
        return fieldDataCommentBodyPK;
    }

    public void setFieldDataCommentBodyPK(FieldDataCommentBodyPK fieldDataCommentBodyPK) {
        this.fieldDataCommentBodyPK = fieldDataCommentBodyPK;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public Integer getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(Integer revisionId) {
        this.revisionId = revisionId;
    }

    public String getCommentBodyValue() {
        return commentBodyValue;
    }

    public void setCommentBodyValue(String commentBodyValue) {
        this.commentBodyValue = commentBodyValue;
    }

    public String getCommentBodyFormat() {
        return commentBodyFormat;
    }

    public void setCommentBodyFormat(String commentBodyFormat) {
        this.commentBodyFormat = commentBodyFormat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataCommentBodyPK != null ? fieldDataCommentBodyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataCommentBody)) {
            return false;
        }
        FieldDataCommentBody other = (FieldDataCommentBody) object;
        if ((this.fieldDataCommentBodyPK == null && other.fieldDataCommentBodyPK != null) || (this.fieldDataCommentBodyPK != null && !this.fieldDataCommentBodyPK.equals(other.fieldDataCommentBodyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataCommentBody[ fieldDataCommentBodyPK=" + fieldDataCommentBodyPK + " ]";
    }
    
}
