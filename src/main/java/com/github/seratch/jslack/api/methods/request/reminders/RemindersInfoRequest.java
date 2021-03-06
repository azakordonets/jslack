package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemindersInfoRequest implements SlackApiRequest {

    private String token;
    private String reminder;
}