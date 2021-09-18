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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ShowTime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShowTime.findAll", query = "SELECT s FROM ShowTime s"),
    @NamedQuery(name = "ShowTime.findByShowID", query = "SELECT s FROM ShowTime s WHERE s.showID = :showID"),
    @NamedQuery(name = "ShowTime.findByShSDate", query = "SELECT s FROM ShowTime s WHERE s.shSDate = :shSDate"),
    @NamedQuery(name = "ShowTime.findByShEDate", query = "SELECT s FROM ShowTime s WHERE s.shEDate = :shEDate"),
    @NamedQuery(name = "ShowTime.findByShTime", query = "SELECT s FROM ShowTime s WHERE s.shTime = :shTime")})
public class ShowTime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ShowID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer showID;
    @Basic(optional = false)
    @Column(name = "shSDate")
    @Temporal(TemporalType.DATE)
    private Date shSDate;
    @Basic(optional = false)
    @Column(name = "shEDate")
    @Temporal(TemporalType.DATE)
    private Date shEDate;
    @Basic(optional = false)
    @Column(name = "shTime")
    @Temporal(TemporalType.TIME)
    private Date shTime;
    @JoinColumn(name = "Hall", referencedColumnName = "HallID")
    @ManyToOne(optional = false)
    private Hall hall;
    @JoinColumn(name = "Movie", referencedColumnName = "MovieID")
    @ManyToOne(optional = false)
    private Movie movie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "show")
    private Collection<Booking> bookingCollection;

    public ShowTime() {
    }

    public ShowTime(Integer showID) {
        this.showID = showID;
    }

    public ShowTime(Integer showID, Date shSDate, Date shEDate, Date shTime) {
        this.showID = showID;
        this.shSDate = shSDate;
        this.shEDate = shEDate;
        this.shTime = shTime;
    }

    public Integer getShowID() {
        return showID;
    }

    public void setShowID(Integer showID) {
        this.showID = showID;
    }

    public Date getShSDate() {
        return shSDate;
    }

    public void setShSDate(Date shSDate) {
        this.shSDate = shSDate;
    }

    public Date getShEDate() {
        return shEDate;
    }

    public void setShEDate(Date shEDate) {
        this.shEDate = shEDate;
    }

    public Date getShTime() {
        return shTime;
    }

    public void setShTime(Date shTime) {
        this.shTime = shTime;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (showID != null ? showID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShowTime)) {
            return false;
        }
        ShowTime other = (ShowTime) object;
        if ((this.showID == null && other.showID != null) || (this.showID != null && !this.showID.equals(other.showID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.ShowTime[ showID=" + showID + " ]";
    }
    
}
