package ros.java.spring.entity;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="owner", schema="restaurantorderingsystem")
public class EntityOwner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private int ownerId;
	
	@Column(name="companyName", nullable=false)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String ownerCompanyName;
	
	@Column(name="street", nullable=false)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String ownerStreet;
	
	@Column(name="zipCode", nullable=false)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String ownerZipCode;
	
	@Column(name="city", nullable=false)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String ownerCity;
	
	@Column(name="ico")
	@Length(min=6, max=8)
	private String ownerICO;
	
	@Column(name="dic", length=10)
	private String ownerDIC;
	
	@Column(name="icDph", length=12)
	private String ownerIcDPH;
	
	@Column(name="email", nullable=false)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String ownerEmail;
	
	@Column(name="password", nullable=false)
	@NotNull(message="is required")
	@Size(min=6, message="password must contain min 6 characters")
	private String ownerPassword;
	
	@Transient
	private String ownerCheckPassword;
	
	
	@Column(name="registrationDate")
	private Timestamp registrationDate;
	
	// first and last name is needed if owner is enterpreneur not a company
	@Column(name="firstName", nullable=true)
	@Size(min=1, message="is required")
	private String ownerFirstName;
	
	@Column(name="lastName", nullable=true)
	@Size(min=1, message="is required")
	private String ownerLastName;
	
	@Column(name="phoneNumber", nullable=false)
	@NotNull(message="is required")
	private String ownerPhoneNumber;
	
	//invoice address is needed if its different than ownerAddress
	@Column(name="invoiceStreet", nullable=true)
	private String ownerInvoiceStreet;
	
	@Column(name="invoiceZipCode", nullable=true)
	private String ownerInvoiceZipCode;
	
	@Column(name="invoiceCity", nullable=true)
	private String ownerInvoiceCity;
	
	
	public EntityOwner() {
		
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerCompanyName() {
		return ownerCompanyName;
	}

	public void setOwnerCompanyName(String ownerCompanyName) {
		this.ownerCompanyName = ownerCompanyName;
	}



	public String getOwnerStreet() {
		return ownerStreet;
	}

	public void setOwnerStreet(String ownerStreet) {
		this.ownerStreet = ownerStreet;
	}

	public String getOwnerZipCode() {
		return ownerZipCode;
	}

	public void setOwnerZipCode(String ownerZipCode) {
		this.ownerZipCode = ownerZipCode;
	}

	public String getOwnerCity() {
		return ownerCity;
	}

	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	public String getOwnerICO() {
		return ownerICO;
	}

	public void setOwnerICO(String ownerICO) {
		this.ownerICO = ownerICO;
	}

	public String getOwnerDIC() {
		return ownerDIC;
	}

	public void setOwnerDIC(String ownerDIC) {
		this.ownerDIC = ownerDIC;
	}

	public String getOwnerIcDPH() {
		return ownerIcDPH;
	}

	public void setOwnerIcDPH(String ownerIcDPH) {
		this.ownerIcDPH = ownerIcDPH;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	public String getOwnerCheckPassword() {
		return ownerCheckPassword;
	}

	public void setOwnerCheckPassword(String ownerCheckPassword) {
		this.ownerCheckPassword = ownerCheckPassword;
	}

	public Timestamp getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	

	public String getOwnerInvoiceStreet() {
		return ownerInvoiceStreet;
	}

	public void setOwnerInvoiceStreet(String ownerInvoiceStreet) {
		this.ownerInvoiceStreet = ownerInvoiceStreet;
	}

	public String getOwnerInvoiceZipCode() {
		return ownerInvoiceZipCode;
	}

	public void setOwnerInvoiceZipCode(String ownerInvoiceZipCode) {
		this.ownerInvoiceZipCode = ownerInvoiceZipCode;
	}

	public String getOwnerInvoiceCity() {
		return ownerInvoiceCity;
	}

	public void setOwnerInvoiceCity(String ownerInvoiceCity) {
		this.ownerInvoiceCity = ownerInvoiceCity;
	}

	
	
	@Override
	public String toString() {
		return "EntityOwner [ownerId=" + ownerId + ", ownerCompanyName=" + ownerCompanyName + ", ownerStreet="
				+ ownerStreet + ", ownerZipCode=" + ownerZipCode + ", ownerCity=" + ownerCity + ", ownerICO=" + ownerICO
				+ ", ownerDIC=" + ownerDIC + ", ownerIcDPH=" + ownerIcDPH + ", ownerEmail=" + ownerEmail
				+ ", ownerPassword=" + ownerPassword + ", ownerCheckPassword=" + ownerCheckPassword
				+ ", registrationDate=" + registrationDate + ", ownerFirstName=" + ownerFirstName + ", ownerLastName="
				+ ownerLastName + ", ownerPhoneNumber=" + ownerPhoneNumber + ", ownerInvoiceStreet="
				+ ownerInvoiceStreet + ", ownerInvoiceZipCode=" + ownerInvoiceZipCode + ", ownerInvoiceCity="
				+ ownerInvoiceCity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerCheckPassword == null) ? 0 : ownerCheckPassword.hashCode());
		result = prime * result + ((ownerCity == null) ? 0 : ownerCity.hashCode());
		result = prime * result + ((ownerCompanyName == null) ? 0 : ownerCompanyName.hashCode());
		result = prime * result + ((ownerDIC == null) ? 0 : ownerDIC.hashCode());
		result = prime * result + ((ownerEmail == null) ? 0 : ownerEmail.hashCode());
		result = prime * result + ((ownerFirstName == null) ? 0 : ownerFirstName.hashCode());
		result = prime * result + ((ownerICO == null) ? 0 : ownerICO.hashCode());
		result = prime * result + ((ownerIcDPH == null) ? 0 : ownerIcDPH.hashCode());
		result = prime * result + ownerId;
		result = prime * result + ((ownerInvoiceCity == null) ? 0 : ownerInvoiceCity.hashCode());
		result = prime * result + ((ownerInvoiceStreet == null) ? 0 : ownerInvoiceStreet.hashCode());
		result = prime * result + ((ownerInvoiceZipCode == null) ? 0 : ownerInvoiceZipCode.hashCode());
		result = prime * result + ((ownerLastName == null) ? 0 : ownerLastName.hashCode());
		result = prime * result + ((ownerPassword == null) ? 0 : ownerPassword.hashCode());
		result = prime * result + ((ownerPhoneNumber == null) ? 0 : ownerPhoneNumber.hashCode());
		result = prime * result + ((ownerStreet == null) ? 0 : ownerStreet.hashCode());
		result = prime * result + ((ownerZipCode == null) ? 0 : ownerZipCode.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityOwner other = (EntityOwner) obj;
		if (ownerCheckPassword == null) {
			if (other.ownerCheckPassword != null)
				return false;
		} else if (!ownerCheckPassword.equals(other.ownerCheckPassword))
			return false;
		if (ownerCity == null) {
			if (other.ownerCity != null)
				return false;
		} else if (!ownerCity.equals(other.ownerCity))
			return false;
		if (ownerCompanyName == null) {
			if (other.ownerCompanyName != null)
				return false;
		} else if (!ownerCompanyName.equals(other.ownerCompanyName))
			return false;
		if (ownerDIC == null) {
			if (other.ownerDIC != null)
				return false;
		} else if (!ownerDIC.equals(other.ownerDIC))
			return false;
		if (ownerEmail == null) {
			if (other.ownerEmail != null)
				return false;
		} else if (!ownerEmail.equals(other.ownerEmail))
			return false;
		if (ownerFirstName == null) {
			if (other.ownerFirstName != null)
				return false;
		} else if (!ownerFirstName.equals(other.ownerFirstName))
			return false;
		if (ownerICO == null) {
			if (other.ownerICO != null)
				return false;
		} else if (!ownerICO.equals(other.ownerICO))
			return false;
		if (ownerIcDPH == null) {
			if (other.ownerIcDPH != null)
				return false;
		} else if (!ownerIcDPH.equals(other.ownerIcDPH))
			return false;
		if (ownerId != other.ownerId)
			return false;
		if (ownerInvoiceCity == null) {
			if (other.ownerInvoiceCity != null)
				return false;
		} else if (!ownerInvoiceCity.equals(other.ownerInvoiceCity))
			return false;
		if (ownerInvoiceStreet == null) {
			if (other.ownerInvoiceStreet != null)
				return false;
		} else if (!ownerInvoiceStreet.equals(other.ownerInvoiceStreet))
			return false;
		if (ownerInvoiceZipCode == null) {
			if (other.ownerInvoiceZipCode != null)
				return false;
		} else if (!ownerInvoiceZipCode.equals(other.ownerInvoiceZipCode))
			return false;
		if (ownerLastName == null) {
			if (other.ownerLastName != null)
				return false;
		} else if (!ownerLastName.equals(other.ownerLastName))
			return false;
		if (ownerPassword == null) {
			if (other.ownerPassword != null)
				return false;
		} else if (!ownerPassword.equals(other.ownerPassword))
			return false;
		if (ownerPhoneNumber == null) {
			if (other.ownerPhoneNumber != null)
				return false;
		} else if (!ownerPhoneNumber.equals(other.ownerPhoneNumber))
			return false;
		if (ownerStreet == null) {
			if (other.ownerStreet != null)
				return false;
		} else if (!ownerStreet.equals(other.ownerStreet))
			return false;
		if (ownerZipCode == null) {
			if (other.ownerZipCode != null)
				return false;
		} else if (!ownerZipCode.equals(other.ownerZipCode))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		return true;
	}

	
	
	
	
	

}
