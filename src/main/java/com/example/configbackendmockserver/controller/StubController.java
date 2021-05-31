package com.example.configbackendmockserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RequestMapping("configbackend")
@RestController()
public class StubController {

    private String apiSettings = "{\n" +
            "  \"sha\" : \"53d1e342112abf1571d6e75d7fdb219d7a1b28d5\",\n" +
            "  \"graphql\" : {\n" +
            "    \"playground\" : {\n" +
            "      \"page-title\" : \"Suedbaden-Api\",\n" +
            "      \"settings\" : {\n" +
            "        \"editor\" : {\n" +
            "          \"theme\" : \"light\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"tabs\" : {\n" +
            "        \"JOURNEY_QUERY\" : {\n" +
            "          \"name\" : \"Journey query\",\n" +
            "          \"query\" : \"classpath:playground/requests/get-journeys-query-max-parameters.graphql\",\n" +
            "          \"variables\" : {\n" +
            "            \"departureLatitude\" : 48.048381,\n" +
            "            \"departureLongitude\" : 8.209198,\n" +
            "            \"arrivalLatitude\" : 48.087517,\n" +
            "            \"arrivalLongitude\" : 7.891595,\n" +
            "            \"dateTime\" : \"2021-05-31T13:00:00+02:00\",\n" +
            "            \"isArrivalDateTime\" : false,\n" +
            "            \"language\" : \"de\"\n" +
            "          },\n" +
            "          \"maxResults\" : 5,\n" +
            "          \"departurePlaceholder\" : \"Start\",\n" +
            "          \"arrivalPlaceholder\" : \"Ziel\",\n" +
            "          \"maxPastDaysInCalendar\" : 0\n" +
            "        },\n" +
            "        \"JOURNEY_SUBSCRIPTION\" : {\n" +
            "          \"name\" : \"Journey subscription\",\n" +
            "          \"query\" : \"classpath:playground/requests/get-journeys-subscription-max-parameters.graphql\",\n" +
            "          \"variables\" : {\n" +
            "            \"departureLatitude\" : 48.048381,\n" +
            "            \"departureLongitude\" : 8.209198,\n" +
            "            \"arrivalLatitude\" : 48.087517,\n" +
            "            \"arrivalLongitude\" : 7.891595,\n" +
            "            \"dateTime\" : \"2021-05-31T13:00:00+02:00\",\n" +
            "            \"isArrivalDateTime\" : false,\n" +
            "            \"language\" : \"de\"\n" +
            "          },\n" +
            "          \"maxResults\" : 5,\n" +
            "          \"departurePlaceholder\" : \"Start\",\n" +
            "          \"arrivalPlaceholder\" : \"Ziel\",\n" +
            "          \"maxPastDaysInCalendar\" : 0\n" +
            "        },\n" +
            "        \"ADDRESS_AUTOCOMPLETION\" : {\n" +
            "          \"name\" : \"Autocomplete addresses query\",\n" +
            "          \"query\" : \"classpath:playground/requests/get-autocomplete-addresses-query-max-parameters.graphql\",\n" +
            "          \"variables\" : {\n" +
            "            \"text\" : \"Am Großhausberg 8\",\n" +
            "            \"language\" : \"de\"\n" +
            "          },\n" +
            "          \"maxResults\" : 10,\n" +
            "          \"layers\" : [ \"venue\", \"address\", \"street\", \"locality\" ]\n" +
            "        },\n" +
            "        \"NEAREST_ADDRESSES\" : {\n" +
            "          \"name\" : \"Nearest addresses query\",\n" +
            "          \"query\" : \"classpath:playground/requests/get-nearest-addresses-query-max-parameters.graphql\",\n" +
            "          \"variables\" : {\n" +
            "            \"longitude\" : 7.891595,\n" +
            "            \"latitude\" : 48.087517,\n" +
            "            \"radiusInKilometers\" : 1.0,\n" +
            "            \"language\" : \"de\"\n" +
            "          },\n" +
            "          \"maxResults\" : 10,\n" +
            "          \"layers\" : [ \"venue\", \"address\", \"street\", \"locality\" ]\n" +
            "        },\n" +
            "        \"NEAREST_STATIONS\" : {\n" +
            "          \"name\" : \"Nearest stations query\",\n" +
            "          \"query\" : \"classpath:playground/requests/get-nearest-stations-query-max-parameters.graphql\",\n" +
            "          \"variables\" : {\n" +
            "            \"longitude\" : 8.209198,\n" +
            "            \"latitude\" : 48.048381,\n" +
            "            \"radiusInKilometers\" : 1.0,\n" +
            "            \"language\" : \"de\"\n" +
            "          },\n" +
            "          \"maxResults\" : 10\n" +
            "        },\n" +
            "        \"ALL_STATIONS\" : {\n" +
            "          \"name\" : \"Get all stations query\",\n" +
            "          \"query\" : \"classpath:graphql/get-all-stations-query.graphql\"\n" +
            "        },\n" +
            "        \"OPERATING_AREA\" : {\n" +
            "          \"name\" : \"Get operating area query\",\n" +
            "          \"query\" : \"classpath:graphql/get-polygon-query.graphql\",\n" +
            "          \"bufferInMetres\" : 0\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

    String putFailedReply = "[ {\n" +
            "  \"calledObject\" : \"NEAREST_ADDRESSES\",\n" +
            "  \"status\" : \"FAILED\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"JOURNEY_QUERY\",\n" +
            "  \"status\" : \"FAILED\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"ADDRESS_AUTOCOMPLETION\",\n" +
            "  \"status\" : \"FAILED\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"NEAREST_STATIONS\",\n" +
            "  \"status\" : \"FAILED\",\n" +
            "  \"throwable\" : null\n" +
            "} ]";

    String putSuccessReply = "[ {\n" +
            "  \"calledObject\" : \"NEAREST_ADDRESSES\",\n" +
            "  \"status\" : \"SUCCESS\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"JOURNEY_QUERY\",\n" +
            "  \"status\" : \"SUCCESS\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"ADDRESS_AUTOCOMPLETION\",\n" +
            "  \"status\" : \"SUCCESS\",\n" +
            "  \"throwable\" : null\n" +
            "}, {\n" +
            "  \"calledObject\" : \"NEAREST_STATIONS\",\n" +
            "  \"status\" : \"SUCCESS\",\n" +
            "  \"throwable\" : null\n" +
            "} ]";

    @CrossOrigin(origins = "http://localhost:8089")
//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<String> getApiSetting() throws IOException {
//        File jsonFile = new File("../configbackendmockserver/src/main/resources/apisettings.json");
        ResponseEntity rpe = new ResponseEntity(apiSettings, HttpStatus.OK);
        return rpe;
    }

    @CrossOrigin(origins = "http://localhost:8089")
//    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public ResponseEntity<String> updateApiSetting(@RequestBody String apiSettingsBody) throws IOException {
        apiSettings = apiSettingsBody;
        ResponseEntity rpe = new ResponseEntity(putSuccessReply, HttpStatus.OK);
//        ResponseEntity rpe = new ResponseEntity(putFailedReply, HttpStatus.OK);

        return rpe;
//        return putSuccessReply;
    }
}
