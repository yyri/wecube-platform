package com.webank.wecube.platform.core.repository.plugin;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.webank.wecube.platform.core.entity.plugin.PluginPackageAttributes;

@Repository
public interface PluginPackageAttributesMapper {
    int deleteByPrimaryKey(String id);

    int insert(PluginPackageAttributes record);

    int insertSelective(PluginPackageAttributes record);

    PluginPackageAttributes selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PluginPackageAttributes record);

    int updateByPrimaryKey(PluginPackageAttributes record);
    
    /**
     * 
     * @param entityId
     * @return
     */
    List<PluginPackageAttributes> selectAllByEntity(@Param("entityId")String entityId);
    
    /**
     * 
     * @param attributeId
     * @return
     */
    List<PluginPackageAttributes> selectAllReferences(@Param("attributeId") String attributeId);
}