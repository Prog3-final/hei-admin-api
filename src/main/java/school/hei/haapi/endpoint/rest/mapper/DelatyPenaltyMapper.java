package school.hei.haapi.endpoint.rest.mapper;

import org.springframework.stereotype.Component;
import school.hei.haapi.endpoint.rest.controller.DelayPenaltyController;
import school.hei.haapi.endpoint.rest.model.DelayPenalty;
import school.hei.haapi.model.Group;

@Component
public class DelatyPenaltyMapper {
  public DelayPenalty toRest (school.hei.haapi.model.DelayPenalty domain){
    return new DelayPenalty()
        .id(domain.getId())
        .interestPercent(domain.getInterestPercent())
        .interestTimerate(domain.getInterestTimeRate())
        .graceDelay(domain.getGraceDelay())
        .applicabilityDelayAfterGrace(domain.getApplicabilityDelayAfterGrace())
        .creationDatetime(domain.getCreationDatetime());
  }
  public DelayPenalty toRestDelay (school.hei.haapi.model.DelayPenalty toUpdate) {
    DelayPenalty delayPenalty = new school.hei.haapi.endpoint.rest.model.DelayPenalty();
    delayPenalty.setInterestPercent(toUpdate.getInterestPercent());
    delayPenalty.setInterestTimerate(toUpdate.getInterestTimeRate());
    delayPenalty.setGraceDelay(toUpdate.getGraceDelay());
    delayPenalty.setApplicabilityDelayAfterGrace(toUpdate.getApplicabilityDelayAfterGrace());

    return delayPenalty;
  }
}
