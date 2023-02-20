package com.sparrow.cms.converter;

import com.sparrow.cms.vo.ChannelItemVO;
import com.sparrow.cms.vo.DetailChannelVO;
import com.sparrow.protocol.enums.StatusRecord;

import com.sparrow.cms.po.ContentMainType;
import com.sparrow.cms.protocol.channel.ChannelSaveParam;
import com.sparrow.utility.BeanUtility;
import com.sparrow.utility.CollectionsUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ChannelConverter {
    public DetailChannelVO po2Vo(ContentMainType channel) {
        if (channel == null) {
            return new DetailChannelVO();
        }
        DetailChannelVO channelVo = new DetailChannelVO();
        BeanUtility.copyProperties(channel, channelVo);
        return channelVo;
    }

    public ChannelItemVO po2ItemVo(ContentMainType channel) {
        if (channel == null) {
            return new ChannelItemVO();
        }
        ChannelItemVO channelItemVo = new ChannelItemVO();
        BeanUtility.copyProperties(channel, channelItemVo);
        return channelItemVo;
    }

    public List<ChannelItemVO> poList2ItemVoList(List<ContentMainType> channelList) {
        if (CollectionsUtility.isNullOrEmpty(channelList)) {
            return Collections.emptyList();
        }
        List<ChannelItemVO> itemVOList = new ArrayList<>(channelList.size());
        for (ContentMainType channel : channelList) {
            itemVOList.add(this.po2ItemVo(channel));
        }
        return itemVOList;
    }

    public ContentMainType param2Po(ChannelSaveParam channelSave) {
        ContentMainType channel = new ContentMainType();
        channel.setListUrl("");
        channel.setDetailUrl("");
        channel.setNewUrl("");
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
