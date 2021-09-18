/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 38344
 */
@Entity
@Table(name = "HallSeat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HallSeat.findAll", query = "SELECT h FROM HallSeat h"),
    @NamedQuery(name = "HallSeat.findBySeatID", query = "SELECT h FROM HallSeat h WHERE h.seatID = :seatID"),
    @NamedQuery(name = "HallSeat.findBySeatNumber", query = "SELECT h FROM HallSeat h WHERE h.seatNumber = :seatNumber"),
    @NamedQuery(name = "HallSeat.findBySeatAvailaible", query = "SELECT h FROM HallSeat h WHERE h.seatAvailaible = :seatAvailaible")})
public class HallSeat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SeatID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer seatID;
    @Column(name = "SeatNumber")
    private Integer seatNumber;
    @Column(name = "SeatAvailaible")
    private Boolean seatAvailaible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hallSeat")
    private Collection<Booking> bookingCollection;
    @JoinColumn(name = "HallID", referencedColumnName = "HallID")
    @ManyToOne
    private Hall hallID;

    public HallSeat() {
    }

    public HallSeat(Integer seatID) {
        this.seatID = seatID;
    }

    public Integer getSeatID() {
        return seatID;
    }

    public void setSeatID(Integer seatID) {
        this.seatID = seatID;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getSeatAvailaible() {
        return seatAvailaible;
    }

    public void setSeatAvailaible(Boolean seatAvailaible) {
        this.seatAvailaible = seatAvailaible;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
    }

    public Hall getHallID() {
        return hallID;
    }

    public void setHallID(Hall hallID) {
        this.hallID = hallID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seatID != null ? seatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HallSeat)) {
            return false;
        }
        HallSeat other = (HallSeat) object;
        if ((this.seatID == null && other.seatID != null) || (this.seatID != null && !this.seatID.equals(other.seatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.HallSeat[ seatID=" + seatID + " ]";
    }
    
}
