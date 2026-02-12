class SocialMedia {
    void post() {
        System.out.println("Posting on social media...");
    }
}

class Instagram extends SocialMedia {
    @Override
    void post() {
        System.out.println("Posting a photo on Instagram 📸");
    }
}

class Twitter extends SocialMedia {
    @Override
    void post() {
        System.out.println("Tweeting on Twitter 🐦");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        SocialMedia sm1 = new Instagram();
        SocialMedia sm2 = new Twitter();
        sm1.post();   // Instagram version
        sm2.post();   // Twitter version
    }
}
