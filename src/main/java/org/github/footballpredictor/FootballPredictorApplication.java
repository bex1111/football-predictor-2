package org.github.footballpredictor;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FootballPredictorApplication
{

    public static void main( String[] args)
    {
         new SpringApplicationBuilder(FootballPredictorApplication.class)
                 .web(WebApplicationType.NONE)
                 .main(FootballPredictorApplication.class)
                 .build();
    }
}
