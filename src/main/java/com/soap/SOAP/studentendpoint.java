package com.soap.SOAP;

import https.www_enicarthage_com.xml.school.StudentDetailsRequest;
import https.www_enicarthage_com.xml.school.StudentDetailsRequestname;
import https.www_enicarthage_com.xml.school.StudentDetailsResponse;
import https.www_enicarthage_com.xml.school.StudentDetailsResponsename;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by oussa on 28/11/2017.
 */
@Endpoint
public class studentendpoint {
    private static final String NAMESPACE_URI = "https://www.enicarthage.com/xml/school";

    private studentrep studentrep ;

    @Autowired
    public studentendpoint(com.soap.SOAP.studentrep studentrep) {
        this.studentrep = studentrep;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getstudent(@RequestPayload StudentDetailsRequest request) {
        StudentDetailsResponse response = new StudentDetailsResponse();
        response.setStudent(studentrep.findstudent(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequestname")
    @ResponsePayload
    public StudentDetailsResponsename moy(@RequestPayload StudentDetailsRequestname request) {
        StudentDetailsResponsename response = new StudentDetailsResponsename();
        response.setStudent(studentrep.findstudent(request.getName()));
        return response;
    }



}
