package com.my.dao;

import com.my.vo.MeetingRoom;
import com.my.vo.RoomDTO;

import java.util.List;

public interface MeetingRoomMapper {

    /**
     * 获取所有的会议室
     *
     * @return MeetingRoom
     */
    List<MeetingRoom> getAllMr();

    /**
     * 根据roomid获取对应的会议室
     *
     * @param roomid roomid
     * @return MeetingRoom
     */
    MeetingRoom getMrById(Integer roomid);

    /**
     * 更新会议房间信息
     *
     * @param meetingRoom MeetingRoom
     * @return Integer
     */
    Integer updateroom(MeetingRoom meetingRoom);

    /**
     * 添加会议室操作
     *
     * @param meetingRoom MeetingRoom
     * @return Integer
     */
    Integer addMr(MeetingRoom meetingRoom);

    /**
     * 得到所有RoomDTO
     *
     * @return List<RoomDTO>
     */
    List<RoomDTO> getAll();

}
