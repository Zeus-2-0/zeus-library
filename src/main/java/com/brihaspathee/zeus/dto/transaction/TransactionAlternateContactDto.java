package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * Time: 5:49 PM
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
public class TransactionAlternateContactDto {

    /**
     * The primary key of the transaction alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "Alternate Contact SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID alternateContactSK;

    /**
     * The member to whom the alternate contact is associated
     */
    @JsonProperty(required = true)
    private TransactionMemberDto member;

    /**
     * The type code of the alternate contact
     */
    @JsonProperty(required = true)
    @Schema(description = "The type code of the alternate contact", example = "CUSTPARENT", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String alternateContactTypeCode;

    /**
     * The first name of the alternate contact
     */
    @JsonProperty(required = true)
    @Schema(description = "The first name of the alternate contact", example = "John", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String firstName;

    /**
     * The middle name of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The middle name of the alternate contact", example = "Mosley", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String middleName;

    /**
     * The last name of the alternate contact
     */
    @JsonProperty(required = true)
    @Schema(description = "The last name of the alternate contact", example = "Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String lastName;

    /**
     * The type of identifier of the identifier
     */
    @JsonProperty(required = false)
    @Schema(description = "The identifier type of the identifier", example = "SSN", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierTypeCode;

    /**
     * The identifier received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The identifier received for the alternate contact", example = "999-99-9999", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierValue;

    /**
     * The type of phone received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The type of phone received for the alternate contact", example = "CELL", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneTypeCode;

    /**
     * The phone number received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The phone number received for the alternate contact", example = "813-357-9150", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneNumber;

    /**
     * The email received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The email received for the alternate contact", example = "vbalaji215@gmail.com", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String email;

    /**
     * The address line 1 of the address received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The address line 1 of the address received for the alternate contact", example = "123 Main Street", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine1;

    /**
     * The address line 2 of the address received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The address line 2 of the address received for the alternate contact", example = "Apt 301", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine2;

    /**
     * The city of the address received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The city of the address received for the alternate contact", example = "Tampa", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String city;

    /**
     * The state of the address received for the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The state of the address received for the alternate contact", example = "FL", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String stateTypeCode;

    /**
     * The zip code received in the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The zip code received in the address", example = "33556", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String zipCode;

    /**
     * The date when the alternate contact was received
     */
    @JsonProperty(required = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="EST" )
    @Schema(description = "The date when the alternate contact was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime receivedDate;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionAlternateContactDto{" +
                "alternateContactSK=" + alternateContactSK +
                ", member=" + member +
                ", alternateContactTypeCode='" + alternateContactTypeCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identifierTypeCode='" + identifierTypeCode + '\'' +
                ", identifierValue='" + identifierValue + '\'' +
                ", phoneTypeCode='" + phoneTypeCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
