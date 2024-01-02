package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, March 2022
 * Time: 3:11 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto {

    /**
     * The primary key of the account in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID accountSK;

    /**
     * The account number of the account
     */
    @JsonProperty(required = true)
    @Schema(description = "Account Number - Unique id that is assigned to the account", example = "DFEV323455DE5S3", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String accountNumber;

    /**
     * The line of business associated with the account
     */
    @JsonProperty(required = true)
    @Schema(description = "Line of business of the account", example = "HIX", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String lineOfBusinessTypeCode;

    /**
     * The zeus transaction control number of the transaction that created the account
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the account", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * List of enrollment spans associated with the account
     */
    @JsonProperty(required = true)
    private Set<EnrollmentSpanDto> enrollmentSpans;

    /**
     * List of members associated with the account
     */
    @JsonProperty(required = true)
    private Set<MemberDto> members;

    /**
     * List of brokers associated with the account
     */
    @JsonProperty(required = true)
    private Set<BrokerDto> brokers;

    /**
     * List of sponsors associated with the account
     */
    @JsonProperty(required = true)
    private Set<SponsorDto> sponsors;

    /**
     * List of payers associated with the account
     */
    @JsonProperty(required = true)
    private Set<PayerDto> payers;

    /**
     * Account attributes associated with the account
     */
    @JsonProperty(required = false)
    private Set<AccountAttributeDto> accountAttributes;

    /**
     * The date when the account was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was created", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the account was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was updated", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "AccountDto{" +
                "accountSK=" + accountSK +
                ", accountNumber='" + accountNumber + '\'' +
                ", lineOfBusinessTypeCode='" + lineOfBusinessTypeCode + '\'' +
                ", enrollmentSpans=" + enrollmentSpans +
                ", members=" + members +
                ", brokers=" + brokers +
                ", sponsors=" + sponsors +
                ", payers=" + payers +
                ", accountAttributes=" + accountAttributes +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
