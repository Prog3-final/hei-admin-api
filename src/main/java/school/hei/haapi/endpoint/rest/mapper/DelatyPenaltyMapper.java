package school.hei.haapi.endpoint.rest.mapper;

import org.springframework.stereotype.Component;
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
  public DelayPenalty toDomain(school.hei.haapi.model.DelayPenalty toUpdate) {
    var delayPenalty = new school.hei.haapi.endpoint.rest.model.DelayPenalty();
    delayPenalty.setInterestPercent(delayPenalty.getInterestPercent());
    delayPenalty.setInterestTimerate(delayPenalty.getInterestTimerate());
    delayPenalty.setGraceDelay(delayPenalty.getGraceDelay());
    delayPenalty.setApplicabilityDelayAfterGrace(delayPenalty.getApplicabilityDelayAfterGrace());

    return delayPenalty;
  }
}
