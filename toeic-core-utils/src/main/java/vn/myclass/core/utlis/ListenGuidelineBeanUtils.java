package vn.myclass.core.utlis;

import vn.myclass.core.dto.ListenGuidelineDTO;
import vn.myclass.core.persistence.enity.ListenGuidelineEntity;

public class ListenGuidelineBeanUtils {
    public static ListenGuidelineDTO entiTy2Dto(ListenGuidelineEntity entity)
    {
        ListenGuidelineDTO dto = new ListenGuidelineDTO();
        dto.setListenguidelineId(entity.getListenguidelineId());
        dto.setContent(entity.getContent());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setModifiedDate(entity.getModifiedDate());
        return dto;
    }
    public static ListenGuidelineEntity dto2Entity(ListenGuidelineDTO dto)
    {
        ListenGuidelineEntity entity = new ListenGuidelineEntity();
        entity.setListenguidelineId(dto.getListenguidelineId());
        entity.setContent(dto.getContent());
        entity.setImage(dto.getImage());
        entity.setTitle(dto.getTitle());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModifiedDate(dto.getModifiedDate());
        return entity;
    }
}
