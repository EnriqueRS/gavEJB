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
@Table(name = "field_data_field_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldImage.findAll", query = "SELECT f FROM FieldDataFieldImage f"),
    @NamedQuery(name = "FieldDataFieldImage.findByEntityType", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldDataFieldImagePK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldImage.findByBundle", query = "SELECT f FROM FieldDataFieldImage f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldImage.findByDeleted", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldDataFieldImagePK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldImage.findByEntityId", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldDataFieldImagePK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldImage.findByRevisionId", query = "SELECT f FROM FieldDataFieldImage f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldImage.findByLanguage", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldDataFieldImagePK.language = :language"),
    @NamedQuery(name = "FieldDataFieldImage.findByDelta", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldDataFieldImagePK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldImage.findByFieldImageFid", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldImageFid = :fieldImageFid"),
    @NamedQuery(name = "FieldDataFieldImage.findByFieldImageAlt", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldImageAlt = :fieldImageAlt"),
    @NamedQuery(name = "FieldDataFieldImage.findByFieldImageTitle", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldImageTitle = :fieldImageTitle"),
    @NamedQuery(name = "FieldDataFieldImage.findByFieldImageWidth", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldImageWidth = :fieldImageWidth"),
    @NamedQuery(name = "FieldDataFieldImage.findByFieldImageHeight", query = "SELECT f FROM FieldDataFieldImage f WHERE f.fieldImageHeight = :fieldImageHeight")})
public class FieldDataFieldImage implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldImagePK fieldDataFieldImagePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_image_fid")
    private Integer fieldImageFid;
    @Size(max = 512)
    @Column(name = "field_image_alt")
    private String fieldImageAlt;
    @Size(max = 1024)
    @Column(name = "field_image_title")
    private String fieldImageTitle;
    @Column(name = "field_image_width")
    private Integer fieldImageWidth;
    @Column(name = "field_image_height")
    private Integer fieldImageHeight;

    public FieldDataFieldImage() {
    }

    public FieldDataFieldImage(FieldDataFieldImagePK fieldDataFieldImagePK) {
        this.fieldDataFieldImagePK = fieldDataFieldImagePK;
    }

    public FieldDataFieldImage(FieldDataFieldImagePK fieldDataFieldImagePK, String bundle) {
        this.fieldDataFieldImagePK = fieldDataFieldImagePK;
        this.bundle = bundle;
    }

    public FieldDataFieldImage(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldImagePK = new FieldDataFieldImagePK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldImagePK getFieldDataFieldImagePK() {
        return fieldDataFieldImagePK;
    }

    public void setFieldDataFieldImagePK(FieldDataFieldImagePK fieldDataFieldImagePK) {
        this.fieldDataFieldImagePK = fieldDataFieldImagePK;
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

    public Integer getFieldImageFid() {
        return fieldImageFid;
    }

    public void setFieldImageFid(Integer fieldImageFid) {
        this.fieldImageFid = fieldImageFid;
    }

    public String getFieldImageAlt() {
        return fieldImageAlt;
    }

    public void setFieldImageAlt(String fieldImageAlt) {
        this.fieldImageAlt = fieldImageAlt;
    }

    public String getFieldImageTitle() {
        return fieldImageTitle;
    }

    public void setFieldImageTitle(String fieldImageTitle) {
        this.fieldImageTitle = fieldImageTitle;
    }

    public Integer getFieldImageWidth() {
        return fieldImageWidth;
    }

    public void setFieldImageWidth(Integer fieldImageWidth) {
        this.fieldImageWidth = fieldImageWidth;
    }

    public Integer getFieldImageHeight() {
        return fieldImageHeight;
    }

    public void setFieldImageHeight(Integer fieldImageHeight) {
        this.fieldImageHeight = fieldImageHeight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldImagePK != null ? fieldDataFieldImagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldImage)) {
            return false;
        }
        FieldDataFieldImage other = (FieldDataFieldImage) object;
        if ((this.fieldDataFieldImagePK == null && other.fieldDataFieldImagePK != null) || (this.fieldDataFieldImagePK != null && !this.fieldDataFieldImagePK.equals(other.fieldDataFieldImagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldImage[ fieldDataFieldImagePK=" + fieldDataFieldImagePK + " ]";
    }
    
}
