public class Call {
    /* Minimal rank of employee who can handle this call. */
    private Rank rank;

    /* Person who is calling. */
    private Caller caller;

    /* Employee who is handling call. */
    private Employee handler;

    public Call(Caller c) {
        rank = Rank.LevelOneSupporter;
        caller = c;
    }

    /* Set employee who is handling call. */
    public void setHandler(Employee e) {
        handler = e;
    }

    public void reply(String message) {
        System.out.println(message);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank r) {
        rank = r;
    }

    public Rank incrementRank() {
        if (rank == Rank.LevelOneSupporter) {
            setRank(Rank.LevelTwoSupporter);
        } else if (rank == Rank.LevelTwoSupporter) {
            setRank(Rank.Manager);
        }
        return rank;
    }

    public void disconnect() {
        reply("Thank you for calling");
    }
}
