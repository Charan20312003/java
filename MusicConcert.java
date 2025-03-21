class MusicConcert {
    public static void main(String[] args) {
        Planning.startPlanning();
    }
}

class Planning {
    public static void startPlanning() {
        TicketBooking.openBookings();
    }
}

class TicketBooking {
    public static void openBookings() {
        StageSetup.prepareStage();
    }
}

class StageSetup {
    public static void prepareStage() {
        SoundCheck.performSoundCheck();
    }
}

class SoundCheck {
    public static void performSoundCheck() {
        Concert.startConcert();
    }
}

class Concert {
    public static void startConcert() {
        System.out.println(" The music concert has begun! Enjoy the show! ");
    }
}
