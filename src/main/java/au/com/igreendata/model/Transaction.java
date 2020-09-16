package au.com.igreendata.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ttransaction")
public class Transaction {

    private long id;
    private String trNumber;
    private String trName;
    private Date trValueDate;
    private String trCurrency;
    private BigDecimal trDebitAmount;
    private BigDecimal trCreditAmount;
    private String trDebitCredit;
    private String trNarrative;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "tr_num", nullable = true, length = 15)
    public String getTrNumber() {
        return trNumber;
    }

    public void setTrNumber(String trNumber) {
        this.trNumber = trNumber;
    }

    @Column(name = "tr_name", nullable = true, length = 20)
    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "tr_value_date", nullable = true, length = 10)
    public Date getTrValueDate() {
        return trValueDate;
    }

    public void setTrValueDate(Date trValueDate) {
        this.trValueDate = trValueDate;
    }

    @Column(name = "tr_currency", nullable = true, length = 10)
    public String getTrCurrency() {
        return trCurrency;
    }

    public void setTrCurrency(String trCurrency) {
        this.trCurrency = trCurrency;
    }

    @Column(name = "tr_debit_amount", nullable = true, precision = 12)
    public BigDecimal getTrDebitAmount() {
        return trDebitAmount;
    }

    public void setTrDebitAmount(BigDecimal trDebitAmount) {
        this.trDebitAmount = trDebitAmount;
    }

    @Column(name = "tr_credit_amount", nullable = true, precision = 12)
    public BigDecimal getTrCreditAmount() {
        return trCreditAmount;
    }

    public void setTrCreditAmount(BigDecimal trCreditAmount) {
        this.trCreditAmount = trCreditAmount;
    }

    @Column(name = "tr_debit_credit", nullable = true, length = 10)
    public String getTrDebitCredit() {
        return trDebitCredit;
    }

    public void setTrDebitCredit(String trDebitCredit) {
        this.trDebitCredit = trDebitCredit;
    }

    @Column(name = "tr_narrative", nullable = true, length = 500)
    public String getTrNarrative() {
        return trNarrative;
    }

    public void setTrNarrative(String trNarrative) {
        this.trNarrative = trNarrative;
    }
}
