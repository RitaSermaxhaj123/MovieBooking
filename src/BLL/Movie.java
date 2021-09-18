/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 38344
 */
@Entity
@Table(name = "Movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findByMovieID", query = "SELECT m FROM Movie m WHERE m.movieID = :movieID"),
    @NamedQuery(name = "Movie.findByMTitle", query = "SELECT m FROM Movie m WHERE m.mTitle = :mTitle"),
    @NamedQuery(name = "Movie.findByMType", query = "SELECT m FROM Movie m WHERE m.mType = :mType"),
    @NamedQuery(name = "Movie.findByMDuration", query = "SELECT m FROM Movie m WHERE m.mDuration = :mDuration"),
    @NamedQuery(name = "Movie.findByMDesc", query = "SELECT m FROM Movie m WHERE m.mDesc = :mDesc"),
    @NamedQuery(name = "Movie.findByMLanguage", query = "SELECT m FROM Movie m WHERE m.mLanguage = :mLanguage")})
public class Movie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MovieID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer movieID;
    @Basic(optional = false)
    @Column(name = "mTitle")
    private String mTitle;
    @Basic(optional = false)
    @Column(name = "mType")
    private String mType;
    @Column(name = "mDuration")
    @Temporal(TemporalType.TIME)
    private Date mDuration;
    @Basic(optional = false)
    @Column(name = "mDesc")
    private String mDesc;
    @Basic(optional = false)
    @Column(name = "mLanguage")
    private String mLanguage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movie")
    private Collection<ShowTime> showTimeCollection;

    public Movie() {
    }

    public Movie(Integer movieID) {
        this.movieID = movieID;
    }

    public Movie(Integer movieID, String mTitle, String mType, String mDesc, String mLanguage) {
        this.movieID = movieID;
        this.mTitle = mTitle;
        this.mType = mType;
        this.mDesc = mDesc;
        this.mLanguage = mLanguage;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getMTitle() {
        return mTitle;
    }

    public void setMTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getMType() {
        return mType;
    }

    public void setMType(String mType) {
        this.mType = mType;
    }

    public Date getMDuration() {
        return mDuration;
    }

    public void setMDuration(Date mDuration) {
        this.mDuration = mDuration;
    }

    public String getMDesc() {
        return mDesc;
    }

    public void setMDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getMLanguage() {
        return mLanguage;
    }

    public void setMLanguage(String mLanguage) {
        this.mLanguage = mLanguage;
    }

    @XmlTransient
    public Collection<ShowTime> getShowTimeCollection() {
        return showTimeCollection;
    }

    public void setShowTimeCollection(Collection<ShowTime> showTimeCollection) {
        this.showTimeCollection = showTimeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieID != null ? movieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieID == null && other.movieID != null) || (this.movieID != null && !this.movieID.equals(other.movieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie" + mTitle;
    }
    
}
