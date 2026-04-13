class ConcreteBidder implements Bidder {

    private String bidderName;

    public ConcreteBidder(String name) {
        this.bidderName = name;
    }

    @Override
    public void update(int bidPrice) {
        System.out.println(bidderName + " received updated bid price: " + bidPrice);
    }
}
