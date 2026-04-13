public class AuctionDemo {

    public static void main(String[] args) {

        AuctioneerImpl auctioneer = new AuctioneerImpl();

        Bidder bidder1 = new ConcreteBidder("Bidder 1");
        Bidder bidder2 = new ConcreteBidder("Bidder 2");
        Bidder bidder3 = new ConcreteBidder("Bidder 3");

        auctioneer.registerBidder(bidder1);
        auctioneer.registerBidder(bidder2);
        auctioneer.registerBidder(bidder3);

        auctioneer.setNewBid(1000);
        auctioneer.setNewBid(2000);
        auctioneer.setNewBid(3000);
    }
}
