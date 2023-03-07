package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, October 2022
 * Time: 5:47 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.transaction.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class TransactionTradingPartnerDto {

    /**
     * The primary key of the trading partner
     */
    @JsonProperty(required = false)
    @Schema(description = "Trading Partner SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID tradingPartnerSK;

    /**
     * The transaction that the trading partner is associated
     */
    @JsonProperty(required = true)
    private TransactionDto transaction;

    /**
     * The trading partner id associated with the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The trading partner id associated with the transaction", example = "99130", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String tradingPartnerId;

    /**
     * The line of business type code associated with the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The line of business type code associated with the transaction", example = "HIX", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String lineOfBusinessTypeCode;

    /**
     * The business type code associated with the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The business type code associated with the transaction", example = "MP_FL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String businessTypeCode;

    /**
     * The marketplace type code associated with the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The marketplace type code associated with the transaction", example = "FFM", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String marketplaceTypeCode;

    /**
     * The state type code associated with the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The state type code associated with the transaction", example = "FL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String stateTypeCode;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionTradingPartnerDto{" +
                "tradingPartnerSK=" + tradingPartnerSK +
                ", transaction=" + transaction +
                ", tradingPartnerId='" + tradingPartnerId + '\'' +
                ", lineOfBusinessTypeCode='" + lineOfBusinessTypeCode + '\'' +
                ", businessTypeCode='" + businessTypeCode + '\'' +
                ", marketplaceTypeCode='" + marketplaceTypeCode + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
