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
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, September 2022
 * Time: 10:11 AM
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
public class MemberAddressDto {

    /**
     * The primary key of the member address
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Address SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberAddressSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The unique code of the member address in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Member Address Code - Unique id that is assigned to the member address in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberAddressCode;

    /**
     * The type of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of the address", example = "Residential", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressTypeCode;

    /**
     * The address line 1 of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The address line 1 of the address", example = "123 Main Street", required = true, accessMode = Schema.AccessMode.READ_WRITE)
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
    @JsonProperty(required = true)
    @Schema(description = "The city of the address", example = "Tampa", required = true, accessMode = Schema.AccessMode.READ_WRITE)
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
    @JsonProperty(required = true)
    @Schema(description = "The zipcode of the address", example = "33556", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String zipCode;

    /**
     * The fips code of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The fips code of the address", example = "12003", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String fipsCode;

    /**
     * The zeus transaction control number of the transaction that created the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the address", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * The start date of the address
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The start date of the address", example = "1/1/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the address
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The end date of the address", example = "12/31/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * Identifies if the address was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the address was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the address was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the address was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the address was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the address was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "MemberAddressDto{" +
                "memberAddressSK=" + memberAddressSK +
                ", memberSK=" + memberSK +
                ", memberAddressCode='" + memberAddressCode + '\'' +
                ", addressTypeCode='" + addressTypeCode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", fipsCode='" + fipsCode + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", source='" + source + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", changed=" + changed +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
