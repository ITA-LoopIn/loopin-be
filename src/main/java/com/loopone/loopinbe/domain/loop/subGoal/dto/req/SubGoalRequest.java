package com.loopone.loopinbe.domain.loop.subGoal.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubGoalRequest {
    private Long mainGoalId;
    private String content;
    private LocalDate deadline;
    private Boolean checked;
}
