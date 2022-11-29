package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2022
 * Time: 12:09 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlternateContactDto {

    /**
     * The primary key of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "Alternate Contact SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID alternateContactSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The unique code of the alternate contact in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Alternate Contact Code - Unique id that is assigned to the alternate contact in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String alternateContactCode;

    /**
     * The type of alternate contact
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of alternate contact", example = "RESPONSIBLE_PERSON", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String alternateContactTypeCode;

    /**
     * The first name of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The first name of the alternate contact", example = "John", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String firstName;

    /**
     * The middle name of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The middle name of the alternate contact", example = "Mosley", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String middleName;

    /**
     * The last name of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The last name of the alternate contact", example = "Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String lastName;

    /**
     * The identifier type code of the identifier
     */
    @JsonProperty(required = false)
    @Schema(description = "The identifier type code of the identifier", example = "SSN", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierTypeCode;

    /**
     * The identifier of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The identifier of the alternate contact", example = "345-34-6434", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierValue;

    /**
     * The phone type code of the phone
     */
    @JsonProperty(required = false)
    @Schema(description = "The phone type code of the phone", example = "MOBILE", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneTypeCode;

    /**
     * The phone number of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The phone number of the member", example = "813-357-9150", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneNumber;

    /**
     * The EMAIL of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The email of the alternate contact", example = "vbalaji215@gmail.com", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String email;

    /**
     * The address line 1 of the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The address line 1 of the address", example = "123 Main Street", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine1;

    /**
     * The address line 2 of the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The address line 2 of the address", example = "Apt 301", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine2;

    /**
     * The city of the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The city of the address", example = "Tampa", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String city;

    /**
     * The state of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The state of the address", example = "FL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String stateTypeCode;

    /**
     * The zip code of the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The zipcode of the address", example = "33556", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String zipCode;

    /**
     * The start date of the alternate contact
     */
    @JsonProperty(required = true)
    @Schema(description = "The start date of the alternate contact", example = "1/1/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the alternate contact
     */
    @JsonProperty(required = false)
    @Schema(description = "The end date of the alternate contact", example = "12/31/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The date when the address was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the address was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the address was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the address was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "AlternateContactDto{" +
                "alternateContactSK=" + alternateContactSK +
                ", memberSK=" + memberSK +
                ", alternateContactCode='" + alternateContactCode + '\'' +
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
                ", zipCode='" + zipCode + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
