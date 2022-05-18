package com.brihaspathee.zeus.schema.validation;

import com.brihaspathee.zeus.exception.ZeusApiValidationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 2:09 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.schema.validation
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
public class JSONSchemaValidator {

    public void validateJSON(JSONSchemaObject jsonSchemaObject, InputStream inputStream, String apiName) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestString = objectMapper.writeValueAsString(jsonSchemaObject.getSchemaObject());
        //InputStream schemaAsStream = TradingPartnerResource.class.getClassLoader().getResourceAsStream("model/tradingPartner.schema.json");
        JsonSchema schema = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V201909).getSchema(inputStream);
        JsonNode jsonNode = objectMapper.readTree(requestString);
        Set<ValidationMessage> errors = schema.validate(jsonNode);
        String errorsCombined = "";
        for(ValidationMessage validationMessage : errors){
            log.error("Validation Error:{}", validationMessage);
            errorsCombined += validationMessage.toString() + "\n";
        }
        if(errors.size() > 0){
            throw new ZeusApiValidationException(errors, apiName);
        }
    }
}
