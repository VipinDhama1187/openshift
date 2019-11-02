/**
 * 
 */
package com.spring.openshift.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Customer.
 *
 * @author avadheshkumar
 */

@Table(name = "CUSTOMER")
@Entity
public class Customer {

    /** The customer id. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    /** The customer name. */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /** The district. */
    @Column(name = "DISTRICT")
    private String district;

    /**
     * Gets the customer id.
     *
     * @return the customer id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customer id.
     *
     * @param customerId
     *        the new customer id
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the customer name.
     *
     * @return the customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the customer name.
     *
     * @param customerName
     *        the new customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets the district.
     *
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the district.
     *
     * @param district
     *        the new district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     *
     * @return the string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", district=" + district + "]";
    }

}
