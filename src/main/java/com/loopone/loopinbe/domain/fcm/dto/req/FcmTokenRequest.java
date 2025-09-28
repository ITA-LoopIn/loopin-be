package com.loopone.loopinbe.domain.fcm.dto.req;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FcmTokenRequest {
    @NotNull(message = "FCM Token은 필수입니다.")
    private String fcmToken;
}
