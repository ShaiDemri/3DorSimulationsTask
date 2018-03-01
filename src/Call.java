public class Call {
    /* Minimal rank of employee who can handle this call. */
    private Rank rank;

    /* Person who's calling. */
    private Caller caller;

    /* Employee who's handling call. */
    private Employee handler;

    public Call(Caller c) {
        rank = Rank.LevelOneSupporter;
        caller = c;
    }

    /* Set employee who's handling call. */
    public void setHandler(Employee e) {
        handler = e;
    }

    public void answer(String message) {
        System.out.println(message);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank r) {
        rank = r;
    }

    public Rank escalateRank() {
        if (rank == Rank.LevelOneSupporter) {
            setRank(Rank.LevelTwoSupporter);
        } else if (rank == Rank.LevelTwoSupporter) {
            setRank(Rank.Manager);
        }
        return rank;
    }
}
