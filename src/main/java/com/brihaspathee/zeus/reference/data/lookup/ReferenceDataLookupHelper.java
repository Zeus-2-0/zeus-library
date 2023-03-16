package com.brihaspathee.zeus.reference.data.lookup;

import com.brihaspathee.zeus.reference.data.model.XWalkRequest;
import com.brihaspathee.zeus.reference.data.model.XWalkResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 15, March 2023
 * Time: 9:33 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.reference.data.lookup
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Component
public class ReferenceDataLookupHelper {

    /**
     * The Properties that will be used to read from the properties file
     */
    private final Properties properties;

    /**
     * Constructor method
     * @param properties
     */
    public ReferenceDataLookupHelper(Properties properties) {
        this.properties = properties;
        try{
            properties.load(getClass().getClassLoader().getResourceAsStream("ref-data.properties"));
        }catch (IOException ioe){
            log.error("IOException occurred while loading the ref-data.properties file:{}", ioe.getMessage());
        }
    }

    /**
     * The method that returns the ref data value from the properties file
     * @param xWalkRequest
     * @return
     */
    public XWalkResponse getRefData(XWalkRequest xWalkRequest){
        String refKey = xWalkRequest.getListCode() + "."
                + xWalkRequest.getListTypeName() + "."
                + xWalkRequest.getExternalSourceName();
        log.info("Ref Key:{}", refKey);
        String refValue = properties.getProperty(refKey, "The key provided is not present in the properties file");
        log.info("Ref Value:{}", refValue);
        String [] xWalk = refValue.split("\\.");
        log.info("xwalk:{}", xWalk);
        XWalkResponse xWalkResponse = XWalkResponse.builder()
                .internalListCode(xWalk[0])
                .internalListTypeName(xWalk[1])
                .externalListCode(xWalk[2])
                .externalListTypeName(xWalk[3])
                .externalSourceName(xWalk[4])
                .build();
        return xWalkResponse;
    }


}
