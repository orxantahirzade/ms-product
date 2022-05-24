package az.iktlab.msproduct.service;

import az.iktlab.msproduct.client.AdsClient;
import az.iktlab.msproduct.client.AdsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final AdsClient client;

    public ProductService(AdsClient client) {
        this.client = client;
    }

    public void add(AdsDto adsDto) {
        client.add(adsDto);
    }

    public List<AdsDto> getAll() {
        return client.getAll();
    }

}
