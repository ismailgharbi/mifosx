package org.mifosplatform.infrastructure.configuration.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MonetaryCurrency implements Serializable {

	@Column(name = "currency_code", length = 3, nullable=false)
	private final String code;

	@Column(name = "currency_digits", nullable=false)
	private final int digitsAfterDecimal;

	protected MonetaryCurrency() {
		this.code = null;
		this.digitsAfterDecimal = 0;
	}

	public MonetaryCurrency(final String code, final int digitsAfterDecimal) {
		this.code = code;
		this.digitsAfterDecimal = digitsAfterDecimal;
	}
	
	public MonetaryCurrency copy() {
		return new MonetaryCurrency(this.code, this.digitsAfterDecimal);
	}

	public String getCode() {
		return code;
	}

	public int getDigitsAfterDecimal() {
		return digitsAfterDecimal;
	}
}