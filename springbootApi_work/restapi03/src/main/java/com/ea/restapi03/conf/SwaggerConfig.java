package com.ea.restapi03.conf;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition (
    info = @Info(
        title = "EA가 만든 USER, MAIN"
        , description = "유저 등록, 수정, 삭제, 조회 등이 가능합니다."
        , version = "v1.0.0"
    )
)

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi groupedOpenApi() {
        String[] paths = {"/users/**"};

        return GroupedOpenApi.builder()
                                .group("USER Controller만 보이는 점 참고")
                                .pathsToMatch(paths)
                                .build();
    }
}
