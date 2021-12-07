package com.inflearn.desing_pattern.mediator;

public class CleanerService {
    private long towelCount = 100;
    private FrontDesk frontDesk;

    public CleanerService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowel(Integer guestId, int numberOfTowel) {
        int roomNumber = this.frontDesk.getGuestRoomNumber(guestId);
        frontDesk.sendTowel(roomNumber, numberOfTowel);
        this.towelCount -= numberOfTowel;
    }
}
