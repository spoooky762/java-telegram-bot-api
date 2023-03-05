package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

public class ReopenGeneralForumTopic extends BaseRequest<ReopenGeneralForumTopic, BaseResponse> {

    public ReopenGeneralForumTopic(Long chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }

    public ReopenGeneralForumTopic(String chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }

}
