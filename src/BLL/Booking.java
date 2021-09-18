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
@Table(name = "Booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b"),
    @NamedQuery(name = "Booking.findByBookingID", query = "SELECT b FROM Booking b WHERE b.bookingID = :bookingID"),
    @NamedQuery(name = "Booking.findByBDate", query = "SELECT b FROM Booking b WHERE b.bDate = :bDate"),
    @NamedQuery(name = "Booking.findByBCount", query = "SELECT b FROM Booking b WHERE b.bCount = :bCount"),
    @NamedQuery(name = "Booking.findByBPrice", query = "SELECT b FROM Booking b WHERE b.bPrice = :bPrice")})
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BookingID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer bookingID;
    @Basic(optional = false)
    @Column(name = "bDate")
    @Temporal(TemporalType.DATE)
    private Date bDate;
    @Basic(optional = false)
    @Column(name = "bCount")
    private int bCount;
    @Basic(optional = false)
    @Column(name = "bPrice")
    private long bPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "booking")
    private Collection<Ticket> ticketCollection;
    @JoinColumn(name = "HallSeat", referencedColumnName = "SeatID")
    @ManyToOne(optional = false)
    private HallSeat hallSeat;
    @JoinColumn(name = "Show", referencedColumnName = "ShowID")
    @ManyToOne(optional = false)
    private ShowTime show;

    public Booking() {
    }

    public Booking(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Booking(Integer bookingID, Date bDate, int bCount, long bPrice) {
        this.bookingID = bookingID;
        this.bDate = bDate;
        this.bCount = bCount;
        this.bPrice = bPrice;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Date getBDate() {
        return bDate;
    }

    public void setBDate(Date bDate) {
        this.bDate = bDate;
    }

    public int getBCount() {
        return bCount;
    }

    public void setBCount(int bCount) {
        this.bCount = bCount;
    }

    public long getBPrice() {
        return bPrice;
    }

    public void setBPrice(long bPrice) {
        this.bPrice = bPrice;
    }

    @XmlTransient
    public Collection<Ticket> getTicketCollection() {
        return ticketCollection;
    }

    public void setTicketCollection(Collection<Ticket> ticketCollection) {
        this.ticketCollection = ticketCollection;
    }

    public HallSeat getHallSeat() {
        return hallSeat;
    }

    public void setHallSeat(HallSeat hallSeat) {
        this.hallSeat = hallSeat;
    }

    public ShowTime getShow() {
        return show;
    }

    public void setShow(ShowTime show) {
        this.show = show;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingID != null ? bookingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookingID == null && other.bookingID != null) || (this.bookingID != null && !this.bookingID.equals(other.bookingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Booking[ bookingID=" + bookingID + " ]";
    }
    
}
