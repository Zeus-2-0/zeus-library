package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;
import org.springframework.cglib.core.Local;

//import jakarta.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, October 2022
 * Time: 5:48 PM
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
public class TransactionMemberDto {

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberSK;

    /**
     * TransactionSK of the transaction the member is associated
     */
    @JsonProperty(required = false)
    private UUID transactionSK;

    /**
     * Unique member code assigned for the member during transaction processing
     */
    @JsonProperty(required = true)
    @Schema(description = "Unique member code assigned for the member during transaction processing",
            example = "DR323FS55WGS53D",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String transactionMemberCode;

    /**
     * If the member in the transaction is matched to a member in the account (MMS)
     * this field will be populated with the code assigned to the member in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Member code assigned to the member in MMS",
            example = "DR323FS55WGS53D",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String mmsMemberCode;

    /**
     * Transaction type received for the member in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "Transaction type received for the member in the transaction", example = "ADD",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String transactionTypeCode;

    /**
     * Effective date received for the member in the transaction
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "Effective date received for the member in the transaction", example = "01/01/2023",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate effectiveDate;

    /**
     * End date received for the member in the transaction
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "End date received for the member in the transaction", example = "12/31/2023",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The relationship type code of the member with respect to head of the household
     */
    @JsonProperty(required = true)
    @Schema(description = "The relationship of the member with the head of the household", example = "HOH",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String relationshipTypeCode;

    /**
     * The maintenance reason type code received for the member in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The maintenance reason type code received for the member in the transaction",
            example = "BIRTH", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String reasonTypeCode;

    /**
     * The first name of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The first name of the member", example = "John",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String firstName;

    /**
     * The middle name of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The middle name of the member", example = "Mosley",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String middleName;

    /**
     * The last name of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The last name of the member", example = "Doe",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String lastName;

    /**
     * Identifies if the member uses tobacco
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the member uses tobacco", example = "UNKNOWN",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String tobaccoIndicator;

    /**
     * The date of birth of the member
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The date of birth of the member", example = "5/21/1983",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate dateOfBirth;

    /**
     * The gender of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The gender of the member", example = "MALE",
            requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String genderTypeCode;

    /**
     * The member rate received in the transaction
     */
    @JsonProperty(required = false)
    @Schema(description = "The rate received for the member in the transaction", example = "115.35",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal memberRate;

    /**
     * The height of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The height of the member in the transaction", example = "125",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private double height;

    /**
     * The weight of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The weight of the member in the transaction", example = "135.65",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private double weight;

    /**
     * The product catalog rate received for the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The product catalog rate received for the member", example = "115.35",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal productCatalogRate;

    /**
     * Phone numbers received in the transaction for the member
     */
    @JsonProperty(required = false)
    private List<TransactionMemberPhoneDto> memberPhones;

    /**
     * Addresses received for the member in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionMemberAddressDto> memberAddresses;

    /**
     * Identifiers received for the member in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionMemberIdentifierDto> identifiers;

    /**
     * Emails received for the member in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionMemberEmailDto> emails;

    /**
     * Languages received for the member in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionMemberLanguageDto> languages;

    /**
     * Alternate contacts received for the member
     */
    @JsonProperty(required = false)
    private List<TransactionAlternateContactDto> alternateContacts;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was created", example = "12/15/2021",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was updated", example = "12/15/2021",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * This is a hashmap of the codes that should be used when creating the account from the transaction
     * in unit test mode or integration test mode
     * This is used only for unit testing and integration testing
     */
    @JsonProperty(required = false)
    @Schema(description = "Map of the codes to be used for entities within a member",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Map<String, List<String>> entityCodes = new HashMap<>();


    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "TransactionMemberDto{" +
                "memberSK=" + memberSK +
                ", transactionSK=" + transactionSK +
                ", transactionMemberCode='" + transactionMemberCode + '\'' +
                ", mmsMemberCode='" + mmsMemberCode + '\'' +
                ", transactionTypeCode='" + transactionTypeCode + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", endDate=" + endDate +
                ", relationshipTypeCode='" + relationshipTypeCode + '\'' +
                ", reasonTypeCode='" + reasonTypeCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tobaccoIndicator='" + tobaccoIndicator + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", genderTypeCode='" + genderTypeCode + '\'' +
                ", memberRate=" + memberRate +
                ", height=" + height +
                ", weight=" + weight +
                ", productCatalogRate=" + productCatalogRate +
                ", memberPhones=" + memberPhones +
                ", memberAddresses=" + memberAddresses +
                ", identifiers=" + identifiers +
                ", emails=" + emails +
                ", languages=" + languages +
                ", alternateContacts=" + alternateContacts +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", entityCodes=" + entityCodes +
                '}';
    }
}
