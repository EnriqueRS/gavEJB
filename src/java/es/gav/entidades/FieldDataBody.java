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
@Table(name = "field_data_body")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataBody.findAll", query = "SELECT f FROM FieldDataBody f"),
    @NamedQuery(name = "FieldDataBody.findByEntityType", query = "SELECT f FROM FieldDataBody f WHERE f.fieldDataBodyPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataBody.findByBundle", query = "SELECT f FROM FieldDataBody f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataBody.findByDeleted", query = "SELECT f FROM FieldDataBody f WHERE f.fieldDataBodyPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataBody.findByEntityId", query = "SELECT f FROM FieldDataBody f WHERE f.fieldDataBodyPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataBody.findByRevisionId", query = "SELECT f FROM FieldDataBody f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataBody.findByLanguage", query = "SELECT f FROM FieldDataBody f WHERE f.fieldDataBodyPK.language = :language"),
    @NamedQuery(name = "FieldDataBody.findByDelta", query = "SELECT f FROM FieldDataBody f WHERE f.fieldDataBodyPK.delta = :delta"),
    @NamedQuery(name = "FieldDataBody.findByBodyFormat", query = "SELECT f FROM FieldDataBody f WHERE f.bodyFormat = :bodyFormat")})
public class FieldDataBody implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataBodyPK fieldDataBodyPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "body_value")
    private String bodyValue;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "body_summary")
    private String bodySummary;
    @Size(max = 255)
    @Column(name = "body_format")
    private String bodyFormat;

    public FieldDataBody() {
    }

    public FieldDataBody(FieldDataBodyPK fieldDataBodyPK) {
        this.fieldDataBodyPK = fieldDataBodyPK;
    }

    public FieldDataBody(FieldDataBodyPK fieldDataBodyPK, String bundle) {
        this.fieldDataBodyPK = fieldDataBodyPK;
        this.bundle = bundle;
    }

    public FieldDataBody(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataBodyPK = new FieldDataBodyPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataBodyPK getFieldDataBodyPK() {
        return fieldDataBodyPK;
    }

    public void setFieldDataBodyPK(FieldDataBodyPK fieldDataBodyPK) {
        this.fieldDataBodyPK = fieldDataBodyPK;
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

    public String getBodyValue() {
        return bodyValue;
    }

    public void setBodyValue(String bodyValue) {
        this.bodyValue = bodyValue;
    }

    public String getBodySummary() {
        return bodySummary;
    }

    public void setBodySummary(String bodySummary) {
        this.bodySummary = bodySummary;
    }

    public String getBodyFormat() {
        return bodyFormat;
    }

    public void setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataBodyPK != null ? fieldDataBodyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataBody)) {
            return false;
        }
        FieldDataBody other = (FieldDataBody) object;
        if ((this.fieldDataBodyPK == null && other.fieldDataBodyPK != null) || (this.fieldDataBodyPK != null && !this.fieldDataBodyPK.equals(other.fieldDataBodyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataBody[ fieldDataBodyPK=" + fieldDataBodyPK + " ]";
    }
    
}
