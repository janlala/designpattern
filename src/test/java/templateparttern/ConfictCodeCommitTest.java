package templateparttern;

public class ConfictCodeCommitTest {
    public static void main(String[] args) {
        ConflictCodeCommit conflictCodeCommit = new ConflictCodeCommit();
        conflictCodeCommit.stepOfCommitCode("abc");
        conflictCodeCommit.stepOfCommitCode("bbb");
    }
}
