package com.brihaspathee.zeus.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, May 2023
 * Time: 7:49 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountMatchParam {

    /**
     * Account number of the account that is to be matched
     */
    @JsonProperty(required = false)
    @Schema(description = "Account Number",
            example = "IDNTD4VNLJK9VL3",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String accountNumber;

    /**
     * Exchange Subscriber Id of the account that is to be matched
     */
    @JsonProperty(required = false)
    @Schema(description = "Exchange Subscriber Id",
            example = "43525432",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String exchangeSubscriberId;

    /**
     * The state that is associated with the exchange subscriber id
     */
    @JsonProperty(required = false)
    @Schema(description = "State",
            example = "FL",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String stateTypeCode;

    /**
     * The SSN the primary subscriber
     */
    @JsonProperty(required = false)
    @Schema(description = "SSN",
            example = "999-99-9999",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String socialSecurityNumber;

    /**
     * The first name of the subscriber
     */
    @JsonProperty(required = false)
    @Schema(description = "First name of the subscriber",
            example = "John",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String firstName;

    /**
     * The last name of the subscriber
     */
    @JsonProperty(required = false)
    @Schema(description = "Last name of the subscriber",
            example = "Doe",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String lastName;

    /**
     * The gender of the primary subscriber
     */
    @JsonProperty(required = false)
    @Schema(description = "The gender of the primary subscriber",
            example = "MALE",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank
    private String genderTypeCode;

    /**
     * The date of birth of the primary subscriber
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The date of birth of the member", example = "5/21/1983", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate dateOfBirth;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "AccountMatchParam{" +
                "accountNumber='" + accountNumber + '\'' +
                ", exchangeSubscriberId='" + exchangeSubscriberId + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genderTypeCode='" + genderTypeCode + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
