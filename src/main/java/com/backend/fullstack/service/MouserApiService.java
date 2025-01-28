package com.backend.fullstack.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MouserApiService {

    private final RestTemplate restTemplate;

    @Value("${api.mouser.base-url}")
    private String mouserApiUrl;

    @Value("${api.mouser.api-key}")
    private String mouserApiKey;

    public MouserApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Consultamos los productos desde la API de MOuser.
     * @param searchQuery El término de búsqueda.
     * @return La respuesta de la API de Mouser.
     */

    public String searchProducts(String searchQuery) {
        String url = UriComponentsBuilder.fromHttpUrl(mouserApiUrl)
                .path("/search")
                .queryParam("apiKey", mouserApiKey)
                .queryParam("searchTerm", searchQuery)
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }
}
