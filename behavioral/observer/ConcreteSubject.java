import java.util.*;

class AuctioneerImpl implements Auctioneer {

    private List<Bidder> bidders = new ArrayList<>();
    private int currentBid;

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(currentBid);
        }
    }

    public void setNewBid(int bid) {
        System.out.println("\nAuctioneer announces new bid: " + bid);
        this.currentBid = bid;
        notifyBidders();
    }
}
