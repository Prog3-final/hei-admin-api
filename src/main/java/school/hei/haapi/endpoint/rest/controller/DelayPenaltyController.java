package school.hei.haapi.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.haapi.endpoint.rest.mapper.DelatyPenaltyMapper;
import school.hei.haapi.endpoint.rest.model.DelayPenalty;
import school.hei.haapi.service.DelayPenaltyService;

@RestController
@AllArgsConstructor
public class DelayPenaltyController {
  private final DelayPenaltyService service;
  private final DelatyPenaltyMapper mapper;

  @GetMapping("/delay_penalty")
  public DelayPenalty getCurrentDelayPenalty() {
    return mapper.toRest(service.getDelayPenalty());
  }
}
