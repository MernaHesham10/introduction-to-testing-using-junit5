package task_wiremock;

import org.junit.jupiter.api.Test;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import org.junit.jupiter.api.extension.RegisterExtension;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

class CalculatorTest {

    @RegisterExtension
    static WireMockExtension wireMock = WireMockExtension.newInstance()
            .options(wireMockConfig().port(8080))
            .build();

    @Test
    void testExternalService() {
        wireMock.stubFor(get(urlEqualTo("/api/data"))
                .willReturn(aResponse().withBody("Hello, WireMock!")));

        // Test code to call the external service
    }
}