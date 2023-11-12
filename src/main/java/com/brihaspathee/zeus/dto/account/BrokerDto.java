package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2022
 * Time: 11:27 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerDto {

    /**
     * The primary key of the broker in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Broker SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID brokerSK;

    /**
     * The account key of the account that the enrollment span is associated with
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    @Null
    private UUID accountSK;

    /**
     * The unique code of the broker
     */
    @JsonProperty(required = true)
    @Schema(description = "Broker Code - Unique id that is assigned to the broker in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String brokerCode;

    /**
     * The name of the broker
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the broker", example = "John Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String brokerName;

    /**
     * The id of the broker
     */
    @JsonProperty(required = true)
    @Schema(description = "The id of the broker", example = "923-53-6234", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String brokerId;

    /**
     * The agency name of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "The name of the agency", example = "Broker Inc", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String agencyName;

    /**
     * The agency id of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "The id of the agency", example = "923-53-6234", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String agencyId;

    /**
     * The first account number of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "The account number 1 of the broker", example = "23452345562", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String accountNumber1;

    /**
     * The second account number of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "The account number 2 of the broker", example = "23452345562", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String accountNumber2;

    /**
     * The start date of the broker
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Start date of the broker", example = "1/1/2022", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the broker
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "End date of the broker", example = "12/31/2022", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * Identifies if the broker was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the broker was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the account was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the account was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "BrokerDto{" +
                "brokerSK=" + brokerSK +
                ", accountSK=" + accountSK +
                ", brokerCode='" + brokerCode + '\'' +
                ", brokerName='" + brokerName + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", agencyName='" + agencyName + '\'' +
                ", agencyId='" + agencyId + '\'' +
                ", accountNumber1='" + accountNumber1 + '\'' +
                ", accountNumber2='" + accountNumber2 + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
