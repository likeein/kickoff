package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.MessageDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public void insertMessage(MessageDO messageDO) throws Exception {
        messageMapper.insertMessage(messageDO);
    }
}
