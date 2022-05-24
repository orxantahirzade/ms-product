package az.iktlab.msproduct.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "ms-ads", url = "http://localhost:8080/ads")
public interface AdsClient {

    @PostMapping
    void add(@RequestBody AdsDto adsDto);

    @GetMapping
    List<AdsDto> getAll();
}
