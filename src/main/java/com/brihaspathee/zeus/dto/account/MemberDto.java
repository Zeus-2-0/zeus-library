package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 09, September 2022
 * Time: 7:17 PM
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
public class MemberDto {

    /**
     * Primary key of the member table
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberSK;

    /**
     * The primary key of the account that the member is associated
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID accountSK;

    /**
     * A unique code assigned to the member
     */
    @JsonProperty(required = true)
    @Schema(description = "A unique member code", example = "SDG3543SDFG23GF", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberCode;

    /**
     * The first name of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The first name of the member", example = "John", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String firstName;

    /**
     * The middle name of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The middle name of the member", example = "Mosley", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String middleName;

    /**
     * The last name of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The last name of the member", example = "Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String lastName;

    /**
     * The relationship of the member with head of the household
     */
    @JsonProperty(required = true)
    @Schema(description = "The relationship of the member with the head of the household", example = "HOH", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String relationshipTypeCode;

    /**
     * The date of birth of the member
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The date of birth of the member", example = "5/21/1983", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate dateOfBirth;

    /**
     * The gender of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The gender of the member", example = "MALE", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String genderTypeCode;

    /**
     * The height of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The height of the member", example = "5.6", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private double height;

    /**
     * The weight of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The weight of the member in pounds", example = "65.6", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private double weight;

    /**
     * The zeus transaction control number of the transaction that created the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the member", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * Identifies if the member was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the member was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The list of member attributes associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member attributes associated with the member")
    private Set<MemberAttributeDto> memberAttributes;

    /**
     * The list of member addresses associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member addresses associated with the member")
    private Set<MemberAddressDto> memberAddresses;

    /**
     * The list of member identifiers associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member identifiers associated with the member")
    private Set<MemberIdentifierDto> memberIdentifiers;

    /**
     * The list of member languages associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member languages associated with the member")
    private Set<MemberLanguageDto> memberLanguages;

    /**
     * The list of member phones associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member phone numbers associated with the member")
    private Set<MemberPhoneDto> memberPhones;

    /**
     * The list of member emails associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of member emails associated with the member")
    private Set<MemberEmailDto> memberEmails;

    /**
     * The list of alternate contacts associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of alternate contacts associated with the member")
    private Set<AlternateContactDto> alternateContacts;

    /**
     * The list of member premiums associated with the member
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of premiums associated with the member")
    private Set<MemberPremiumDto> memberPremiums;

    /**
     * The date when the member was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the member was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the member was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the member was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "MemberDto{" +
                "memberSK=" + memberSK +
                ", accountSK=" + accountSK +
                ", memberCode='" + memberCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", relationshipTypeCode='" + relationshipTypeCode + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", genderTypeCode='" + genderTypeCode + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", ztcn='" + ztcn + '\'' +
                ", source='" + source + '\'' +
                ", changed=" + changed +
                ", memberAttributes=" + memberAttributes +
                ", memberAddresses=" + memberAddresses +
                ", memberIdentifiers=" + memberIdentifiers +
                ", memberLanguages=" + memberLanguages +
                ", memberPhones=" + memberPhones +
                ", memberEmails=" + memberEmails +
                ", alternateContacts=" + alternateContacts +
                ", memberPremiums=" + memberPremiums +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
