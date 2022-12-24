package fitnessClub;

public class MiltiClubMember extends Member{
    private int membershipPoints;

    public MiltiClubMember(char pMemberType, int pMemberId, String pName, double pFees, int pMembershipPoints) {
        super(pMemberType, pMemberId, pName, pFees);
        this.membershipPoints = pMembershipPoints;
    }

    public void setMembershipPoints(int pMembershipPoints) {
        this.membershipPoints = pMembershipPoints;
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }



    @Override
    public String toString() {
        return super.toString() + ", " + membershipPoints;
    }
}
