package com.sparrow.cms.converter;

import com.sparrow.protocol.enums.StatusRecord;

import com.sparrow.cms.po.Channel;
import com.sparrow.cms.protocol.channel.ChannelSaveParam;
import org.springframework.stereotype.Component;

@Component
public class ChannelConverter {
    public Channel param2Po(ChannelSaveParam channelSave) {
        Channel channel = new Channel();
        channel.setId(channelSave.getId());
        channel.setName(channelSave.getName());
        channel.setCode(channelSave.getCode());
        channel.setSort(0);
        channel.setCreateUserId(0L);
        channel.setUpdateUserId(0L);
        channel.setCreateTime(0L);
        channel.setUpdateTime(0L);
        channel.setRemark("");
        channel.setStatus(StatusRecord.DISABLE);
        return channel;
    }
}
