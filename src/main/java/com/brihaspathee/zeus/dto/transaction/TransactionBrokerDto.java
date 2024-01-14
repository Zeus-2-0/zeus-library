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
public class TransactionBrokerDto {

    /**
     * The primary key of the broker received in the transaction
     */
    @JsonProperty(required = false)
    @Schema(description = "Broker SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionBrokerSK;

    /**
     * TransactionSK of the transaction the broker is associated
     */
    @JsonProperty(required = false)
    private UUID transactionSK;

    /**
     * The name of the broker
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the broker", example = "John", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String brokerName;

    /**
     * The id of the broker
     */
    @JsonProperty(required = true)
    @Schema(description = "The id of the broker", example = "786-32-6424", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String brokerId;

    /**
     * The name of the agency
     */
    @JsonProperty(required = false)
    @Schema(description = "The name of the agency", example = "Broker Inc.", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String agencyName;

    /**
     * The id of the agency
     */
    @JsonProperty(required = false)
    @Schema(description = "The id of the agency", example = "6234-34-545", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String agencyId;

    /**
     * Account number 1 of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "Account number 1 of the broker", example = "34524553-01", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String accountNumber1;

    /**
     * Account number 2 of the broker
     */
    @JsonProperty(required = false)
    @Schema(description = "Account number 2 of the broker", example = "34524553-02", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String accountNumber2;

    /**
     * The date when the broker was received
     */
    @JsonProperty(required = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="EST" )
    @Schema(description = "The date when the broker was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
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
        return "TransactionBrokerDto{" +
                "transactionBrokerSK=" + transactionBrokerSK +
                ", transactionSK=" + transactionSK +
                ", brokerName='" + brokerName + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", agencyName='" + agencyName + '\'' +
                ", agencyId='" + agencyId + '\'' +
                ", accountNumber1='" + accountNumber1 + '\'' +
                ", accountNumber2='" + accountNumber2 + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
