package com.inflearn.desing_pattern.mediator;

public class FrontDesk {

    private CleanerService cleanerService;
    private Guest guest;
    private RestaurantService restaurantService;

    public FrontDesk(CleanerService cleanerService, Guest guest, RestaurantService restaurantService) {
        this.cleanerService = cleanerService;
        this.guest = guest;
        this.restaurantService = restaurantService;
    }

    public void getTowel(Integer guestId, int numberOfTowel) {
        this.cleanerService.getTowel(guestId, numberOfTowel);
    }

    public int getGuestRoomNumber(Integer guestId) {
        System.out.println("여기서 룸넘버 조회해서 그 룸넘버를 리턴해준다.");
        return 0;
    }

    public void sendTowel(int roomNumber, int numberOfTowel) {
        System.out.println("룸 넘버에다가 해당 수건을 넘겨준다.");
    }
}
