import java.util.*;

interface Auctioneer {
    void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders();
}
