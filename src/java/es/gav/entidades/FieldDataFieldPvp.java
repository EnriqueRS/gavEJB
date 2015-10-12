/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "field_data_field_pvp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldPvp.findAll", query = "SELECT f FROM FieldDataFieldPvp f"),
    @NamedQuery(name = "FieldDataFieldPvp.findByEntityType", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldDataFieldPvpPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldPvp.findByBundle", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldPvp.findByDeleted", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldDataFieldPvpPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldPvp.findByEntityId", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldDataFieldPvpPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldPvp.findByRevisionId", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldPvp.findByLanguage", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldDataFieldPvpPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldPvp.findByDelta", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldDataFieldPvpPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldPvp.findByFieldPvpValue", query = "SELECT f FROM FieldDataFieldPvp f WHERE f.fieldPvpValue = :fieldPvpValue")})
public class FieldDataFieldPvp implements Serializable {
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "field_pvp_value")
    private BigDecimal fieldPvpValue;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldPvpPK fieldDataFieldPvpPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;

    public FieldDataFieldPvp() {
    }

    public FieldDataFieldPvp(FieldDataFieldPvpPK fieldDataFieldPvpPK) {
        this.fieldDataFieldPvpPK = fieldDataFieldPvpPK;
    }

    public FieldDataFieldPvp(FieldDataFieldPvpPK fieldDataFieldPvpPK, String bundle) {
        this.fieldDataFieldPvpPK = fieldDataFieldPvpPK;
        this.bundle = bundle;
    }

    public FieldDataFieldPvp(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldPvpPK = new FieldDataFieldPvpPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldPvpPK getFieldDataFieldPvpPK() {
        return fieldDataFieldPvpPK;
    }

    public void setFieldDataFieldPvpPK(FieldDataFieldPvpPK fieldDataFieldPvpPK) {
        this.fieldDataFieldPvpPK = fieldDataFieldPvpPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldPvpPK != null ? fieldDataFieldPvpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldPvp)) {
            return false;
        }
        FieldDataFieldPvp other = (FieldDataFieldPvp) object;
        if ((this.fieldDataFieldPvpPK == null && other.fieldDataFieldPvpPK != null) || (this.fieldDataFieldPvpPK != null && !this.fieldDataFieldPvpPK.equals(other.fieldDataFieldPvpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldPvp[ fieldDataFieldPvpPK=" + fieldDataFieldPvpPK + " ]";
    }

    public BigDecimal getFieldPvpValue() {
        return fieldPvpValue;
    }

    public void setFieldPvpValue(BigDecimal fieldPvpValue) {
        this.fieldPvpValue = fieldPvpValue;
    }
    
}
