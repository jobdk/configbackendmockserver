package com.example.configbackendmockserver;

import com.example.configbackendmockserver.controller.StubController;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    StubController classUndertest = new StubController();


    @Test
    void _test() throws IOException {
        hello();
    }


    void hello() throws IOException {
        String apiSettings = "{\n" +
                "  \"sha\": \"9252f9ad7f01b5d80e2c346fd9140fdedf47f378\",\n" +
                "  \"graphql\": {\n" +
                "    \"playground\": {\n" +
                "      \"page-title\": \"Suedbaden-Api\",\n" +
                "      \"settings\": {\n" +
                "        \"editor\": {\n" +
                "          \"theme\": \"light\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"tabs\": {\n" +
                "        \"JOURNEY_QUERY\": {\n" +
                "          \"name\": \"Journey query\",\n" +
                "          \"query\": \"classpath:playground/requests/get-journeys-query-max-parameters.graphql\",\n" +
                "          \"variables\": {\n" +
                "            \"departureLatitude\": 48.048381,\n" +
                "            \"departureLongitude\": 8.209198,\n" +
                "            \"arrivalLatitude\": 48.087517,\n" +
                "            \"arrivalLongitude\": 7.891595,\n" +
                "            \"dateTime\": \"2021-03-17T13:00:00+02:00\",\n" +
                "            \"isArrivalDateTime\": false,\n" +
                "            \"language\": \"de\"\n" +
                "          },\n" +
                "          \"maxResults\": 5,\n" +
                "          \"departurePlaceholder\": \"Start\",\n" +
                "          \"arrivalPlaceholder\": \"Ziel\",\n" +
                "          \"maxPastDaysInCalendar\": 0\n" +
                "        },\n" +
                "        \"JOURNEY_SUBSCRIPTION\": {\n" +
                "          \"name\": \"Journey subscription\",\n" +
                "          \"query\": \"classpath:playground/requests/get-journeys-subscription-max-parameters.graphql\",\n" +
                "          \"variables\": {\n" +
                "            \"departureLatitude\": 48.048381,\n" +
                "            \"departureLongitude\": 8.209198,\n" +
                "            \"arrivalLatitude\": 48.087517,\n" +
                "            \"dateTime\": \"2021-03-17T13:00:00+02:00\",\n" +
                "            \"isArrivalDateTime\": false,\n" +
                "            \"language\": \"de\"\n" +
                "          },\n" +
                "          \"maxResults\": 5,\n" +
                "          \"departurePlaceholder\": \"Start\",\n" +
                "          \"arrivalPlaceholder\": \"Ziel\",\n" +
                "          \"maxPastDaysInCalendar\": 0\n" +
                "        },\n" +
                "        \"ADDRESS_AUTOCOMPLETION\": {\n" +
                "          \"name\": \"Autocomplete addresses query\",\n" +
                "          \"query\": \"classpath:playground/requests/get-autocomplete-addresses-query-max-parameters.graphql\",\n" +
                "          \"variables\": {\n" +
                "            \"text\": \"Freiburg im Breisgau\",\n" +
                "            \"language\": \"de\"\n" +
                "          },\n" +
                "          \"maxResults\": 10,\n" +
                "          \"layers\": [\n" +
                "            \"venue\",\n" +
                "            \"address\",\n" +
                "            \"street\",\n" +
                "            \"locality\"\n" +
                "          ]\n" +
                "        },\n" +
                "        \"NEAREST_ADDRESSES\": {\n" +
                "          \"name\": \"Nearest addresses query\",\n" +
                "          \"query\": \"classpath:playground/requests/get-nearest-addresses-query-max-parameters.graphql\",\n" +
                "          \"variables\": {\n" +
                "            \"longitude\": 8.209198,\n" +
                "            \"latitude\": 48.048381,\n" +
                "            \"radiusInKilometers\": 1.0,\n" +
                "            \"language\": \"de\"\n" +
                "          },\n" +
                "          \"maxResults\": 10,\n" +
                "          \"layers\": [\n" +
                "            \"venue\",\n" +
                "            \"address\",\n" +
                "            \"street\",\n" +
                "            \"locality\"\n" +
                "          ]\n" +
                "        },\n" +
                "        \"NEAREST_STATIONS\": {\n" +
                "          \"name\": \"Nearest stations query\",\n" +
                "          \"query\": \"classpath:playground/requests/get-nearest-stations-query-max-parameters.graphql\",\n" +
                "          \"variables\": {\n" +
                "            \"longitude\": 8.209198,\n" +
                "            \"latitude\": 48.048381,\n" +
                "            \"radiusInKilometers\": 1.0,\n" +
                "            \"language\": \"de\"\n" +
                "          },\n" +
                "          \"maxResults\": 10\n" +
                "        },\n" +
                "        \"ALL_STATIONS\": {\n" +
                "          \"name\": \"Get all stations query\",\n" +
                "          \"query\": \"classpath:graphql/get-all-stations-query.graphql\"\n" +
                "        },\n" +
                "        \"OPERATING_AREA\": {\n" +
                "          \"name\": \"Get operating area query\",\n" +
                "          \"query\": \"classpath:graphql/get-polygon-query.graphql\",\n" +
                "          \"bufferInMetres\": 0\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
        File jsonFile = new File("../configbackendmockserver/src/main/resources/apisettings.json");
//        jsonFile.delete();
        File updatedFile = new File(apiSettings);


        FileWriter fileWriter = new FileWriter(updatedFile);
        fileWriter.write(String.valueOf(jsonFile));
    }
}
