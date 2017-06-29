package com.werewolf.roles;
/**
 * Created by DJ on 2017/6/29.
 */
public interface RolesService {
    /**
     * @return
     * 所有可能角色
     */
    public List<String> getAllRoles();

    /**
     * @param String
     * @param num
     * @return
     * 在特定人数下能否有指定角色
     */
    public Boolean canAdd(String,num);
}
