package com.tcd.netapp.chatserver.messages.output;

public class LeaveRoomResponse {

	private int roomId;
	private int joinId;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getJoinId() {
		return joinId;
	}

	public void setJoinId(int joinId) {
		this.joinId = joinId;
	}
}
